package com.example.demo.service.baseBall;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Service
public class PlayBaseBall2Service {

	private BaseBall baseBall;

	@Autowired
	public void setBaseBall(BaseBall baseBall) {
		this.baseBall = baseBall;
	}

	public Map<String, Object> playBaseBall2(Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);

		int cntStrike = baseBall.chkStrike(paramMap);
		int cntBall = baseBall.chkBall(paramMap);
		int cntOut = baseBall.chkOut(paramMap);
		String cntUpDown = baseBall.chkUpDown(paramMap);
		int cntCnt = baseBall.chkCnt(paramMap);
		String cntEnd = baseBall.chkEnd(paramMap);

		paramMap.put("cntStrike", cntStrike);
		paramMap.put("cntBall", cntBall);
		paramMap.put("cntOut", cntOut);
		paramMap.put("cntUpDown", cntUpDown);
		paramMap.put("cntCnt", cntCnt);
		paramMap.put("cntEnd", cntEnd);

		System.out.println(paramMap);

		return paramMap;
	}
 
}
