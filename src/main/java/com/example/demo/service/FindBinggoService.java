package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindBinggoService {

 public Map<String, Integer> findBinggoGame(Map<String, Integer> numberMap) throws Exception {
	int[][] num = new int[3][3];  //이차원 배열
	int i, j=0, totJump=0, cntJump=0;
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
			totJump+= num[i][j];
		}
	}
	numberMap.put("전체합산", totJump);
	numberMap.put("카운트수", i);
	System.out.println(numberMap);

	 return numberMap;
 }
 
}
