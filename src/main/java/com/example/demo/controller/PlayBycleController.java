
package com.example.demo.controller;

import com.example.demo.service.PlayBycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class PlayBycleController {
	 @Autowired
	 private PlayBycleService playBycleService;

	@GetMapping("/playBycle")
	private ModelAndView playBycle() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("playBycle");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/playBycle")
	 public Map<String, Object> playBycle(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return playBycleService.playBycle(paramMap);
	 }
 
}


