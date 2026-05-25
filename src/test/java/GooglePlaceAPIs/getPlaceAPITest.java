package GooglePlaceAPIs;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import pojo.getPlace;
import utils.Accesspropfile;
import org.junit.Assert;
import org.junit.Test;

import baseTest.BaseTest;

public class getPlaceAPITest extends BaseTest{
@Test
public void testgetplace() {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
setupReport();
test = extent.createTest("Get Place API Test");
		RestAssured.baseURI = Accesspropfile.getproperty("googlebaseURI");
		test.info("Base URI Set");
		Response response = given().queryParam("place_id", Accesspropfile.getproperty("place_id")).queryParam("key","qaclick123")
				.when().get(Accesspropfile.getproperty("getplace"))
				.then().assertThat().statusCode(200).extract().response();
		test.info("API Status passed");
		
		getPlace place = given().queryParam("place_id", Accesspropfile.getproperty("place_id")).queryParam("key","qaclick123")
				.when().get(Accesspropfile.getproperty("getplace"))
				.as(getPlace.class);
		
		System.out.println(place.getAddress());
		Assert.assertEquals("Address incorrect", place.getAddress(), "70 Summer walk, USA");
		test.pass("test case passed");
		
		flushReport();
	}

}
