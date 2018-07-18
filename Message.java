package com.ojw.djenk;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{appId}")
public class Message {

	@GetMapping("/messages")
	public ResponseEntity<?>  getMessagesByRoom() {
	
		Long time = System.currentTimeMillis();
		return ResponseEntity.ok("Here I am : " + time);
	}
}
