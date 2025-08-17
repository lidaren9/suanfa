package com.sufa.x1;

import org.springframework.boot.SpringApplication;

public class TestX1Application {

	public static void main(String[] args) {
		SpringApplication.from(X1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
