package com.cloud.org.service;

import java.util.List;

import com.cloud.org.entity.Dept;

public interface DeptService {

	
	public boolean add(Dept dept);
	
	public Dept get(Dept dept);
	
	public List<Dept> list(Dept dept);
}
