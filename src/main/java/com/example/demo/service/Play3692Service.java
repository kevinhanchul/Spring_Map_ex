package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Play3692Service {

 public Map<String, Object> play369(Map<String, Object> paramMap) throws Exception {
	 System.out.println(paramMap);
	 int[] num = new int[30];
	 int[] num2= new int[30];
	 int i=0, j=0;
	 num[0] = Integer.parseInt(String.valueOf(paramMap.get("num1")));
	 num[1] = Integer.parseInt(String.valueOf(paramMap.get("num2")));
	 num[2] = Integer.parseInt(String.valueOf(paramMap.get("num3")));
	 num[3] = Integer.parseInt(String.valueOf(paramMap.get("num4")));
	 num[4] = Integer.parseInt(String.valueOf(paramMap.get("num5")));
	 num[5] = Integer.parseInt(String.valueOf(paramMap.get("num6")));
	 num[6] = Integer.parseInt(String.valueOf(paramMap.get("num7")));
	 num[7] = Integer.parseInt(String.valueOf(paramMap.get("num8")));
	 num[8] = Integer.parseInt(String.valueOf(paramMap.get("num9")));
	 num[9] = Integer.parseInt(String.valueOf(paramMap.get("num10")));
	 num[10] = Integer.parseInt(String.valueOf(paramMap.get("num11")));
	 num[11] = Integer.parseInt(String.valueOf(paramMap.get("num12")));
	 num[12] = Integer.parseInt(String.valueOf(paramMap.get("num13")));
	 num[13] = Integer.parseInt(String.valueOf(paramMap.get("num14")));
	 num[14] = Integer.parseInt(String.valueOf(paramMap.get("num15")));
	 num[15] = Integer.parseInt(String.valueOf(paramMap.get("num16")));
	 num[16] = Integer.parseInt(String.valueOf(paramMap.get("num17")));
	 num[17] = Integer.parseInt(String.valueOf(paramMap.get("num18")));
	 num[18] = Integer.parseInt(String.valueOf(paramMap.get("num19")));
	 num[19] = Integer.parseInt(String.valueOf(paramMap.get("num20")));
	 num[20] = Integer.parseInt(String.valueOf(paramMap.get("num21")));
	 num[21] = Integer.parseInt(String.valueOf(paramMap.get("num22")));
	 num[22] = Integer.parseInt(String.valueOf(paramMap.get("num23")));
	 num[23] = Integer.parseInt(String.valueOf(paramMap.get("num24")));
	 num[24] = Integer.parseInt(String.valueOf(paramMap.get("num25")));
	 num[25] = Integer.parseInt(String.valueOf(paramMap.get("num26")));
	 num[26] = Integer.parseInt(String.valueOf(paramMap.get("num27")));
	 num[27] = Integer.parseInt(String.valueOf(paramMap.get("num28")));
	 num[28] = Integer.parseInt(String.valueOf(paramMap.get("num29")));
	 num[29] = Integer.parseInt(String.valueOf(paramMap.get("num30")));

	 for(i=0;i<30;i++){
		 if ( i%3 == 0 ){
			 System.out.println(num[i]);
			 num2[j] = i;
			 j++;
		 }
	 }

	 paramMap.put("num2", num2);
	 return paramMap;
 }
 
}
