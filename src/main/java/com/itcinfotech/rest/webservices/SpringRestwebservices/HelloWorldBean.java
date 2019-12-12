package com.itcinfotech.rest.webservices.SpringRestwebservices;

public class HelloWorldBean {

	private String hello;
	public HelloWorldBean(String string) {
		this.hello=string;
	}
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}

}
