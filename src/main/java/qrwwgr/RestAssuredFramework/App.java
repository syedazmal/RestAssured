package qrwwgr.RestAssuredFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class App {
 

	@Test
  public void GetAllEmployeeRecord() {

		Response reap= RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		int code=reap.getStatusCode();
		
		Assert.assertEquals(code, 200);
		
		String responseBody =reap.asString();
		
		System.out.println("Status Code:" +code);
		System.out.println("Response Body:" +responseBody);
	
	}
	
	
	
	
	
}
