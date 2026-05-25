package pojo;
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

public class getPlace_location {
	
	private String latitude;
	private String longitude;

public getPlace_location() {
}

public getPlace_location(String latitude, String longitude) {
	this.latitude = latitude;
	this.longitude = longitude;
}

public String getLatitude() {
	return latitude;
}

public void setLatitude(String latitude) {
	this.latitude = latitude;
}

public String getLongitude() {
	return longitude;
}

public void setLongitude(String longitude) {
	this.longitude = longitude;
}

}
