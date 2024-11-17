package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PlayBaseBall2Service {

 public Map<String, Object> getPlayBaseBall2(Map<String, Object> paramMap) throws Exception {
	 System.out.println(paramMap);
	 int[] num = new int[10];
	 int i=0;
	 num[0] = Integer.parseInt(String.valueOf(paramMap.get("num1")));
	 num[1] = Integer.parseInt(String.valueOf(paramMap.get("num2")));
	 num[2] = Integer.parseInt(String.valueOf(paramMap.get("num3")));

	 for(i=0;i<10;i++){
		 System.out.println(num[i]);
	 }

	 paramMap.put("scoreGrade", num);
	 return paramMap;
 }
 
}
