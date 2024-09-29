
package com.example.demo.controller;
import com.example.demo.service.FindBinggoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class FindBigNoController {
 @Autowired
 private FindBinggoService findBinggoService;
 
 @PostMapping("/findBinggoGame1")
 public Map<String, Integer> findBinggoGame1(@RequestBody Map<String, Integer> numbers) throws Exception {

     return findBinggoService.findBinggoGame(numbers);
 }
}
