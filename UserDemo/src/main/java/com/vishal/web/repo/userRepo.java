package com.vishal.web.repo;

import com.vishal.web.model.user;

public class userRepo {
	
	public user getUser(String name){
		
		user u1 = new user();
		u1.setFname("Vishal");
				
		return u1;
	}

}
