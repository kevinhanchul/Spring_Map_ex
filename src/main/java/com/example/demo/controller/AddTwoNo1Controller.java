
package com.example.demo.controller;
import com.example.demo.service.AddTwoNo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/addTwoNo1")
public class AddTwoNo1Controller {
 @Autowired
 private AddTwoNo1Service addTwoNo1Service;
 private String AddTwoNo1Controller(){
	 return "/addTwoNo1";
 }
 @PostMapping("/add")
 public Map<String, Integer> addNumbers(@RequestBody Map<String, Integer> numbers) throws Exception {
	  Map<String, Integer> result = addTwoNo1Service.add(numbers);
     return result;
 }
}
