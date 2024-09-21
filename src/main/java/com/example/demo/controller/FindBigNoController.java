
package com.example.demo.controller;
import com.example.demo.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class FindBigNoController {
 @Autowired
 private CalculationService calculationService;
 
 @PostMapping("/findBigNo")
 public Map<String, Integer> findBigNo(@RequestBody Map<String, Integer> numbers) throws Exception {
	  Map<String, Integer> result = calculationService.findBigNo(numbers);
     return result;
 }
}
