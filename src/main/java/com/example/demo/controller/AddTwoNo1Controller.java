
package com.example.demo.controller;
import com.example.demo.service.AddTwoNo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AddTwoNo1Controller {
    @Autowired
    private AddTwoNo1Service addTwoNo1Service;
    
    @GetMapping("/addTwoNo1")
    private ModelAndView addTwoNo1() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("addTwoNo1");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/findBigNo")
    private ModelAndView findBigNo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("findBigNo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/findSumNo")
    private ModelAndView findSumNo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("findSumNo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/findOddNo")
    private ModelAndView findOddNo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("findOddNo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/findRockGame")
    private ModelAndView findRockGame() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("findRockGame");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @PostMapping("/add2")
    public Map<String, Integer> addNumbers(@RequestBody Map<String, String> numbers) throws Exception {
        Map<String, Integer> intNumbers = new HashMap<>();
        intNumbers.put("num1", Integer.parseInt(numbers.get("num1")));
        intNumbers.put("num2", Integer.parseInt(numbers.get("num2")));
        Map<String, Integer> result = addTwoNo1Service.add(intNumbers);
        return result;
    }
}
