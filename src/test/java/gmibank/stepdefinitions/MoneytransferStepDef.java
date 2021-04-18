package gmibank.stepdefinitions;

import gmibank.pages.MoneyTransferPage;
import gmibank.utilities.DatabaseUtility;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoneytransferStepDef {

    MoneyTransferPage moneyTransferPage= new MoneyTransferPage();




    @Given("User clicks on the my operations")
    public void user_clicks_on_the_my_operations() {

        Driver.waitAndClick(moneyTransferPage.myOperations);


    }

    @Given("User slects money transfer")
    public void user_slects_money_transfer() {
        Driver.waitAndClick(moneyTransferPage.transferMoneyButton);
    }

    @Given("User User slects an {string}")
    public void user_User_slects_an(String account1) {
    Driver.selectByVisibleText(moneyTransferPage.fromAccount,account1);
    }

    @When("User slects a {string} to sent to money to")
    public void user_slects_a_to_sent_to_money_to(String account2) {
    Driver.selectByVisibleText(moneyTransferPage.toAccount, account2);
    }

    @When("User provides a {string}")
    public void user_provides_a(String balance) {
    Driver.waitAndSendText(moneyTransferPage.balance, balance);
    }

    @When("User provides transfer {string}")
    public void user_provides_transfer(String description) {
    Driver.waitAndSendText(moneyTransferPage.description,description);

    }

    @Then("User makes mone tranfer")
    public void user_makes_mone_tranfer() {
    Driver.waitAndClick(moneyTransferPage.makeMoneyButton);
    }

    public static class DataBaseStepDefs {

        public static void main(String[] args) {
            DatabaseUtility.createConnection();

        }

        @Given("ders user creates a connection with db using {string} , {string} and {string}")
        public void ders_user_creates_a_connection_with_db_using_and(String url, String user, String password) {

        }

        @Given("ders user reads the Customers data using {string} and {string}")
        public void ders_user_reads_the_Customers_data_using_and(String query, String ssn) {


        }

        @Then("ders validate customers data")
        public void ders_validate_customers_data() {

        }

    }
}
