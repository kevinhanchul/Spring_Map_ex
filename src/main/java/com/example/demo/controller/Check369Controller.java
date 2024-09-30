
package com.example.demo.controller;

import com.example.demo.service.FindBinggoService;
import com.example.demo.service.FindFlagService;
import com.example.demo.service.FindRackService;
import com.example.demo.service.FindSnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class Check369Controller {
	 @Autowired
	 private FindRackService findRackService;

	 @PostMapping("/check369")
	 public Map<String, Object> check369(@RequestBody Map<String, Object> numbers) throws Exception {

	 return check369Service.check369(numbers);
	 }
 
}


