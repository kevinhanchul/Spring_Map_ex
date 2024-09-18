
package com.example.demo.controller;
import com.example.demo.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class FindOddNoController {
 @Autowired
 private CalculationService calculationService;
 @PostMapping("/findBigNo")
 public Map<String, Integer> addNumbers(@RequestBody Map<String, Integer> numbers) throws Exception {
	  Map<String, Integer> result = calculationService.findBigNo(numbers);
     return result;
 }
}
