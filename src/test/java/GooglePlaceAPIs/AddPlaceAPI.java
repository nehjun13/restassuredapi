package GooglePlaceAPIs;

import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.AddplaceRequest;
import pojo.AddplaceResponse;
import pojo.Addplace_location;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import utils.Accesspropfile;

public class AddPlaceAPI extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setupReport();
		test = extent.createTest("'Add a location");

		AddplaceRequest reqestbody = new AddplaceRequest();
		Addplace_location location = new Addplace_location();
		location.setLat(-67.523778);
		location.setLng(-65.887620);

		reqestbody.setLocation(location);
		reqestbody.setAccuracy(95);
		reqestbody.setName("Waterfront Ajax BoatHouse");
		reqestbody.setPhone_number("(+1) 543 523 5324");
		reqestbody.setAddress("12 Waterfront drive");

		List<String> types = new ArrayList<>();
		types.add("Coffee House");
		types.add("Fishing point");
		reqestbody.setTypes(types);

		reqestbody.setWebsite("http://fishingpointboat.com");
		reqestbody.setLanguage("Eng");

		RestAssured.baseURI = (Accesspropfile.getproperty("postgooglebaseURI"));

		Response response = given().log().all()
				.queryParam(Accesspropfile.getproperty("username"), Accesspropfile.getproperty("password"))
//				.queryParam("key","qaclick123")
				.header("Content-Type", Accesspropfile.getproperty("content-type")).body(reqestbody).when()
				.post(Accesspropfile.getproperty("postplace")).then().log().all().assertThat().statusCode(200).extract().response();
		
	//	System.out.println("Raw response body: " + response.asString());
		
		AddplaceResponse resp = response.as(AddplaceResponse.class);

		test.info("API run completed");
		
		Assert.assertEquals(resp.getStatus(), "OK");
		String place_id=resp.getPlace_id();
		System.out.println("Placeid="+place_id);
		Assert.assertEquals(resp.getScope(), "APP");
		String Refid=resp.getReference();
		System.out.println("Ref id="+Refid);
		String id=resp.getId();
		System.out.println("id="+id);
		
	

	}

}
