package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.ResponseModel;
import utils.PingWebsite;
import utils.TimeUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ApiSteps {

    private static final String BASE_URL = "https://api.ratesapi.io/api";

    private static Response response;
    private static String jsonString;
    private static RequestSpecification request;

    @Given("User use {string} path for Rates API")
    public void latestExchangeRates(String path) {
        RestAssured.baseURI = BASE_URL;
        request = RestAssured.given();
        if (path.equals("Good"))
            response = request.get("/latest");
        else
            response = request.get("/");
    }

    @Given("User use {string} as date for request")
    public void latestExchangeRatesWithDate(String date) {
        RestAssured.baseURI = BASE_URL;
        request = RestAssured.given();
        response = request.get("/" + date);
    }

    @When("API is available for user")
    public void apiAvailable() throws IOException {
        List<String> commands = new ArrayList<String>();
        commands.add("ping");
        commands.add("-c");
        commands.add("5");
        commands.add("172.67.156.43");
        Assert.assertTrue(PingWebsite.doCommand(commands));
    }

    @Then("Automated test check response {string}")
    public void responseCodeAssert(String flag) {
        if (flag.equals("success code"))
            Assert.assertEquals(200, response.getStatusCode());
        else if (flag.equals("wrong code"))
            Assert.assertEquals(400, response.getStatusCode());
    }

    @Then("Automated test check {string} response content")
    public void responseContentAssert(String type) {
        ResponseBody body = response.getBody();
        ResponseModel responseModel = body.as(ResponseModel.class);
        if (type.equals("specific date")) {
            Assert.assertEquals("2010-01-12", responseModel.date);
        } else if (type.equals("future")) {
            Assert.assertEquals(TimeUtil.getPastTimeForApi(1), responseModel.date);
        } else {
            Assert.assertEquals(TimeUtil.getPastTimeForApi(1), responseModel.date);
        }
        Assert.assertTrue(responseModel.base.equals("EUR"));
    }
}