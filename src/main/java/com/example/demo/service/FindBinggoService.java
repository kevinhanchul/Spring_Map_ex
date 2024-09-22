package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindBinggoService {

 public Map<String, Integer> findBinggoGame(Map<String, Integer> numberMap) throws Exception {
		int[] num = new int[20];
		int i=0, totJump=0, cntJump=0;
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
		num[10] = numberMap.get("num11");
		num[11] = numberMap.get("num12");
		num[12] = numberMap.get("num13");
		num[13] = numberMap.get("num14");
		num[14] = numberMap.get("num15");
		num[15] = numberMap.get("num16");
		num[16] = numberMap.get("num17");
		num[17] = numberMap.get("num18");
		num[18] = numberMap.get("num19");
		num[19] = numberMap.get("num20");
		
		for(i=0;i<20;i++) {
			totJump+= num[i];
			if(totJump==5) {
				totJump+=3;
			}
			if(totJump==11) {
				totJump-=3;
			}
			if(totJump==18) {
				totJump+=3;
			}
		}
	    
	    numberMap.put("totJump", totJump);
	    numberMap.put("cntJump", i);
	    return numberMap;
 }
 
}
