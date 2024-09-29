
package com.example.demo.controller;
import com.example.demo.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class FindOddNoController {
 @Autowired
 private CalculationService calculationService;

    @PostMapping("/findSumNo")
    public Map<String, Integer> findSumNo(@RequestBody Map<String, Integer> numbers) throws Exception {
        Map<String, Integer> result = calculationService.findSumNo(numbers);
        return result;
    }

    @PostMapping("/findOddNo")
        public Map<String, Object> findOddNo(@RequestBody Map<String, Integer> numbers) throws Exception {
        return calculationService.findOddNo(numbers);
    }

}


