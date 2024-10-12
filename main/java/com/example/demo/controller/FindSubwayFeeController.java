
package com.example.demo.controller;

import com.example.demo.service.FindSubwayFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class FindSubwayFeeController {
	 @Autowired
	 private FindSubwayFeeService findSubwayFeeService;

	@GetMapping("/findSubwayFee")
	private ModelAndView findSubwayFee() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("findSubwayFee");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/findSubwayFee")
	 public Map<String, Object> findSubwayFee(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return findSubwayFeeService.findSubwayFee(paramMap);
	 }
 
}


