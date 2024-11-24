
package com.example.demo.controller;

import com.example.demo.service.FindBinggoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class FindBinggoGameController {
 @Autowired
 private FindBinggoService findBinggoService;

 @GetMapping("/findBinggoGame")
 private ModelAndView findBinggoGame() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("findBinggoGame");
    //mav.addObject("message", "Hello, abc.html!");
    return mav;
 }

 @PostMapping("/api/findBinggoGame")
 public Map<String, Object> findBinggoGame(@RequestBody Map<String, Object> paramMap) throws Exception {
     System.out.println(paramMap);
     return findBinggoService.findBinggoGame(paramMap);
 }
}
