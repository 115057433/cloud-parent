package com.cloud.org.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cloud.org.entity.Dept;

@Mapper
public interface DeptMapper {

	/**
	 * 新增dept
	 * @param dept
	 * @return
	 */
	public int addDept(Dept dept);
	
	/**
	 * 查询对象dept
	 * @param dept
	 * @return
	 */
	public Dept getDeptById(Dept dept);
	
	/**
	 * 查询列表
	 * @param dept
	 * @return
	 */
	public List<Dept> findAll(Dept dept);
}
