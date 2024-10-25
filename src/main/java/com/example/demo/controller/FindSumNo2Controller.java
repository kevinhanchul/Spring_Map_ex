
package com.example.demo.controller;

import com.example.demo.service.FindSumNo2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class FindSumNo2Controller {
 @Autowired
 private FindSumNo2Service findSumNo2Service;

    @GetMapping("/findSumNo2")
    private ModelAndView findSumNo2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("findSumNo2");
        return mav;
    }

    @PostMapping("/api/findSumNo2")
    public Map<String, Object> findSumNo2(@RequestBody Map<String, Object> numbers) throws Exception {
        System.out.println(numbers);
        return findSumNo2Service.findSumNo2(numbers);
    }

}


