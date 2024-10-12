
package com.example.demo.controller;

import com.example.demo.service.SubwayLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class SubwayLineController {
	 @Autowired
	 private SubwayLineService subwayLineService;

	@GetMapping("/subwayLine")
	private ModelAndView subwayLine() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("subwayLine");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/subwayLine")
	 public Map<String, Object> subwayLine(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return subwayLineService.subwayLine(paramMap);
	 }
}


