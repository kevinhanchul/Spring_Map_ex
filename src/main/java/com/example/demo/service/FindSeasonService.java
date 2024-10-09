package com.example.demo.service;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FindSeasonService {

 public Map<String, Object> findSeason(Map<String, Object> paramMap) throws Exception {
	//String me="", you="", winWho="";
	 String season="";
	 String month="";
	 int i_month=0;
	 System.out.println(paramMap);
	 month = (String) paramMap.get("month");
	 i_month = Integer.parseInt(month);
	 System.out.println(paramMap);
	 //you = (String) paramMap.get("num1");

	 //
	 if (i_month == 12 || i_month == 1 || i_month == 2){
	 	season = (String) "겨울";
	 }
	 if (i_month == 3 || i_month == 4 || i_month == 5){
		 season = (String) "봄";
	 }
	 if (i_month == 6 || i_month == 7 || i_month == 8){
		 season = (String) "여름";
	 }
	 if (i_month == 9 || i_month == 10 || i_month == 11){
		 season = (String) "가을";
	 }
	//
	 paramMap.put("season", season);
	 System.out.println(paramMap);

	 return paramMap;
 }
 
}
