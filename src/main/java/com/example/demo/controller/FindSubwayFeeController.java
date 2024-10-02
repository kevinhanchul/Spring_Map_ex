
package com.example.demo.controller;

import com.example.demo.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class FindSubwayFeeController {
 @Autowired
 private CalculationService calculationService;

    @PostMapping("/findSubwayFee")
    public Map<String, Integer> findSubwayFee(@RequestBody Map<String, Integer> numbers) throws Exception {
        return calculationService.findSubwayFee(numbers);
    }

}


