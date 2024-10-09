package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindBinggoService {

 public Map<String, Integer> findBinggoGame(Map<String, Integer> numberMap) throws Exception {
	int[][] num = new int[3][3];    //이차원 배열선언
	int i=0, j=0, totJump=0, cntJump=0;
	int binggo1=0, binggo2=0, binggo3 = 0, Binggo=0;
	System.out.println(numberMap);
	num[0][0] = numberMap.get("num1");
	num[0][1] = numberMap.get("num2");
	num[0][2] = numberMap.get("num3");
	num[1][0] = numberMap.get("num4");
	num[1][1] = numberMap.get("num5");
	num[1][2] = numberMap.get("num6");
	num[2][0] = numberMap.get("num7");
	num[2][1] = numberMap.get("num8");
	num[2][2] = numberMap.get("num9");

	for(i=0;i<3;i++) {
		for(j=0;j<3;j++){
			if(num[0][j]==1){
				binggo1++;
			}
			totJump+= num[i][j];
		}
		if(binggo1==3){
			Binggo++;
		}
	}
	 numberMap.put("totJump", totJump);
	 numberMap.put("cntJump", i);
	 numberMap.put("Binggo", Binggo);
	 System.out.println(numberMap);

	return numberMap;
 }
 
}
