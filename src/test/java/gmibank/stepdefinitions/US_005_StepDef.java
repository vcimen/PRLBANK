package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.pages.US_005_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US_005_StepDef {

    US_005_Page lp = new US_005_Page();


   @Given("User on the landing Page")
   public void user_on_the_landing_Page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
   }

    @Then("User click on the Sign in button")
    public void user_click_on_the_Sign_in_button() {
        lp.loginDropdown.click();
        lp.signInButton.click();


    }
    @Then("User enters UserName {string}")
    public void user_enters_UserName(String username) {
        lp.username.sendKeys(username);
    }
    @Then("User enters Password {string}")
    public void user_enters_Password(String password) {
        lp.password.sendKeys(password);
    }
    @Then("click sign in")
    public void click_sign_in() {
        lp.loginButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Then("User gets Error Messages {string}")
    public void user_gets_Error_Messages(String error) {
        String failText = lp.FailedToSignIn.getText();
        System.out.println("Expected : "+error);
        System.out.println("Actual   : "+failText);
        Assert.assertEquals(error, failText);

        Driver.closeDriver();
    }

    @Given("User enter userName{string}")
    public void user_enter_userName(String userName) {
        lp.username.sendKeys("customer");
    }
    @Given("User enters Password{string}")
    public void user_enters_password(String string) {
        lp.password.sendKeys("123Abc");
    }
    @Given("Click forget password")
    public void click_forget_password() {
        lp.forgetPasswordLink.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("Verify reset password page")
    public void verify_reset_password_page() {
       String Actual = lp.resetPasswordText.getText();
       String Expected = "Reset your password";
        System.out.println("Actual   : "+Actual);
        System.out.println("Expected : "+Expected);
        Assert.assertEquals(Expected,Actual);


        Driver.closeDriver();
    }


}
