package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestExamples {
	
	@Test
	public void DemoTest(){
		
	Response response=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	
	int statusCode=response.getStatusCode();
	Assert.assertEquals(statusCode, 200);
	}
	@Test
	public void test_2(){
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://reqres.in/api/");
		request.given().get("/users?page=2").
		then().statusCode(200).body("data[2].id", equalTo(9)).log().all();
	}
}

