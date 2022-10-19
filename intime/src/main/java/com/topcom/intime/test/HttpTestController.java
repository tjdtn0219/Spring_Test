package com.topcom.intime.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topcom.intime.model.User;

@RestController
public class HttpTestController {

	private static final String TAG = "HttpTestController : ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		User user = new User(1, "jss", "123", "email");
		System.out.println(TAG + "getter : " + user.getId());
		user.setId(2);
		System.out.println(TAG + "getter : " + user.getId());
		return "home.html";
	}
	
	@GetMapping("/http/get")
	public String getTest(User user) {
		return "get요청" + user.getId() + "," + user.getUsername() + "," +  user.getPassword() + "," + user.getEmail() + ".";
	}

	@PostMapping("/http/post")
	public String postTest(User user) {
		return "post요청" + user.getId() + "," + user.getUsername() + "," +  user.getPassword() + "," + user.getEmail() + ".";
	}

	@PutMapping("/http/put")
	public String putTest() {
		return "put요청";
	}

	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete요청";
	}
}
