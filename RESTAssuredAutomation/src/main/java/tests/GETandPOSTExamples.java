package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class GETandPOSTExamples {
	
/*	@Test
	public void testGet()
	{
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://reqres.in/api/");
		request.given().get("/users?page=2").
		then().statusCode(200).body("data[4].first_name",equalTo("George")).body("data.first_name", hasItems("George","Rachel"));
	}*/
	@Test
	public void testPost()
	{
		Map<String, Object> map=new HashMap<String, Object>();
	//	map.put("name", "Rahul");
	//	map.put("job", "Teacher");
		
		System.out.println(map);
		
		JSONObject req=new JSONObject();
		req.put("name", "Rahul");
		req.put("job", "Teacher");
		System.out.println(req.toJSONString());
		
		RequestSpecification request = RestAssured.given();
		
		request.baseUri("https://reqres.in/api/");
		request.given().header("Content-Type","application/json").
		contentType(ContentType.JSON).body(req.toJSONString()).when().post("/users").
		then().statusCode(201).log().all();
	}
}
