package com.cginfo.test.simplespring;

import org.springframework.beans.factory.annotation.Value;

public class Bean1 implements IBean1{
	
	private String var1;
	
	@Override
	public String hello(String val){
		return var1+", "+val;
	}

	@Override
    @Value("${var1}")
	public void setVar1(String arg1) {
		this.var1 = arg1;
	}
}
