package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C02_Get_ResponseBilgileriAssertion {
    /*
    //    https://restful-booker.herokuapp.com/booking/46 url'ine bir GET request
    //gonderdigimizde donen Response'un,
    //status code'unun 200,
    //ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
    //ve status Line'in HTTP/1.1 200 OK olduğunu assert ediniz.
     */


    @Test
    public void getAssert(){

        String url="https://restful-booker.herokuapp.com/booking/1651";
        Response response=given().when().get(url);
        response.then().
                statusCode(200).
                header("server","Cowboy").contentType("application/json; charset=utf-8").statusLine("HTTP/1.1 200 OK");




    }


}
