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
	public Dept get(Dept dept) {
		return deptService.get(dept);
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
