package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Settings;

public class SettingsSteps {
    @Steps
    Settings settings;

    @Given("I set GET api endpoints settings")
    public void setGetApiEndpointsSettings() {settings.setGetApiEndpointSettings();}
    @Given("I set GET api endpoints settings2")
    public void setGetApiEndpointsSettings2() {settings.setGetApiEndpointSettings2();}
    @Given("I set PUT api endpoints settings3")
    public void setPutApiEndpointsSettings3() {settings.setPutApiEndpointSettings3();}
    @Given("I set PUT api endpoints settings4")
    public void setPutApiEndpointsSettings4() {settings.setPutApiEndpointSettings4();}
    @Given("I set PUT api endpoints settings5")
    public void setPutApiEndpointsSettings5() {settings.setPutApiEndpointSettings5();}
    @Given("I set PUT api endpoints settings6")
    public void setPutApiEndpointsSettings6() {settings.setPutApiEndpointSettings6();}
    @Given("I set PUT api endpoints settings7")
    public void setPutApiEndpointsSettings7() {settings.setPutApiEndpointSettings7();}
    @Given("I set GET api endpoints settings8")
    public void setGetApiEndpointsSettings8() {settings.setGetApiEndpointSettings8();}
    @Given("I set GET api endpoints settings9")
    public void setGetApiEndpointsSettings9() {settings.setGetApiEndpointSettings9();}
    @Given("I set POST api endpoints settings11")
    public void setPostApiEndpointsSettings11() {settings.setPostApiEndpointSettings11();}
    @Given("I set POST api endpoints settings12")
    public void setPostApiEndpointsSettings12() {settings.setPostApiEndpointSettings12();}
    @Given("I set POST api endpoints settings14")
    public void setPostApiEndpointsSettings14() {settings.setPostApiEndpointSettings14();}
    @Given("I set PUT api endpoints settings15")
    public void setPutApiEndpointsSettings15() {settings.setPutApiEndpointSettings15();}
    @Given("I set PUT api endpoints settings16")
    public void setPutApiEndpointsSettings16() {settings.setPutApiEndpointSettings16();}

    @When("I send GET HTTP request settings")
    public void sendGetHttpRequestsSettings() {settings.sendGetHttpRequestSettings();}
    @When("I send GET HTTP request settings2")
    public void sendGetHttpRequestSettings2() {settings.sendGetHttpRequestSettings2();}
    @When("I send PUT HTTP request settings3")
    public void sendPutHttpRequestsSettings3() {settings.sendPutHttpRequestSettings3();}
    @When("I send PUT HTTP request settings4")
    public void sendPutHttpRequestsSettings4() {settings.sendPutHttpRequestSettings4();}
    @When("I send PUT HTTP request settings5")
    public void sendPutHttpRequestsSettings5() {settings.sendPutHttpRequestSettings5();}
    @When("I send PUT HTTP request settings6")
    public void sendPutHttpRequestsSettings6() {settings.sendPutHttpRequestSettings6();}
    @When("I send PUT HTTP request settings7")
    public void sendPutHttpRequestsSettings7() {settings.sendPutHttpRequestSettings7();}
    @When("I send GET HTTP request settings8")
    public void sendGetHttpRequestsSettings8() {settings.sendGetHttpRequestSettings8();}
    @When("I send GET HTTP request settings9")
    public void sendGetHttpRequestsSettings9() {settings.sendGetHttpRequestSettings9();}
    @When("I send POST HTTP request settings11")
    public void sendPostHttpRequestsSettings11() {settings.sendPostHttpRequestSettings11();}
    @When("I send POST HTTP request settings12")
    public void sendPostHttpRequestsSettings12() {settings.sendPostHttpRequestSettings12();}
    @When("I send POST HTTP request settings14")
    public void sendPostHttpRequestsSettings14() {settings.sendPostHttpRequestSettings14();}
    @When("I send PUT HTTP request settings15")
    public void sendPutHttpRequestsSettings15() {settings.sendPutHttpRequestSettings15();}
    @When("I send PUT HTTP request settings16")
    public void sendPutHttpRequestsSettings16() {settings.sendPutHttpRequestSettings16();}

}