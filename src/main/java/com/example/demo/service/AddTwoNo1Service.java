package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class AddTwoNo1Service {
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
}
