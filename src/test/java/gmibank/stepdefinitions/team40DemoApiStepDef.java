package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class team40DemoApiStepDef {


    Customer[] customers;
    Response response;
    @Given("User sets a response using api endpoint {string}")
    public void user_sets_a_response_using_api_endpoint(String string) {
        response = given().
                headers("Authorization", "Bearer " + ConfigurationReader.getProperty("Token"),
                        "Content_Type", ContentType.JSON, "Accept", ContentType.JSON).
                when().
                get(string).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
        //response.prettyPrint();

    }

    @Given("User deserializers ssn data as json to java")
    public void user_deserializers_ssn_data_as_json_to_java() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(), Customer[].class);
        for ( int i = 0; i< customers.length ; i++){

           // System.out.println(customers[i].getSsn());
        }
    }

    @Then("User validates the ssn data")
    public void user_validates_the_ssn_data() {
       /* JsonPath jsonPath = response.jsonPath();
        String validates = jsonPath.getString("ssn");
        System.out.println(validates.length());
        //Assert.assertTrue(validates.contains("233-45-6647"));*/
        WriteToTxt.saveDataInFileSsn("ssn.txt", customers);
    }




}
