
package com.example.demo.controller;

import com.example.demo.service.PlayGoStopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class PlayGoStopController {
	 @Autowired
	 private PlayGoStopService playGoStopService;

	@GetMapping("/playGoStop")
	private ModelAndView playGoStop() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("playGoStop");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/playGoStop")
	 public Map<String, Object> playGoStop(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return playGoStopService.playGoStop(paramMap);
	 }
 
}


