package pojo;

import java.util.List;

/*
{
   "location": {
       "latitude": "-38.383494",
       "longitude": "33.427362"
   },
   "accuracy": "50",
   "name": "Frontline house",
   "phone_number": "(+91) 983 893 3937",
   "address": "70 Summer walk, USA",
   "types": "shoe park,shop",
   "website": "http://google.com",
   "language": "French-IN"
}
*/

public class getPlace {

	private getPlace_location location;
	private String accuracy;
	private String name;
	private String phone_number;
	private String address;
	private List<String> types;
	private String website;
	private String language;

public getPlace() {
}

public getPlace(getPlace_location location, String accuracy, String name, String phone_number, String address, List<String> types, String website, String languge) {
	this.location=location;
	this.accuracy=accuracy;
	this.name= name;
	this.phone_number=phone_number;
	this.address=address;
	this.types=types;
	this.website=website;
	this.language=language;
}

public getPlace_location getLocation() {
	return location;
}

public void setLocation(getPlace_location location) {
	this.location = location;
}

public String getAccuracy() {
	return accuracy;
}

public void setAccuracy(String accuracy) {
	this.accuracy = accuracy;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone_number() {
	return phone_number;
}

public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public List<String> getTypes() {
	return types;
}

public void setTypes(List<String> types) {
	this.types = types;
}

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}
}
