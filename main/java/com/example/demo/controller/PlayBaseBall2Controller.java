
package com.example.demo.controller;

import com.example.demo.service.PlayBaseBall2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class PlayBaseBall2Controller {
	@Autowired
	private PlayBaseBall2Service playBaseBall2Service;

	@GetMapping("/playBaseBall2")
	private ModelAndView playBaseBall2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("playBaseBall2");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}
/*
	@PostMapping("/api/playBaseBall2")
	public Map<String, Object> getPlayBaseBall2(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
		return playBaseBall2Service.getPlayBaseBall2(paramMap);
	}*/
}


