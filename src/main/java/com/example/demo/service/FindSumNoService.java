package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
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

    public Map<String, Object> findSumNo2(Map<String, Object> numberMap) throws Exception {
        Map<String, Object> a = new HashMap<>();
        Map<String, Object> num1Map = (Map<String, Object>) numberMap.get("num1");
        //Map<String, Object> num2Map = (Map<String, Object>) numberMap.get("num2");
        System.out.println(num1Map.get("num1"));
        //타입을 확인, 중요
        System.out.println(((Object) num1Map.get("num1")).getClass().getTypeName());
        String b = (String) num1Map.get("num1");

        //Integer d = (Integer) num1Map.get("num1");
        //이건안됨
        System.out.println(b);
        int c = Integer.parseInt(b);
        System.out.println(c);
        return a;
    }
}
