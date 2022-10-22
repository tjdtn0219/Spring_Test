package com.topcom.intime.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test/test1")
	public String test() {
		return "<h1>testtestsets1212</h1>";
	}
}
