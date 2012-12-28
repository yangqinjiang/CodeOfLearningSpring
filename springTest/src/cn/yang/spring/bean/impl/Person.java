package cn.yang.spring.bean.impl;

import cn.yang.spring.bean.PersonService;

public class Person implements PersonService {

	@Override
	public void save(){
		System.out.println("save running...");
	}
}
