package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FindSumNo1Service {

 public Map<String, Integer> findSumNo1(Map<String, Integer> numberMap) throws Exception {
	int firNo, secNo, bigNo=0;
    firNo = numberMap.get("num1");
    secNo = numberMap.get("num2");

    if(firNo>secNo) {
    	bigNo=firNo;
    }
    else bigNo=secNo;
    numberMap.put("bigNo", bigNo);

    return numberMap;
 }
 
}
