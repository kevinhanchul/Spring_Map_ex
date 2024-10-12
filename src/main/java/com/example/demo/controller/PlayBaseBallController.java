
package com.example.demo.controller;

import com.example.demo.service.PlayBaseBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class PlayBaseBallController {
	 @Autowired
	 private PlayBaseBallService playBaseBallService;

	@GetMapping("/playBaseBall")
	private ModelAndView playBaseBall() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("playBaseBall");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/playBaseBall")
	 public Map<String, Object> playBaseBall(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return playBaseBallService.playBaseBall(paramMap);
	 }
 
}


