package com.yeo.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QuickstartApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
