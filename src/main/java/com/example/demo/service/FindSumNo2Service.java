package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class FindSumNo2Service {

 public Map<String, Object> findSumNo2(Map<String, Object> numberMap) throws Exception {
	int sumNo=0;
    ArrayList a = (ArrayList) numberMap.get("d");
    System.out.println(a);
    System.out.println(a.get(0));
    String b1 = (String) a.get(0);
    String b2 = (String) a.get(1);
    int c1 = Integer.parseInt(b1);
    int c2 = Integer.parseInt(b2);
    sumNo = c1 + c2;


    numberMap.put("sumNo", sumNo);

    return numberMap;
 }
 
}
