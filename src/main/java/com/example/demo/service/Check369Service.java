package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Check369Service {

 public Map<String, Object> check369(Map<String, Object> paramMap) throws Exception {
		int[] num = new int[10];
	 	int[] num369 = new int[10];
		int i=0, totJump=0, cntJump=0, j=0;
		String a;
		System.out.println(paramMap);
	    //a = (String) paramMap.get("num1");
		//=>이 부분도 함수로
		num[0] = Integer.parseInt((String) paramMap.get("num1"));
	 	num[1] = Integer.parseInt((String) paramMap.get("num2"));
		num[2] = Integer.parseInt((String) paramMap.get("num3"));
		num[3] = Integer.parseInt((String) paramMap.get("num4"));
		num[4] = Integer.parseInt((String) paramMap.get("num5"));
		num[5] = Integer.parseInt((String) paramMap.get("num6"));
		num[6] = Integer.parseInt((String) paramMap.get("num7"));
		num[7] = Integer.parseInt((String) paramMap.get("num8"));
		num[8] = Integer.parseInt((String) paramMap.get("num9"));
		num[9] = Integer.parseInt((String) paramMap.get("num10"));

		//num안에 값이 369인지 체크 => 함수로
	 	for(i=0;i<10;i++){
			 if((num[i]%3==0) || (num[i]%10==3)){
				 System.out.println(num[i]+" is 369.");
				 num369[j] = num[i];  //num369[i]를 j로 바꾸면 된다.
				 j++;
			 }
		}

	 	paramMap.put("num369", num369);
	    return paramMap;
 }
 
}
