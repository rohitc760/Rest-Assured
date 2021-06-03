package tests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PutPatchDeleteExamples {
	@Test
	public void testPut()
	{
		Map<String, Object> map=new HashMap<String, Object>();
	//	map.put("name", "Rahul");
	//	map.put("job", "Teacher");
		
		System.out.println(map);
		
		JSONObject req=new JSONObject();
		req.put("name", "Rahul");
		req.put("job", "Teacher");
		System.out.println(req.toJSONString());
		
		baseURI="https://reqres.in/api/";
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).body(req.toJSONString()).when().put("/users/2").
		then().statusCode(200).log().all();
	}
	
	@Test
	public void testPatch()
	{
		Map<String, Object> map=new HashMap<String, Object>();
	//	map.put("name", "Rahul");
	//	map.put("job", "Teacher");
		
		System.out.println(map);
		
		JSONObject req=new JSONObject();
		req.put("name", "Rahul");
		req.put("job", "Teacher");
		System.out.println(req.toJSONString());
		
		
		baseURI="https://reqres.in/api/";
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).body(req.toJSONString()).when().patch("/users/2").
		then().statusCode(200).log().all();
	}
	
	@Test
	public void testDelete()
	{
	
		baseURI="https://reqres.in/";
		when().put("/api/users/2").
		then().statusCode(204).log().all();
	}
}
