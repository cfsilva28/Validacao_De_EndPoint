package validacaoApi;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;

public class Retorno_EndPoint {
	
	@Test	
	public void ValidacaoRetornoEndPoint()
	{
		String url = "https://viacep.com.br/ws/01001000/json/";	
		RestAssured
		.given()
		.log().all()
		.when()
		.get(url)
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.body(Matchers.containsString("01001-000"));
	}
		

}
