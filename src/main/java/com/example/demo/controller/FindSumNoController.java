
package com.example.demo.controller;

import com.example.demo.service.FindSumNoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class FindSumNoController {
 @Autowired
 private FindSumNoService findSumNoService;

    @GetMapping("/findSumNo")
    private ModelAndView findSumNo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("findSumNo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/api/findSumNo")
    public Map<String, Integer> findSumNo(@RequestBody Map<String, Integer> numbers) throws Exception {
        Map<String, Integer> result = findSumNoService.findSumNo(numbers);
        return result;
    }

}


