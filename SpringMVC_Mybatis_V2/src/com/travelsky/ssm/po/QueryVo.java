package com.travelsky.ssm.po;

import java.util.List;

public class QueryVo {
	
	private User user;
	
	//鑷畾涔夌敤鎴锋墿灞曠被
	private UserCustom userCustom;
	
	//浼犻�澶氫釜鐢ㄦ埛id
	private List<Integer> ids;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}



}
