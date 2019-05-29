package com.softechsol.springjavaconfig.configfiles.annotatedfiles;

import org.springframework.stereotype.Component;

@Component
public class Service implements Dao {

	public boolean create() {
		System.out.println("User Createed");
		return true;
	}

	public boolean delete() {
		System.out.println("User Deleted");
		return !false;
	}

}
