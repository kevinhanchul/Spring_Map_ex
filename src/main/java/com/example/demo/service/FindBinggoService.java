package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindBinggoService {

	 public Map<String, Object> findBinggoGame(Map<String, Object> paramMap) throws Exception {

		 System.out.println(paramMap);

		int[][] num1 = new int[3][3];    //이차원 배열선언
		//int[][] num2 = new int[3][3];    //이차원 배열선언
		//String[][] subStr = new String[3][3];
		//int i=0, j=0, k=0, totJump=0, cntJump=0;
		//int binggo1=0, binggo2=0, binggo3 = 0, Binggo=0;

		//Map<String, Object> paNum1 = (Map<String, Object>) numberMap.get("num1");
		//Map<String, Object> paNum2 = (Map<String, Object>) numberMap.get("num2");
		//System.out.println(num1);

		subStr[0][0] = (String) paramMap.get("num1");
		subStr[0][1] = (String) paramMap.get("num2");
		subStr[0][2] = (String) paramMap.get("num3");
		subStr[1][0] = (String) paramMap.get("num4");
		subStr[1][1] = (String) paramMap.get("num5");
		subStr[1][2] = (String) paramMap.get("num6");
		subStr[2][0] = (String) paramMap.get("num7");
		subStr[2][1] = (String) paramMap.get("num8");
		subStr[2][2] = (String) paramMap.get("num9");

		num1[0][0] = Integer.valueOf(subStr[0][0]);
		num1[0][1] = Integer.valueOf(subStr[0][1]);
		num1[0][2] = Integer.valueOf(subStr[0][2]);
		num1[1][0] = Integer.valueOf(subStr[1][0]);
		num1[1][1] = Integer.valueOf(subStr[1][1]);
		num1[1][2] = Integer.valueOf(subStr[1][2]);
		num1[2][0] = Integer.valueOf(subStr[2][0]);
		num1[2][1] = Integer.valueOf(subStr[2][1]);
		num1[2][2] = Integer.valueOf(subStr[2][2]);

		 subStr[0][0] = (String) paNum2.get("num1");
		 subStr[0][1] = (String) paNum2.get("num2");
		 subStr[0][2] = (String) paNum2.get("num3");
		 subStr[1][0] = (String) paNum2.get("num4");
		 subStr[1][1] = (String) paNum2.get("num5");
		 subStr[1][2] = (String) paNum2.get("num6");
		 subStr[2][0] = (String) paNum2.get("num7");
		 subStr[2][1] = (String) paNum2.get("num8");
		 subStr[2][2] = (String) paNum2.get("num9");

		 num2[0][0] = Integer.valueOf(subStr[0][0]);
		 num2[0][1] = Integer.valueOf(subStr[0][1]);
		 num2[0][2] = Integer.valueOf(subStr[0][2]);
		 num2[1][0] = Integer.valueOf(subStr[1][0]);
		 num2[1][1] = Integer.valueOf(subStr[1][1]);
		 num2[1][2] = Integer.valueOf(subStr[1][2]);
		 num2[2][0] = Integer.valueOf(subStr[2][0]);
		 num2[2][1] = Integer.valueOf(subStr[2][1]);
		 num2[2][2] = Integer.valueOf(subStr[2][2]);

		for(i=0;i<3;i++) {
			binggo2=0;
			for(j=0;j<3;j++){
				if(num1[i][j]==num2[i][j]){
					binggo1++;
					if((j==0) && ((i==0) || (i==1) || (i==2))){
						binggo3++;
					}
				}
				binggo2++;
			}
			if (binggo2==3){
				Binggo++;
			}
		}

		numberMap.put("cntJump", i);
		numberMap.put("Binggo", Binggo);
		numberMap.put("Binggo1", binggo1);
		numberMap.put("binggo2", binggo2);
		numberMap.put("binggo3", binggo3);
		System.out.println(numberMap);*/

		return numberMap;
	 }
 
}
