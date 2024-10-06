
package com.example.demo.controller;

import com.example.demo.service.FindScoreGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class FindScoreGradeController {
	 @Autowired
	 private FindScoreGradeService findScoreGradeService;
	 
	 @PostMapping("/findScoreGrade")
	 public Map<String, Object> findScoreGrade(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return findScoreGradeService.findScoreGrade(paramMap);
	 }
 
}


