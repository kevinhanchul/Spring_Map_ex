package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PlayBallingService {

 public Map<String, Object> playBalling(Map<String, Object> paramMap) throws Exception {
	 System.out.println(paramMap);
	 int[] num = new int[10];
	 int i=0;
	 num[0] = Integer.parseInt(String.valueOf(paramMap.get("num1")));
	 num[1] = Integer.parseInt(String.valueOf(paramMap.get("num2")));
	 num[2] = Integer.parseInt(String.valueOf(paramMap.get("num3")));
	 num[3] = Integer.parseInt(String.valueOf(paramMap.get("num4")));
	 num[4] = Integer.parseInt(String.valueOf(paramMap.get("num5")));
	 num[5] = Integer.parseInt(String.valueOf(paramMap.get("num6")));
	 num[6] = Integer.parseInt(String.valueOf(paramMap.get("num7")));
	 num[7] = Integer.parseInt(String.valueOf(paramMap.get("num8")));
	 num[8] = Integer.parseInt(String.valueOf(paramMap.get("num9")));
	 num[9] = Integer.parseInt(String.valueOf(paramMap.get("num10")));
	 for(i=0;i<10;i++){
		 System.out.println(num[i]);
	 }
	 paramMap.put("scoreGrade", num);
	 return paramMap;
 }
 
}
