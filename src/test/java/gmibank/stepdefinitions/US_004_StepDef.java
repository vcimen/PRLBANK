package gmibank.stepdefinitions;

import gmibank.pages.US_004_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class US_004_StepDef {
    US_004_Page us_004_page = new US_004_Page();

    //@US_004-01
    @Given("User goes to  {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);

    }

    @Given("User clicks on account menu")
    public void user_clicks_on_account_menu() {
    us_004_page.accountMenu.click();
    Driver.wait(3);
    }

    @Given("User clicks on sign in")
    public void user_clicks_on_sign_in() {
    us_004_page.login.click();
        Driver.wait(3);
    }

    @Given("User enters a valid username to usernamebox")
    public void user_enters_a_valid_username_to_usernamebox() {
    us_004_page.usernameBox.sendKeys(ConfigurationReader.getProperty("user_username"));
        Driver.wait(2);
    }

    @Given("User enters a valid password  to passwordbox")
    public void user_enters_a_valid_password_to_passwordbox() {
    us_004_page.passwordBox.sendKeys(ConfigurationReader.getProperty("user_password"));
        Driver.wait(2);
    }

    @Given("User clicks on Sign in button")
    public void user_clicks_on_Sign_in_button() {
    us_004_page.signInButton.click();
        Driver.wait(3);
    }

    @Then("User verifies if the user sign in")
    public void user_verifies_if_the_user_sign_in() {
        Assert.assertTrue(us_004_page.userNameVerify.isDisplayed());
    }

    //@US_004-02
    @Given("User clicks on cancel button")
    public void user_clicks_on_cancel_button() {
    us_004_page.cancelButton.click();
    }
    @Then("User verifies if the user cancel")
    public void user_verifies_if_the_user_cancel() {
    String title = Driver.getDriver().getTitle();
        System.out.println(title);//GMIBANK
        Assert.assertEquals("GMIBANK",title);
    }

}
