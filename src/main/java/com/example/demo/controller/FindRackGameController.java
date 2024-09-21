
package com.example.demo.controller;
import com.example.demo.service.FindRackService;
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
	 
	 @PostMapping("/findRockGame")
	 public Map<String, Object> findRockGame(@RequestBody Map<String, Object> numbers) throws Exception {
		 Map<String, Object> result = findRackService.findRockGame(numbers);
	 return result;
	 }
 
}


