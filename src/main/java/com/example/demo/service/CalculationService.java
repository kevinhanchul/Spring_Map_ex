package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class CalculationService {
	
 public Map<String, Integer> add(Map<String, Integer> numberMap) throws Exception {
	  int num[]= {0,0,0,0,0};
	  int sumNo=0, cnt=0, i=0;
     num[0] = numberMap.get("num1");
     num[1] = numberMap.get("num2");
     num[2] = numberMap.get("num3");
     num[3] = numberMap.get("num4");
     num[4] = numberMap.get("num5");
     while(sumNo<10) {
   	  sumNo+= num[i];
   	  cnt++;
     }
     numberMap.put("sumNo", sumNo);
     numberMap.put("cnt", cnt);
     return numberMap;
 }
 
 public Map<String, Integer> findBigNo(Map<String, Integer> numberMap) throws Exception {
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
 
 public Map<String, Integer> findOddNo(Map<String, Integer> numberMap) throws Exception {
		int chkNo, oddNo=0;
		chkNo = numberMap.get("num1");
	    if(chkNo%2==0) {
	    	oddNo=0;
	    }
	    else oddNo=1;
	    numberMap.put("oddNo", oddNo);
	    return numberMap;
 }
 
 public Map<String, Integer> findSumNo(Map<String, Integer> numberMap) throws Exception {
	 int[] num = new int[10]; 
	 int sumNo=0, cnt=0, i=0;
	 
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
     
     for (i=0; i<10; i++) {
    	 sumNo+=num[i];
     }
	    
     numberMap.put("sumNo", sumNo);
     
     return numberMap;
}
 
 public Map<String, Integer> findRackGame(Map<String, Integer> numberMap) throws Exception {
		int chkNo, oddNo=0;
		chkNo = numberMap.get("num1");
		
	    if(chkNo%2==0) {
	    	oddNo=0;
	    }
	    
	    else oddNo=1;
	    numberMap.put("oddNo", oddNo);
	    return numberMap;
}
 
}
