package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BuySellStackService {

    public boolean chkDy(Map<String, Object> paramMap) throws Exception {

        System.out.println(paramMap);
        /*날짜가 같은지 체크*/
        String comDy1 = (String) paramMap.get("comDy1");
        String newDate1 = comDy1.replace(".", "");
        String comDy2 = (String) paramMap.get("comDy2");
        String newDate2 = comDy2.replace(".", "");
        String comDy3 = (String) paramMap.get("comDy3");
        String newDate3 = comDy3.replace(".", "");
        paramMap.put("newDate1", newDate1);
        paramMap.put("newDate2", newDate2);
        paramMap.put("newDate3", newDate3);
        String myDy1 = (String) paramMap.get("myDy1");
        String myDy2 = (String) paramMap.get("myDy2");
        String myDy3 = (String) paramMap.get("myDy3");
        if (!newDate1.equals(myDy1)) {
            return false;
        }
        if (!newDate2.equals(myDy2)) {
            return false;
        }
        if (!newDate3.equals(myDy3)) {
            return false;
        }
        return true;
    }

    public boolean chkMoney(Map<String, Object> paramMap) throws Exception {
        /*돈의 ,를 없앰*/
        return true;

    }

    public void sellStack(Map<String, Object> paramMap) throws Exception {
         System.out.println(paramMap);
         /*사서 이익인지 확인*/
         /*int[] num = new int[10];
         int i=0;
         num[0] = Integer.parseInt(String.valueOf(paramMap.get("num1")));
         num[1] = Integer.parseInt(String.valueOf(paramMap.get("num2")));
         num[2] = Integer.parseInt(String.valueOf(paramMap.get("num3")));
         num[3] = Integer.parseInt(String.valueOf(paramMap.get("num4")));
         num[4] = Integer.parseInt(String.valueOf(paramMap.get("num5")));
         num[5] = Integer.parseInt(String.valueOf(paramMap.get("num6")));
         num[6] = Integer.parseInt(String.valueOf(paramMap.get("num7")));
         num[7] = Integer.parseInt(String.valueOf(paramMap.get("num8")));
         num[8] = Integer.parseInt(String.valueOf(paramMap.get("num9")));
         num[9] = Integer.parseInt(String.valueOf(paramMap.get("num10")));
         for(i=0;i<10;i++){
             System.out.println(num[i]);
         }
         paramMap.put("scoreGrade", num);*/
    }

    public Map<String, Object> buyStack(Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        /*팔아서 이익인지 확인*/
        /*int[] num = new int[10];
        int i=0;
        num[0] = Integer.parseInt(String.valueOf(paramMap.get("num1")));
        num[1] = Integer.parseInt(String.valueOf(paramMap.get("num2")));
        num[2] = Integer.parseInt(String.valueOf(paramMap.get("num3")));
        num[3] = Integer.parseInt(String.valueOf(paramMap.get("num4")));
        num[4] = Integer.parseInt(String.valueOf(paramMap.get("num5")));
        num[5] = Integer.parseInt(String.valueOf(paramMap.get("num6")));
        num[6] = Integer.parseInt(String.valueOf(paramMap.get("num7")));
        num[7] = Integer.parseInt(String.valueOf(paramMap.get("num8")));
        num[8] = Integer.parseInt(String.valueOf(paramMap.get("num9")));
        num[9] = Integer.parseInt(String.valueOf(paramMap.get("num10")));
        for(i=0;i<10;i++){
         System.out.println(num[i]);
        }
        paramMap.put("scoreGrade", num);*/
        return paramMap;
    }
 
}
