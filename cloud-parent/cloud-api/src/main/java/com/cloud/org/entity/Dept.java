package com.cloud.org.entity;

import java.io.Serializable;

public class Dept implements Serializable{

	private static final long serialVersionUID = 8203958634669892725L;

	private String deptId;
	
	private String deptName;
	
	private String deptDataSource;
	
	public Dept() {}

	public Dept(String deptId, String deptName, String deptDataSource) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptDataSource = deptDataSource;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDataSource() {
		return deptDataSource;
	}

	public void setDeptDataSource(String deptDataSource) {
		this.deptDataSource = deptDataSource;
	}
	
	
}
