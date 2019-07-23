package com.cloud.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloud.org.entity.Dept;
import com.cloud.org.mapper.DeptMapper;
import com.cloud.org.service.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService{
	
	@Autowired	
	private DeptMapper deptMapper;

	@Override
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		if(deptMapper.addDept(dept)>0) {
			return true;
		}else {
			return false;			
		}
	}

	@Override
	public Dept get(Dept dept) {
		// TODO Auto-generated method stub
		return deptMapper.getDeptById(dept);
	}

	@Override
	public List<Dept> list(Dept dept) {
		// TODO Auto-generated method stub
		return deptMapper.findAll(dept);
	}

}
