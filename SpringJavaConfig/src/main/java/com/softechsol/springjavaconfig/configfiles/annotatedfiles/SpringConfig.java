package com.softechsol.springjavaconfig.configfiles.annotatedfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SomeConfig.class)
public class SpringConfig {

	@Bean
	public Service service() {
		Service ser = new Service();
		return ser;

	}

}
