package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TestsOnLocalAPI {

	@Test
public void get()
{
		
		baseURI="http://localhost:3000";
		given().get("/users").then().statusCode(200).log().all();
	}
/*	@Test
public void post()
{
		JSONObject req=new JSONObject();
		req.put("firstName", "Thomas");
		req.put("lastName", "Edison");
		req.put("subjectid", "1");
		
		baseURI="http://localhost:3000";
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(req.toJSONString()).when().post("/users").then().statusCode(201);
	}
	
	@Test
	public void put()
	{
			JSONObject req=new JSONObject();
			req.put("firstName", "John");
			req.put("lastName", "Edison");
			req.put("subjectid", "1");
			
			baseURI="http://localhost:3000";
			
			given().contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(req.toJSONString()).when().put("/users/2").then().statusCode(200);
		}
	
	@Test
	public void patch()
	{
			JSONObject req=new JSONObject();
		
			req.put("lastName","fred");
			
			
			baseURI="http://localhost:3000";
			
			given().contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(req.toJSONString()).when().patch("/users/2").then().statusCode(200);
		} */
	@Test
	public void patch()
	{
		baseURI="http://localhost:3000";
		when().delete("/users/9").then().statusCode(200);
	}
	
}
