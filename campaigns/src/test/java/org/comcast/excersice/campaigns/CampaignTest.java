package org.comcast.excersice.campaigns;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;


import io.restassured.RestAssured;

public class CampaignTest {
	
	@BeforeClass
	
	    public static void init() {
	        RestAssured.baseURI = "http://localhost";	
	        RestAssured.port = 8080;	
	    }
	
	 @Test	
	     public void testAdFetchesSuccess() {	
		 RestAssured.get("/campaigns/webapi/ad/1")	
	        .then()		
	         .body("partner_id",equalTo(1))	 
	         .body("ad_content", equalTo(" Add Content ... "));     
		
	     }

	 @Test	
     public void testAdCreateSuccess() {	
	 RestAssured.post("/campaigns/webapi/ad")	
         .then()	
         .body("partner_id",equalTo(1))	
         .body("duration",equalTo(200))	
         .body("ad_content", equalTo(" Add Content ... "));	      
 
     }

	 
	  


}
