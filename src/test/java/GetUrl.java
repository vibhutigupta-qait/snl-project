import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.matcher.ResponseAwareMatcher;
import com.jayway.restassured.response.Response;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;


public class GetUrl {
	@BeforeClass
	  public void setBaseUri () {

	    RestAssured.baseURI = "http://10.0.1.86/snl/";
	  }

	 

	 @Test
	  public void boardtestStatusCode () {
	    
		  //given();
		RestAssured.given().when().get("/rest/v1/board.xml").then().body("response.board[0].id", equalTo("3646"));
		RestAssured.given().when().get("/rest/v1/board.xml").then().body("response.status", equalTo("1"));
 }
	 
	
     @Test
	  public void boardnewtestStatusCode () {
	    
		 RestAssured.given().when().get("/rest/v1/board/new.json").then().statusCode(200);
	}
	 
	 

    @Test
	  public void boardidtestStatusCode () {
	    
		  //RestAssured.given().when().get("/rest/v1/board/3704.json").then().statusCode(200);
		  RestAssured.given().when().get("/rest/v1/board/3651.json").then().body("response.board.id", equalTo(3651));
		  }
	
	
	
	 
	 


	  
	
}
