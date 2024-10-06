package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FindScoreGradeService {

 public Map<String, Object> findScoreGrade(Map<String, Object> paramMap) throws Exception {
	 int score=0;
	 String month="";
	 int i_month=0;
	 System.out.println(paramMap);
	 score = (Integer) paramMap.get("score");
//	 i_month = Integer.parseInt(month);
	 System.out.println(paramMap);
	 
	 paramMap.put("score", score);
	 System.out.println(paramMap);

	 return paramMap;
 }
 
}
