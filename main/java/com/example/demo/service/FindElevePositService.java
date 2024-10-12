package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class FindElevePositService {

 public Map<String, Object> findElevePosit(Map<String, Object> paramMap) throws Exception {
     System.out.println(paramMap.get("de1"));
     System.out.println(paramMap.get("de2"));
     System.out.println(paramMap.get("st1"));
     System.out.println(paramMap.get("st2"));
     ArrayList<Integer> de1 = (ArrayList<Integer>) paramMap.get("de1");
     ArrayList<Integer> de2 = (ArrayList<Integer>) paramMap.get("de1");
     ArrayList<Integer> st1 = (ArrayList<Integer>) paramMap.get("de1");
     ArrayList<Integer> st2 = (ArrayList<Integer>) paramMap.get("de1");

     System.out.println(de1.get(0));

     return paramMap;
 }
 
}
