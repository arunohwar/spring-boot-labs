package com.springboot.basics.employee;

public class EmployeeV1 {
	
	private final long id;
	private final String name;

	public EmployeeV1(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
