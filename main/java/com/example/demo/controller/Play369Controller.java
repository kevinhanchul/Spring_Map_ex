
package com.example.demo.controller;

import com.example.demo.service.Play369Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class Play369Controller {
	 @Autowired
	 private Play369Service play369Service;

	@GetMapping("/play369")
	private ModelAndView play369() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("play369");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/play369")
	 public Map<String, Object> play369(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return play369Service.play369(paramMap);
	 }
 
}


