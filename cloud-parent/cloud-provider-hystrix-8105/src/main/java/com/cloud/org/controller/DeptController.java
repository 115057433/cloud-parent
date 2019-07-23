package com.cloud.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.org.entity.Dept;
import com.cloud.org.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {

	@Autowired	
	private DeptService deptService;
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value="/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept) {	
		return deptService.add(dept);
	}
	
	
	@RequestMapping(value="/dept/get/{deptId}",method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(Dept dept) {
		Dept dept2 = deptService.get(dept);
		if(dept2 == null) {
			throw new RuntimeException("该ID:"+dept2.getDeptId()+"没有对应的信息");
		}
		return dept2;
	}
	
	
	public Dept processHystrix_Get(Dept dept) {
		System.out.println("进入熔断");
		return new Dept();
	}
	
	@RequestMapping(value="/dept/list",method = RequestMethod.GET)
	public List<Dept> list(Dept dept) {
		return deptService.list(dept);
	}
	
	
	@RequestMapping(value="/dept/discovery",method = RequestMethod.GET)
	public Object discovery() {
		List<String>servList = client.getServices();
		System.out.println("************"+servList);
		List<ServiceInstance>insList = client.getInstances("cloud-dept");
		for(ServiceInstance services:insList) {
			System.out.println(services.getServiceId()+"\t"+services.getHost()+"\t"+services.getPort()
			+"\t"+services.getUri());
		}
		return this.client;
	}
}
