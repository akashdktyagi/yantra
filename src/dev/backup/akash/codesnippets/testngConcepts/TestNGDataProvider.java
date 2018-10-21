package dev.backup.akash.codesnippets.testngConcepts;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {


	@Test(dataProvider = "BillPaymentData")
	public void BillPaymentWithMultipleData(HashMap<String,String> param) {
		System.out.println(param.get("Name"));
		System.out.println(param.get("Age"));
	}

	@DataProvider
	public Object[] BillPaymentData(){
		
		
		HashMap<String,String> param = new HashMap<String,String>();
		param.put("Name", "Akash");
		param.put("age", "34");

		
		return param;
		
	}

	
}

