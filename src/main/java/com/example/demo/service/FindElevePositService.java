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
        ArrayList<Integer> de2 = (ArrayList<Integer>) paramMap.get("de2");
        ArrayList<Integer> st1 = (ArrayList<Integer>) paramMap.get("st1");
        ArrayList<Integer> st2 = (ArrayList<Integer>) paramMap.get("st2");

        System.out.println("엘레베이터1의 위치 : "+de1.get(0));
        System.out.println("엘레베이터2의 위치 : "+de2.get(0));
        System.out.println("손님1의 위치 : "+st1.get(0));
        System.out.println("손님2의 위치 : "+st2.get(0));
/*
        int a = findEle(
                Integer.valueOf(de1.get(0)),
                Integer.valueOf(de2.get(0)),
                Integer.valueOf(st1.get(0))
        );

        System.out.println("선택된 엘베번호 : "+a);
*/
        //Integer.valueOf(de1.get(0);
        //String a = (String) de1.get(0);
        //System.out.println(a);

        //System.out.println((de1.get(0)).getClass().getName());
        return paramMap;
    }

    public int findEle(int ele1, int ele2, int gues1){
        int diff1 = ele1 - gues1;
        int diff2 = ele2 - gues1;
        int choEle = 0;
        if (diff1>diff2){
            choEle = diff2;
        } else {
            choEle = diff1;
        }
        return choEle;
    }
 
}
