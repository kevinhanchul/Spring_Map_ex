package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FindSumNoService {

 public Map<String, Integer> findSumNo(Map<String, Integer> numberMap) throws Exception {
    int[] num = new int[10];
	int i, firNo, secNo, sumNo=0, bigNo=0;
    String a = "num";
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

    for(i=0;i<10;i++){
        sumNo += num[i];
    }

    numberMap.put("sumNo", sumNo);

    return numberMap;
 }
 
}
