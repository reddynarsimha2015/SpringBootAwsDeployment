package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Student {
	 @GetMapping("/findAllproducts")
		public String getAllProducts() {
			 
			return "Hello welcome to spring boot";
		 
		}
}
