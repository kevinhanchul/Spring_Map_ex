
package com.example.demo.controller;

import com.example.demo.service.TenNumPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/api")
public class TenNumPrintController {
	 @Autowired
	 private TenNumPrintService tenNumPrintService;

	@GetMapping("/tenNumPrint")
	private ModelAndView tenNumPrint() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("tenNumPrint");
		mav.addObject("message", "Hello, abc.html!");
		return mav;
	}

	 @PostMapping("/api/tenNumPrint")
	 public Map<String, Object> tenNumPrint(@RequestBody Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
	 	return tenNumPrintService.tenNumPrint(paramMap);
	 }
 
}


