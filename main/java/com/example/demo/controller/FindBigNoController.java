
package com.example.demo.controller;
import com.example.demo.service.FindBigNoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@RestController
//@RequestMapping("/api")
public class FindBigNoController {
 @Autowired
 private FindBigNoService findBigNoService;

 @GetMapping("/findBigNo")
 private ModelAndView findBigNo() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("findBigNo");
    mav.addObject("message", "Hello, abc.html!");
    return mav;
 }

 @PostMapping("/api/findBigNo")
 public Map<String, Integer> findBigNo(@RequestBody Map<String, Integer> numbers) throws Exception {
     System.out.println(numbers);
     return findBigNoService.findBigNo(numbers);
 }
}
