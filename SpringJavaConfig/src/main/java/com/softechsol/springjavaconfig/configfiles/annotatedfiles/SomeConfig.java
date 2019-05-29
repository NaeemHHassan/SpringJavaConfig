package com.softechsol.springjavaconfig.configfiles.annotatedfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfig {

	@Bean
	public Integer getInt() {
		Integer integer = new Integer(22);
		return integer;

	}
}
