
package com.example.demo.controller;
import com.example.demo.service.AddTwoNo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddTwoNo1Controller {
    @Autowired
    private AddTwoNo1Service addTwoNo1Service;
    
    @GetMapping("/add")
    private ModelAndView add() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        return mav;
    }

    @PostMapping("/api/add2")
    public Map<String, Integer> add2(@RequestBody Map<String, Integer> paramMap) throws Exception {
        System.out.println(paramMap);
        //return paramMap;
        return addTwoNo1Service.getAdd(paramMap);
    }
}
