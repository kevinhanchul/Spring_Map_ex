
package com.example.demo.controller;

import com.example.demo.service.FindBinggo2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class FindBinggoGame2Controller {
 @Autowired
 private FindBinggo2Service findBinggo2Service;

 @GetMapping("/findBinggoGame2")
 private ModelAndView findBinggoGame12() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("findBinggoGame2");
    mav.addObject("message", "Hello, abc.html!");
    return mav;
 }

 @PostMapping("/api/findBinggoGame2")
 public Map<String, Object> findBinggoGame2(@RequestBody Map<String, Object> numbers) throws Exception {
     System.out.println(numbers);
     return findBinggo2Service.findBinggoGame(numbers);
 }
}
