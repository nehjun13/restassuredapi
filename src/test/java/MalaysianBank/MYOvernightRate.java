package MalaysianBank;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.Accesspropfile;
import java.io.File;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class MYOvernightRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI= Accesspropfile.getproperty("MYbaseURI");
//		Response response = given().header("Accept","application/vnd.BNM.API.v1+json")
//		.when().get(Accesspropfile.getproperty("MYOR"))
//		.then().assertThat().statusCode(200).extract().response();
		
		Response response = 	given().header("Accept","application/vnd.BNM.API.v1+json")
				.when().get(Accesspropfile.getproperty("MYOR"))
				.then().assertThat().statusCode(200)
				.body(matchesJsonSchema(new File("/Users/nehasingh/eclipse-workspace/restAssuredAPIPractice/testData/myor-schema.json"))).extract().response();
		
		System.out.println(response.asString());
		
		String RefDate= response.jsonPath().getString("data.reference_date");	
		
		RefDate = RefDate.replace("[", "").replace("]", "");
		Boolean datetype =  RefDate.matches("\\d{4}-\\d{2}-\\d{2}");
		System.out.println(datetype);
		
	
	}

}
