package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindFlagService {

 public Map<String, Integer> findFlagGame(Map<String, Integer> numberMap) throws Exception {
		int[] num = new int[10];
		int totJump=0, cntJump=0;
		System.out.println(numberMap);
		num[0] = numberMap.get("num1");
		num[1] = numberMap.get("num2");
		num[2] = numberMap.get("num3");
		num[3] = numberMap.get("num4");
		num[4] = numberMap.get("num5");
		num[5] = numberMap.get("num6");
		num[6] = numberMap.get("num7");
		num[7] = numberMap.get("num8");
		num[8] = numberMap.get("num9");
		num[9] = numberMap.get("num10");
		
		while(totJump<10) {
			totJump+= num[cntJump];
			cntJump ++; 
		}
	    
	    numberMap.put("totJump", totJump);
	    numberMap.put("cntJump", cntJump);
	    return numberMap;
 }
 
}
