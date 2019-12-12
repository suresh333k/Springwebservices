package com.itcinfotech.rest.webservices.SpringRestwebservices;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path="/mvc")
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String returnHello()
	{
		return "Hello world ;;";
	}
	
	@GetMapping(path="/hello-world-bean")
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public HelloWorldBean returnHelloBean()
	{
		return new HelloWorldBean("Hello world bean");
	}

	@GetMapping(path="/hello-world/path-variable/{name}")
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String returnHelloPathVariable(@PathVariable String name)
	{
		return "Hello world "+name;
	}
	
	//@DeleteMapping(path="/hello-world/path-variable/{name}")
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@DeleteMapping(path="/hello-world/delete-variable/{name}")
	public String deleteVariable(@PathVariable String name)
	{
		return "Hello world "+name;
	}
}
