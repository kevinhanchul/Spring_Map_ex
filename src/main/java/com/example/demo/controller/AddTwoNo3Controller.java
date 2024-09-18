
package com.example.demo.controller;
import com.example.demo.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class AddTwoNo3Controller {
  /*@Autowired
  private CalculationService calculationService;
  @PostMapping("/add")
  public Map<String, Integer> addNumbers(@RequestBody Map<String, Integer> numbers) throws Exception {
      int result = calculationService.add(numbers);
      Map<String, Integer> response = new HashMap<>();
      response.put("result", result);
      return response;
  }*/
}

