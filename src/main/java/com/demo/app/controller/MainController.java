package com.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/cloud")
	public String showCloud() {
		return "hello cloud";
	}
}
