package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/*
C1_Get_ApiSorgulama
https://restful-booker.herokuapp.com/booking/83 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
 */

public class C01_Get_ApiSorgulama {
// 1-url belirleyip url adresine gideceğiz
// 2-expected data verilmişse expected data hazırlanır
// 3-Actual data alınacak
// 4-assertion işlemi


    @Test
    public void get01(){

        //1- url belirleyip url adresine gidicez
        String url= "https://restful-booker.herokuapp.com/booking/46";
        //2- expected data açıkça verilirse belirlenecek
        //3- Actual data alınır

        Response response= given().when().get(url);

        //response.prettyPrint();
        System.out.println("Status Code: "+response.getStatusCode()); //200
        System.out.println("Content Type: "+response.getContentType()); // application/json
        System.out.println("Server Header Degeri: "+response.getHeader("Server"));
        System.out.println("Status Line: "+response.getStatusLine()); // HTTP/1.1 200
        System.out.println("Get Time: "+response.getTime()); // least than 5



    }
}
