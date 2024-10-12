
package com.example.demo.controller;

import com.example.demo.service.PlayBallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class PlayBallingController {
	 @Autowired
	 private PlayBallingService playBallingService;

	@GetMapping("/playBalling")
	private ModelAndView playBalling() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("playBalling");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/playBalling")
	 public Map<String, Object> playBalling(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return playBallingService.playBalling(paramMap);
	 }
 
}


