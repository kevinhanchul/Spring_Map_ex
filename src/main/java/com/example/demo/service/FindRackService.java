package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindRackService {

 public Map<String, Object> findRockGame(Map<String, Object> numberMap) throws Exception {
		String me="", you="", winWho="";
		me = (String) numberMap.get("num1");
		you = (String) numberMap.get("num1");
		
	    if(me.equals(you)) {
	    	winWho=(String) "비김";
	    }
	    else if(me.equals("가위") && you.equals("바위")) {
	    	winWho= (String) "너";
	    }
	    else if(me.equals("가위") && you.equals("보")) {
	    	winWho= (String) "나";
	    }
	    else if(me.equals("바위") && you.equals("보")) {
	    	winWho= (String) "너";
	    }
	    else if(me.equals("바위") && you.equals("가위")) {
	    	winWho= (String) "나";
	    }
	    else if(me.equals("보") && you.equals("가위")) {
	    	winWho= (String) "너";
	    }
	    else if(me.equals("보") && you.equals("바위")) {
	    	winWho= (String) "나";
	    }
	    
	    numberMap.put("winWho", winWho);
	    return numberMap;
 }
 
}
