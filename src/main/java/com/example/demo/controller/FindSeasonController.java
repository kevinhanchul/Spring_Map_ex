
package com.example.demo.controller;

import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class FindSeasonController {
	 @Autowired
	 private FindSeasonService findSeasonService;
	 
	 @PostMapping("/findSeason")
	 public Map<String, Object> findSeason(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return findSeasonService.findSeason(paramMap);
	 }
 
}


