package com.kisho.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ={"com.kisho.demoApp"}  )
public class DemoAppApplication {

	public static void main(String[] args)
	{

		SpringApplication.run(DemoAppApplication.class, args);
	}

}
