package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FindBigNoService {

 public Map<String, Integer> findBigNo(Map<String, Integer> numberMap) throws Exception {
	int firNo, secNo, bigNo=0, whiNo=0;
    firNo = numberMap.get("num1");
    secNo = numberMap.get("num2");

    if(firNo>secNo) {
    	bigNo=firNo;
        whiNo=1;
    }
    else {
        bigNo = secNo;
        whiNo=2;
    }
    numberMap.put("bigNo", bigNo);
    numberMap.put("whiNo", whiNo);

    return numberMap;
 }
 
}
