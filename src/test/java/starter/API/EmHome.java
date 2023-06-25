package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class EmHome {
    protected String url = "https://34.128.85.215:8080";
    @Step("I set GET api endpoints EmHome") public String setGetApiEndpointEmHome() {return url + "/auth/users/weather/-3.577847/102.346390";}
    @Step("I set GET api endpoints EmHome2") public String setGetApiEndpointEmHome2() {return url + "/auth/users/weather/1";}
    @Step("I set GET api endpoints EmHome3") public String setGetApiEndpointEmHome3() {return url + "/auth/users/weather/99";}
    @Step("I set GET api endpoints EmHome4") public String setGetApiEndpointEmHome4() {return url + "/auth/plants";}
    @Step("I set GET api endpoints EmHome5") public String setGetApiEndpointEmHome5() {return url + "/auth/plants/search?name=Tomat";}
    @Step("I set GET api endpoints EmHome6") public String setGetApiEndpointEmHome6() {return url + "/auth/plants/6";}
    @Step("I set GET api endpoints EmHome7") public String setGetApiEndpointEmHome7() {return url + "/auth/plants/3";}
    @Step("I set GET api endpoints EmHome8") public String setGetApiEndpointEmHome8() {return url + "/auth/plants/6/location";}
    @Step("I set GET api endpoints EmHome9") public String setGetApiEndpointEmHome9() {return url + "/auth/articles/planting/6/ground";}
    @Step("I set GET api endpoints EmHome10") public String setGetApiEndpointEmHome10() {return url + "/auth/articles/planting/3/ground";}
    @Step("I set GET api endpoints EmHome11") public String setGetApiEndpointEmHome11() {return url + "/auth/articles/planting/6/trash";}
    @Step("I set GET api endpoints EmHome12") public String setGetApiEndpointEmHome12() {return url + "/auth/articles/fertilizing/6";}
    @Step("I set GET api endpoints EmHome13") public String setGetApiEndpointEmHome13() {return url + "/auth/articles/fertilizing/3";}
    @Step("I set GET api endpoints EmHome14") public String setGetApiEndpointEmHome14() {return url + "/auth/articles/watering/6";}
    @Step("I set GET api endpoints EmHome15") public String setGetApiEndpointEmHome15() {return url + "/auth/articles/watering/3";}
    @Step("I set GET api endpoints EmHome16") public String setGetApiEndpointEmHome16() {return url + "/auth/articles/temperature/6";}
    @Step("I set GET api endpoints EmHome17") public String setGetApiEndpointEmHome17() {return url + "/auth/articles/temperature/3";}
    @Step("I set GET api endpoints EmHome18") public String setGetApiEndpointEmHome18() {return url + "/auth/users/plants/3/name";}
    @Step("I set GET api endpoints EmHome19") public String setGetApiEndpointEmHome19() {return url + "/auth/users/plants/1/name";}
    @Step("I set POST api endpoints EmHome20") public String setPostApiEndpointEmHome20() {return url + "/auth/users/plants/18/start";}
    @Step("I set GET api endpoints EmHome21") public String setGetApiEndpointEmHome21() {return url + "/auth/users/plants/3/overview";}
    @Step("I set GET api endpoints EmHome22") public String setGetApiEndpointEmHome22() {return url + "/auth/users/plants/18/overview";}
    @Step("I set POST api endpoints EmHome23") public String setPostApiEndpointEmHome23() {return url + "/auth/users/plants/3/watering";}
    @Step("I set POST api endpoints EmHome24") public String setPostApiEndpointEmHome24() {return url + "/auth/users/plants/18/watering";}
    @Step("I set POST api endpoints EmHome25") public String setPostApiEndpointEmHome25() {return url + "/auth/users/plants/18/fertilizing";}
    @Step("I set POST api endpoints EmHome26") public String setPostApiEndpointEmHome26() {return url + "/auth/users/plants/18/progress";}


    @Step("When I send GET HTTP request EmHome")
    public void sendGetHttpEmHome() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome2")
    public void sendGetHttpEmHome2() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome2()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome3")
    public void sendGetHttpEmHome3() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome3()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome4")
    public void sendGetHttpEmHome4() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome4()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome5")
    public void sendGetHttpEmHome5() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome5()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome6")
    public void sendGetHttpEmHome6() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome6()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome7")
    public void sendGetHttpEmHome7() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome7()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome8")
    public void sendGetHttpEmHome8() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome8()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome9")
    public void sendGetHttpEmHome9() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome9()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome10")
    public void sendGetHttpEmHome10() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome10()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome11")
    public void sendGetHttpEmHome11() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome11()).then().statusCode(400);}
    @Step("When I send GET HTTP request EmHome12")
    public void sendGetHttpEmHome12() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome12()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome13")
    public void sendGetHttpEmHome13() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome13()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome14")
    public void sendGetHttpEmHome14() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome14()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome15")
    public void sendGetHttpEmHome15() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome15()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome16")
    public void sendGetHttpEmHome16() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome16()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome17")
    public void sendGetHttpEmHome17() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome17()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome18")
    public void sendGetHttpEmHome18() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome18()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome19")
    public void sendGetHttpEmHome19() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome19()).then().statusCode(400);}
    @Step("When I send POST HTTP request EmHome20")
    public void sendPostHttpEmHome20() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("longitude", "102.346390");
        requestBody.put("latitude", "-3.577847");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).post(setPostApiEndpointEmHome20()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome21")
    public void sendGetHttpEmHome21() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome21()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome22")
    public void sendGetHttpEmHome22() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome22()).then().statusCode(404);}
    @Step("When I send POST HTTP request EmHome23")
    public void sendPostHttpEmHome23() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").post(setPostApiEndpointEmHome23()).then().statusCode(404);}
    @Step("When I send POST HTTP request EmHome24")
    public void sendPostHttpEmHome24() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").post(setPostApiEndpointEmHome24()).then().statusCode(404);}
    @Step("When I send POST HTTP request EmHome25")
    public void sendPostHttpEmHome25() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").post(setPostApiEndpointEmHome25()).then().statusCode(404);}
    @Step("When I send POST HTTP request EmHome26")
    public void sendPostHttpEmHome26() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("condition", "");
        requestBody.put("description", "");
        requestBody.put("weekly_pictures", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).post(setPostApiEndpointEmHome26()).then().statusCode(404);}



}
