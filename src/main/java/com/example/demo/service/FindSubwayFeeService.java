package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FindSubwayFeeService {

 public Map<String, Object> findSubwayFee(Map<String, Object> paramMap) throws Exception {
	 System.out.println(paramMap);
	 int[] num = new int[4];
	 int i=0;
	 num[0] = Integer.parseInt(String.valueOf(paramMap.get("num1")));
	 num[1] = Integer.parseInt(String.valueOf(paramMap.get("num2")));
	 num[2] = Integer.parseInt(String.valueOf(paramMap.get("num3")));
	 num[3] = Integer.parseInt(String.valueOf(paramMap.get("num4")));
	 for(i=0;i<4;i++){
		 System.out.println(num[i]);
	 }
	 paramMap.put("scoreGrade", num);
	 return paramMap;
 }
 
}
