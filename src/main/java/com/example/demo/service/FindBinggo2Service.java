package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FindBinggo2Service {

	 public Map<String, Object> findBinggoGame(Map<String, Object> numberMap) throws Exception {

		int[] num1 = new int[3];    //이차원 배열선언
		int[] num2 = new int[3];    //이차원 배열선언
		 int[] num3 = new int[3];    //이차원 배열선언
		String[] subStr = new String[3];
		int i=0, j=0, k=0, totJump=0, cntJump=0;
		int binggo1=0, binggo2=0, binggo3 = 0, Binggo=0;
		System.out.println(numberMap);
		Map<String, Object> paNum1 = (Map<String, Object>) numberMap.get("num1");
		Map<String, Object> paNum2 = (Map<String, Object>) numberMap.get("num2");
		System.out.println(num1);

		subStr[0] = (String) paNum1.get("num1");
		subStr[1] = (String) paNum1.get("num2");
		subStr[2] = (String) paNum1.get("num3");

		num1[0] = Integer.valueOf(subStr[0]);
		num1[1] = Integer.valueOf(subStr[1]);
		num1[2] = Integer.valueOf(subStr[2]);

		subStr[0] = (String) paNum2.get("num1");
		subStr[1] = (String) paNum2.get("num2");
		subStr[2] = (String) paNum2.get("num3");

		num2[0] = Integer.valueOf(subStr[0]);
		num2[1] = Integer.valueOf(subStr[1]);
		num2[2] = Integer.valueOf(subStr[2]);

		for(i=0;i<3;i++){
			System.out.println("값들비교");
			System.out.println(num1[i]);
			System.out.println(num2[i]);
			System.out.println(num3[i]);
			if(num1[i]==num2[i]){
				System.out.println("같음");
				num3[j]=1;
				j++;
			}
		}
		numberMap.put("num3", num3);
//		numberMap.put("Binggo", Binggo);
//		numberMap.put("Binggo1", binggo1);
//		numberMap.put("binggo2", binggo2);
//		numberMap.put("binggo3", binggo3);
		System.out.println(numberMap);

		return numberMap;
	 }
 
}
