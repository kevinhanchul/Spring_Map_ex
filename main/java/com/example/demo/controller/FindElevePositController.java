
package com.example.demo.controller;

import com.example.demo.service.FindElevePositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.ArrayList;

@RestController
//@RequestMapping("/api")
public class FindElevePositController {
	 @Autowired
	 private FindElevePositService findElevePositService;

	@GetMapping("/findElevePosit")
	private ModelAndView findElevePosit() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("findElevePosit");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/findElevePosit")
	 public Map<String, Object> findElevePosit(@RequestBody Map<String, Object> paramMap) throws Exception {
		 System.out.println(paramMap);
	 	return findElevePositService.findElevePosit(paramMap);
	 }
 
}


