package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceBaseUrl {
//Class icinde 3 Test metodu olusturun ve asagidaki testleri yapin

/*
    1-  https://jsonplaceholder.typicode.com/posts endpointine bir GET
     request gonderdigimizde donen response'un status code'unun 200 oldugunu
     ve Response'ta 100 kayit oldugunu test edin.
    */

/*
    2- https://jsonplaceholder.typicode.com/posts/44 endpointine bir GET
        request gonderdigimizde donen response'un status code'unun 200 oldugunu
        ve "title" degerinin "optio dolor molestias sit" oldugunu test edin
     */
/*
    3- https://jsonplaceholder.typicode.com/posts/50 endpointine bir DELETE
        request gonderdigimizde donen response'un status code'unun 200 oldugunu ve
        response body'sinin null oldugunu test edin
     */

    protected RequestSpecification specJsonPlace;


    @Before
    public void setUp(){

        specJsonPlace=new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();


    }
}
