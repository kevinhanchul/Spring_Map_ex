
package com.example.demo.controller;

import com.example.demo.service.FindBinggoService;
import com.example.demo.service.FindFlag2Service;
import com.example.demo.service.FindRackService;
import com.example.demo.service.FindSnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class FindFlagGame2Controller {
	 @Autowired
	 private FindFlag2Service findFlag2Service;

	@GetMapping("/findFlagGame2")
	private ModelAndView findFlagGame2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("findFlagGame2");
		return mav;
	}

	 @PostMapping("/api/findFlagGame2")
	 public Map<String, Object> findFlagGame2(@RequestBody Map<String, Integer> numbers) throws Exception {

		 System.out.println("numbers : " + numbers);
		 Map<String, Object> result = findFlag2Service.findFlagGame(numbers);
		 System.out.println("result : " + result);

	 return result;
	 }
}


