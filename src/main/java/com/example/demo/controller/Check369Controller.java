
package com.example.demo.controller;

import com.example.demo.service.Check369Service;
import com.example.demo.service.FindFlagService;
import com.example.demo.service.FindRackService;
import com.example.demo.service.FindSnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class Check369Controller {
	 @Autowired
	 private Check369Service check369Service;

	@GetMapping("/check369")
	private ModelAndView check369() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("check369");
		return mav;
	}

	 @PostMapping("/api/check369")
	 public Map<String, Object> check369(@RequestBody Map<String, Object> paramMap) throws Exception {
	 	System.out.println(paramMap);
	 	return check369Service.check369(paramMap);
	 }
 
}


