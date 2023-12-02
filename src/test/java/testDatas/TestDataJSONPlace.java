package testDatas;
import org.json.JSONObject;

import java.util.HashMap;

public class TestDataJSONPlace {

    public int okStatusKodu=200;
    public String contentType="application/json; charset=utf-8";
    public String connectionHeader="keep-alive";



    public JSONObject expBodyOlusturJSON(){
        /*
        {
            "userId":3,
            "id":22,
            "title":"dolor sint quo a velit explicabo quia nam",
            "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear
            um mollitia molestiae aut atque rem suscipit\nnam impedit esse"
    }
         */

        JSONObject expBody=new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");

        return expBody;
    }

    public JSONObject reqBodyOlusturJSON(){
        /*
        Request Body

        {
        "title":"Ali",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
         */

        JSONObject reqBody=new JSONObject();
        reqBody.put("title","Ali");
        reqBody.put("body","Merhaba");
        reqBody.put("userId",10);
        reqBody.put("id",70);

        return reqBody;
    }


    public HashMap<String,Object> requestBodyOlusturMAP(){
        HashMap<String,Object> reqBody=new HashMap<>();


        reqBody.put("title","Ali");
        reqBody.put("body","Merhaba");
        reqBody.put("userId",10.0);
        reqBody.put("id",70.0);

        return reqBody;
    }



}