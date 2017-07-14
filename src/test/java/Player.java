import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;

public class Player {
	@BeforeClass
	public void setBaseUri () {

	    RestAssured.baseURI = "http://10.0.1.86/snl/";
	  }


	//@Test
   /* public void newplayer(){
    	Map<String,String> player = new HashMap<>();
        player.put("id", "101");
        player.put("name", "vibhutigupta");
     
         RestAssured.given()
        //.contentType("application/json")
        .body(player)
        .when().post("/rest/v1/player.json").then()
        .statusCode(200);
    
    }*/
	
    @Test
	public void newplayer(){
	
		
	}
	private Object given() {
		// TODO Auto-generated method stub
		return null;
	}
}
