package com.sufa.x1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.PriorityQueue;

/**
 * @author LIDAREN
 */
@SpringBootApplication
public class X1Application {

	public static void main(String[] args) {
		SpringApplication.run(X1Application.class, args);
        PriorityQueue<Integer> head = new PriorityQueue<>();
	}

}
