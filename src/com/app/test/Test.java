package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Dbconnect;


public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		 Object ob=ac.getBean("dbObj");
		 Dbconnect e=(Dbconnect)ob;
		 System.out.println(e);
	}
}
