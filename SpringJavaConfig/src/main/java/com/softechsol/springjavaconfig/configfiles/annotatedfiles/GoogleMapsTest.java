package com.softechsol.springjavaconfig.configfiles.annotatedfiles;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class GoogleMapsTest {

	public static void main(String[] args) throws Exception {

		GeoApiContext context = new GeoApiContext();
		context.setApiKey("AIzaSyATHZVnJ292Cd9Y4VX7k_G-Exyp92EHVoE");
		GeocodingResult[] results = GeocodingApi.geocode(context, "Sheikhupura , Punjab, Paksitan").await();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(results[0].addressComponents).toString());
	}

}
