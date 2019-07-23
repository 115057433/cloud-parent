package com.cloud.org.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cloud.org.entity.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dept get(long id) {
				// TODO Auto-generated method stub
				System.out.println("来自fallbackfactory的熔断");
				return null;
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}



}
