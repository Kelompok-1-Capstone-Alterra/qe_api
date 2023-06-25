package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Settings {
    protected String url = "https://34.128.85.215:8080";
    @Step("I set GET api endpoints settings") public String setGetApiEndpointSettings() {return url + "/auth/users/profiles";}
    @Step("I set GET api endpoints settings2") public String setGetApiEndpointSettings2() {return url + "/auth/users/profiles/name";}
    @Step("I set PUT api endpoints settings3") public String setPutApiEndpointSettings3() {return url + "/auth/users/profiles/name";}
    @Step("I set PUT api endpoints settings4") public String setPutApiEndpointSettings4() {return url + "/auth/users/profiles/name";}
    @Step("I set PUT api endpoints settings5") public String setPutApiEndpointSettings5() {return url + "/auth/users/profiles/password";}
    @Step("I set PUT api endpoints settings6") public String setPutApiEndpointSettings6() {return url + "/auth/users/profiles/password";}
    @Step("I set PUT api endpoints settings7") public String setPutApiEndpointSettings7() {return url + "/auth/users/profiles/password";}
    @Step("I set GET api endpoints settings8") public String setGetApiEndpointSettings8() {return url + "/auth/users/plants/stats?status=harvest";}
    @Step("I set GET api endpoints settings9") public String setGetApiEndpointSettings9() {return url + "/auth/users/plants/stats?status=random";}
    @Step("I set POST api endpoints settings11") public String setPostApiEndpointSettings11() {return url + "/auth/users/helps";}
    @Step("I set POST api endpoints settings12") public String setPostApiEndpointSettings12() {return url + "/auth/users/helps";}
    @Step("I set POST api endpoints settings14") public String setPostApiEndpointSettings14() {return url + "/auth/users/suggestions";}
    @Step("I set PUT api endpoints settings15") public String setPutApiEndpointSettings15() {return url + "/auth/users/profiles/pictures";}
    @Step("I set PUT api endpoints settings16") public String setPutApiEndpointSettings16() {return url + "/auth/users/profiles/pictures";}

    @Step("I send GET HTTP request settings")
    public void sendGetHttpRequestSettings() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointSettings()).then().statusCode(200);}
    @Step("I send GET HTTP request settings2")
    public void sendGetHttpRequestSettings2() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointSettings2()).then().statusCode(200);}
    @Step("I send PUT HTTP request settings3")
    public void sendPutHttpRequestSettings3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "nabilaalkkk");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).put(setPutApiEndpointSettings3()).then().statusCode(400);}
    @Step("I send PUT HTTP request settings4")
    public void sendPutHttpRequestSettings4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).put(setPutApiEndpointSettings4()).then().statusCode(400);}
    @Step("I send PUT HTTP request settings5")
    public void sendPutHttpRequestSettings5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "anakqe12341212");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).put(setPutApiEndpointSettings5()).then().statusCode(400);}
    @Step("I send PUT HTTP request settings6")
    public void sendPutHttpRequestSettings6() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).put(setPutApiEndpointSettings6()).then().statusCode(400);}
    @Step("I send PUT HTTP request settings7")
    public void sendPutHttpRequestSettings7() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "qe12");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).put(setPutApiEndpointSettings7()).then().statusCode(400);}
    @Step("I send GET HTTP request settings8")
    public void sendGetHttpRequestSettings8() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointSettings8()).then().statusCode(200);}
    @Step("I send GET HTTP request settings9")
    public void sendGetHttpRequestSettings9() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointSettings9()).then().statusCode(400);}
    @Step("I send POST HTTP request settings11")
    public void sendPostHttpRequestSettings11() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "");
        requestBody.put("email", "");
        requestBody.put("message", "plis");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).post(setPostApiEndpointSettings11()).then().statusCode(400);}
    @Step("I send POST HTTP request settings12")
    public void sendPostHttpRequestSettings12() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "081112122323");
        requestBody.put("email", "f@gmail.com");
        requestBody.put("message", "plis");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).post(setPostApiEndpointSettings12()).then().statusCode(400);}
    @Step("I send POST HTTP request settings14")
    public void sendPostHttpRequestSettings14() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).post(setPostApiEndpointSettings14()).then().statusCode(400);}
    @Step("I send PUT HTTP request settings15")
    public void sendPutHttpRequestSettings15() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("picture", "howehf-hefu3478r-ifodef.png");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).put(setPutApiEndpointSettings15()).then().statusCode(400);}
    @Step("I send PUT HTTP request settings16")
    public void sendPutHttpRequestSettings16() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("picture", "");
        SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").body(requestBody.toJSONString()).put(setPutApiEndpointSettings16()).then().statusCode(400);}
}
