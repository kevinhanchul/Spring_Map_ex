package com.example.demo.service.baseBall;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BaseBall {

    public int chkStrike(Map<String, Object> paramMap){
        System.out.println(paramMap);
        return 1;
    }
    public int chkBall(Map<String, Object> paramMap){
        return 0;
    }

    public int chkOut(Map<String, Object> paramMap){
        return 0;
    }

    public String chkUpDown(Map<String, Object> paramMap){
        return "";
    }

    public int chkCnt(Map<String, Object> paramMap){
        return 0;
    }

    public String chkEnd(Map<String, Object> paramMap){
        return "";
    }
}
