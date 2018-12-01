package com.app.bean;

import java.util.Properties;

public class Dbconnect {

	
	private Properties myDtls;

	public Dbconnect() {
		super();
	}

	public Properties getMyDtls() {
		return myDtls;
	}

	public void setMyDtls(Properties myDtls) {
		this.myDtls = myDtls;
	}

	@Override
	public String toString() {
		return "Dbconnect [myDtls=" + myDtls + "]";
	}

	
}
