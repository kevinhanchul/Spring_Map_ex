package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindFlagService {

 public Map<String, Object> findFlagGame(Map<String, Integer> numberMap) throws Exception {
		//int[] num = new int[10];
	 	//int[] jumStone = new int[10];
	 	int num[] = {0,0,0,0,0,0,0,0,0,0,0,0};
	 	int jumStone[] = {0,0,0,0,0,0,0,0,0,0,0,0};
		int totJump=0, cntJump=0, i=0;
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
			jumStone[cntJump] = num[cntJump];
			//System.out.println(jumStone[cntJump]);
		}
/*
		for(i=0;i<3;i++){
			System.out.println(jumStone[i]);
			System.out.println(num[i]);
		}*/

	 	Map<String, Object> retMap = new HashMap<>();
	    retMap.put("totJump", totJump);
	 	retMap.put("cntJump", cntJump);
	 	retMap.put("jumStone", jumStone);
		 /*넣은 배열을 프린터 해 보도록 한다.*/
	 	//int[] jumStone1 = (int[]) retMap.get("num");

	 	for(i=0;i<3;i++) {
			System.out.println(jumStone[i]);
		}

		//System.out.println(retMap);

	    return retMap;
 }
 
}
