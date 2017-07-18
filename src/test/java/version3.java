import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;

public class version3 {
	
	String boardID;
	String b_id;
    String playerID;
    
 @BeforeClass
public void setBaseUri () {

    RestAssured.baseURI = "http://10.0.1.86/snl/";
  }

 @Test(priority=1)
  public void boardtestStatusCode () {
    
	  //given();
	//RestAssured.given().authentication().preemptive().basic("su", "root_pass").when().get("/rest/v1/board.json").then().body("response.board[0].id", equalTo("3646"));
	//RestAssured.given().when().get("/rest/v1/board.xml").then().body("response.status", equalTo("1"));
	RestAssured.given().auth().oauth2("/snl/oauth/token").when().get("/rest/v1/board.json").then().assertThat().statusCode(200);
}

}
