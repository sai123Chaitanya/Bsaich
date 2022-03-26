package restassuredexmaples;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Get {
	
	public void getdata()
	{
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		
		String presentdata = given().log().all().queryParam("key", null)
		
		
		
	}

}
