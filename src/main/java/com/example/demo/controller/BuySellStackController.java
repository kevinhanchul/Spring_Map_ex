
package com.example.demo.controller;

import com.example.demo.service.BuySellStackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class BuySellStackController {
	 @Autowired
	 private BuySellStackService buySellStackService;

	@GetMapping("/buySellStack")
	private ModelAndView buySellStack() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("buySellStack");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/buySellStack")
	 public Map<String, Object> buySellStack(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return buySellStackService.buySellStack(paramMap);
	 }
 
}


