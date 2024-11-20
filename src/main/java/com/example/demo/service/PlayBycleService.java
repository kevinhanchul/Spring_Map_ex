package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PlayBycleService {

 public Map<String, Object> playBycle(Map<String, Object> paramMap) throws Exception {
	 System.out.println(paramMap);

	 //paramMap.put("scoreGrade", num);
	 return paramMap;
 }
 
}
