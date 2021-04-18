package gmibank.stepdefinitions;

import gmibank.pages.US_016_MoneyTransferPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_016_MoneyTransferStepDef {

    US_016_MoneyTransferPage MoneyTransferPage = new US_016_MoneyTransferPage();




    @Given("User clicks on the my operations")
    public void user_clicks_on_the_my_operations() {

        Driver.waitAndClick(MoneyTransferPage.myOperations);


    }

    @Given("User selects money transfer")
    public void user_selects_money_transfer() {
        Driver.waitAndClick(MoneyTransferPage.transferMoneyButton);
    }

    @Given("User User selects an {string}")
    public void user_User_selects_an(String account1) {
    Driver.selectByVisibleText(MoneyTransferPage.fromAccount,account1);
    }

    @When("User slects a {string} to sent to money to")
    public void user_selects_a_to_sent_to_money_to(String account2) {
    Driver.selectByVisibleText(MoneyTransferPage.toAccount, account2);
    }

    @When("User provides a {string}")
    public void user_provides_a(String balance) {
    Driver.waitAndSendText(MoneyTransferPage.balance, balance);
    }

    @When("User provides transfer {string}")
    public void user_provides_transfer(String description) {
    Driver.waitAndSendText(MoneyTransferPage.description,description);

    }

    @Then("User makes money transfer")
    public void user_makes_mone_tranfer() {
    Driver.waitAndClick(MoneyTransferPage.makeMoneyButton);
    }
}
