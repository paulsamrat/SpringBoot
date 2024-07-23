package com.learn.springboot.entity;

import org.springframework.stereotype.Component;

@Component
public class Animal {
	
	private String name;
	
	public void hello() {
		System.out.println(" hello animal hello ....");
	}
}
