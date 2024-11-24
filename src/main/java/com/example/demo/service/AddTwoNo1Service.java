package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class AddTwoNo1Service {
    public Map<String, Integer> getAdd(Map<String, Integer> numberMap) throws Exception {
        int num[] = {0, 0, 0, 0, 0};
        int sumNo = 0, cnt = 0, i = 0;

        num[0] = numberMap.get("num1");
        num[1] = numberMap.get("num2");
/*
        num[2] = numberMap.getOrDefault("num3", 0);
        num[3] = numberMap.getOrDefault("num4", 0);
        num[4] = numberMap.getOrDefault("num5", 0);
*/
/*
        while (sumNo < 10 && i < num.length) {
            sumNo += num[];
            cnt++;
            i++;
        }
 */

        sumNo = num[0] + num[1];
        numberMap.put("sumNo", sumNo);
        /*numberMap.put("cnt", cnt);*/
        return numberMap;
    }
}

