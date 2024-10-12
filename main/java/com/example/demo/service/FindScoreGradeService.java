package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FindScoreGradeService {

 public Map<String, Object> findScoreGrade(Map<String, Object> paramMap) throws Exception {
	 System.out.println(paramMap);
	 int num1 = Integer.parseInt(String.valueOf(paramMap.get("num1")));
	 System.out.println("num1 : "+ num1);
	 String scoreGrade = "F";
	 if (num1>90){
		 scoreGrade = "A";
	 }
	 paramMap.put("scoreGrade", scoreGrade);
	 return paramMap;
 }
 
}
