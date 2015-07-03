package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngTest1 {
	
	@BeforeMethod()
	public void sayBefore(){
		System.out.println("say before");
	}
	
	@Test(description = "测试通过")
	@Parameters({"word"})
	public void sayHi(@Optional("1")String word){
		System.out.println("0000000000000000000000000000000");
		Assert.assertEquals(false, false,"erroe-----------------");
		System.out.println(word+"===========");
	}
	
	@AfterMethod()
	public void sayAfter(){
		System.out.println("say after");
	}
	
}
