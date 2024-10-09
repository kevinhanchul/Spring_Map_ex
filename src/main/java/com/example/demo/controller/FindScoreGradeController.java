
package com.example.demo.controller;

import com.example.demo.service.FindScoreGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class FindScoreGradeController {
	 @Autowired
	 private FindScoreGradeService findScoreGradeService;

	@GetMapping("/findScoreGrade")
	private ModelAndView findScoreGrade() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("findScoreGrade");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/findScoreGrade")
	 public Map<String, Object> findScoreGrade(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return findScoreGradeService.findScoreGrade(paramMap);
	 }
 
}


