package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FindFlag2Service {

 public Map<String, Object> findFlagGame(Map<String, Integer> numberMap) throws Exception {
	 	int num[] = {0,0,0,0,0,0,0,0,0,0,0,0};
		int totJump=0, cntJump=0, i=0;
		System.out.println("numberMap:"+numberMap);
		num[0] = numberMap.get("num1");
		num[1] = numberMap.get("num2");
		num[2] = numberMap.get("num3");
		num[3] = numberMap.get("num4");
		num[4] = numberMap.get("num5");

	 	System.out.println(num[cntJump]);

		while(totJump<5) {
			totJump+= num[cntJump];
			cntJump ++;
		}

	 	Map<String, Object> retMap = new HashMap<>();
	    retMap.put("totJump", totJump);
	 	retMap.put("cntJump", cntJump);
	 	retMap.put("num", num);
	 	System.out.println(retMap);

	 	for(i=0;i<3;i++) {
			System.out.println(num[i]);
		}

		System.out.println(retMap);

	    return retMap;
 }
 
}
