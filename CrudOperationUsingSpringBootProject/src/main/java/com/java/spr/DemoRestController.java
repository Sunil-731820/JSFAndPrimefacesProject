package com.java.spr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoRestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello this is the first EXample ";
	}
	
	@GetMapping("/Hi")
	public String Hi() {
		System.out.println("This is The EXample Of The Spring Boot projects And calling The methiod ofd the Hi : =");
		return "This Msg from HI Methods ";
	}
	
	@GetMapping("/Try")
	public String Try() {
		return "i am trying To Make the Spring Boot projects " ;
	}
	
	@GetMapping("/firstPage")
	public String firstpageInHTML() {
		return "firstPage";
	}

	
	@GetMapping("/hello1")
	public String helloPage() {
		return "helloPage";
	}
	
	@RequestMapping("/ind")
	public String getPage() {
		return "index";
	}
}
