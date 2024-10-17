package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class FindRackService {

 public Map<String, Object> findRockGame(Map<String, Object> numberMap) throws Exception {
	 	System.out.println(numberMap);

		String me="", you="", winWho="";

		me = (String) numberMap.get("me");
		you = (String) numberMap.get("com");
		
	    if(me.equals(you)) {
	    	winWho=(String) "비김";
	    }
	    else if(me.equals("가위") && you.equals("바위")) {
	    	winWho= (String) "컴";
	    }
	    else if(me.equals("가위") && you.equals("보")) {
	    	winWho= (String) "나";
	    }
	    else if(me.equals("바위") && you.equals("보")) {
	    	winWho= (String) "컴";
	    }
	    else if(me.equals("바위") && you.equals("가위")) {
	    	winWho= (String) "나";
	    }
	    else if(me.equals("보") && you.equals("가위")) {
	    	winWho= (String) "컴";
	    }
	    else if(me.equals("보") && you.equals("바위")) {
	    	winWho= (String) "컴";
	    }
	    
	    numberMap.put("winWho", winWho);
	    return numberMap;
 }
 
}
