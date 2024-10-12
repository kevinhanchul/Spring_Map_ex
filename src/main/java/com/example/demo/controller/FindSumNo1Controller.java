
package com.example.demo.controller;

import com.example.demo.service.FindSumNo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class FindSumNo1Controller {
 @Autowired
 private FindSumNo1Service findSumNo1Service;

    @GetMapping("/findSumNo1")
    private ModelAndView findSumNo1() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("findSumNo1");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/api/findSumNo1")
    public Map<String, Integer> findSumNo1(@RequestBody Map<String, Integer> numbers) throws Exception {
        Map<String, Integer> result = findSumNo1Service.findSumNo1(numbers);
        return result;
    }

}


