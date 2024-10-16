
package com.example.demo.controller;
import com.example.demo.service.FindRackService;
import com.example.demo.service.FindFlagService;
import com.example.demo.service.FindSnakeService;
import com.example.demo.service.FindBinggoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class FindRackGameController {
	 @Autowired
	 private FindRackService findRackService;
	 @Autowired
	 private FindFlagService findFlagService;
	 @Autowired
	 private FindSnakeService findSnakeService;
	 @Autowired
	 private FindBinggoService findBinggoService;
	 
	 @PostMapping("/findRockGame")
	 public Map<String, Object> findRockGame(@RequestBody Map<String, Object> numbers) throws Exception {
		 Map<String, Object> result = findRackService.findRockGame(numbers);
	 return result;
	 }
	 
	 @PostMapping("/findFlagGame")
	 public Map<String, Integer> findFlagGame(@RequestBody Map<String, Integer> numbers) throws Exception {
		 Map<String, Integer> result = findFlagService.findFlagGame(numbers);
	 return result;
	 }
	 
	 @PostMapping("/findSnakeGame")
	 public Map<String, Integer> findSnakeGame(@RequestBody Map<String, Integer> numbers) throws Exception {
		 Map<String, Integer> result = findSnakeService.findSnakeGame(numbers);
	 return result;
	 }
	 
	 @PostMapping("/findBinggoGame")
	 public Map<String, Object> findBinggoGame(@RequestBody Map<String, Object> data) throws Exception {
		 // num1과 num2 각각을 추출
		 Map<String, Object> num1 = (Map<String, Object>) data.get("num1");
		 Map<String, Object> num2 = (Map<String, Object>) data.get("num2");
		 System.out.println("num1: " + num1);
		 System.out.println("num2: " + num2);

		 Map<String, Object> result = findBinggoService.findBinggoGame(data);
		 //return findBinggoService.findBinggoGame(num1);
		 return result;
	 }
 
}


