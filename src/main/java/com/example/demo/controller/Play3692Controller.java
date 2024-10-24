
package com.example.demo.controller;

import com.example.demo.service.Play3692Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class Play3692Controller {
	 @Autowired
	 private Play3692Service play3692Service;

	@GetMapping("/play3692")
	private ModelAndView play3692() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("play3692");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/play3692")
	 public Map<String, Object> play369(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return play3692Service.play369(paramMap);
	 }
 
}


