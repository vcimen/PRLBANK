package gmibank.stepdefinitions;

import gmibank.pages.US_003_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US_003_StepDef {

    US_003_Page us_003_page = new US_003_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User goes to the GMi Bank home page")
    public void user_goes_to_the_GMi_Bank_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
    }

    @Given("Click on the user button")
    public void click_on_the_user_button() {
    us_003_page.accountMenu.click();
    Driver.wait(2);
    }

    @Given("You must navigate to registration page")
    public void you_must_navigate_to_registration_page()  {
    us_003_page.register.click();
    Driver.wait(2);
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @Given("Click on the Password text box")
    public void click_on_the_Password_text_box(){
    actions.click(us_003_page.firstPassword).perform();
    actions.sendKeys(Keys.ARROW_DOWN).perform();
    actions.moveToElement(us_003_page.underRegisterButton).perform();
    Driver.wait(3);
    }
    // @UserStory003-01
    @Given("User enters a password with {int} lowercase letter of at least {int} characters")
    public void user_enters_a_password_with_lowercase_letter_of_at_least_characters(Integer int1, Integer int2){
    us_003_page.firstPassword.sendKeys(ConfigurationReader.getProperty("lower_case"));
        Driver.wait(1);
    }

    @Given("User sees color line must be red")
    public void user_sees_color_line_must_be_red() {
    Assert.assertTrue(us_003_page.redColor.isDisplayed());
    Driver.wait(2);
    }
    @Given("User clicks on password confirmation text box")
    public void user_clicks_on_password_confirmation_text_box() {
    us_003_page.secondPassword.click();
    Driver.wait(2);
    }
    @Then("User enters to second text box with {int} lowercase letter of at least {int} characters")
    public void user_enters_to_second_text_box_with_lowercase_letter_of_at_least_characters(Integer int1, Integer int2) {
        us_003_page.secondPassword.sendKeys(ConfigurationReader.getProperty("lower_case"));
        us_003_page.registerButton.click();
        Driver.wait(3);
        us_003_page.firstPassword.clear();
        us_003_page.secondPassword.clear();
    Driver.wait(2);
    }
    //@UserStory003-02
    @Given("User enters a password with {int} uppercase letter of at least {int} characters")
    public void user_enters_a_password_with_uppercase_letter_of_at_least_characters(Integer int1, Integer int2) {
        us_003_page.firstPassword.sendKeys(ConfigurationReader.getProperty("upper_case"));
    Driver.wait(2);
    }
    @Given("User sees line must be red")
    public void user_sees_line_must_be_red() {
        Assert.assertTrue(us_003_page.redColor.isDisplayed());
        Driver.wait(2);
    }
    @Then("User enters to second text box with {int} uppercase letter of at least {int} characters")
    public void user_enters_to_second_text_box_with_uppercase_letter_of_at_least_characters(Integer int1, Integer int2)  {
    us_003_page.secondPassword.sendKeys(ConfigurationReader.getProperty("upper_case"));
    us_003_page.registerButton.click();
    Driver.wait(3);
    us_003_page.firstPassword.clear();
    us_003_page.secondPassword.clear();
    Driver.wait(3);
    }
    //@UserStory003-03
    @Given("User enters a password with {int} digit of at least {int} characters")
    public void user_enters_a_password_with_digit_of_at_least_characters(Integer int1, Integer int2) {
    us_003_page.firstPassword.sendKeys(ConfigurationReader.getProperty("digit"));
    Driver.wait(3);
    }
    @Given("User sees line must be orange")
    public void user_sees_line_must_be_orange()  {
        Assert.assertTrue(us_003_page.orangeColor.isDisplayed());
        Driver.wait(3);
    }
    @Then("User enters to second text box with {int} digit of at least {int} characters")
    public void user_enters_to_second_text_box_with_digit_of_at_least_characters(Integer int1, Integer int2) {
    us_003_page.secondPassword.sendKeys(ConfigurationReader.getProperty("digit"));
    us_003_page.registerButton.click();
    Driver.wait(3);
    us_003_page.firstPassword.clear();
    us_003_page.secondPassword.clear();
    ;
    Driver.wait(3);
    }
    //@Userstory003-04
    @Given("User enters a password with {int} special char of at least {int} characters")
    public void user_enters_a_password_with_special_char_of_at_least_characters(Integer int1, Integer int2)  {
    us_003_page.firstPassword.sendKeys(ConfigurationReader.getProperty("special_char"));
    Driver.wait(2);
    }
    @Given("User sees line must be green")
    public void user_sees_line_must_be_green()  {
        Assert.assertTrue(us_003_page.greenColor.isDisplayed());
        Driver.wait(3);
    }
    @Then("User enters to second text box with {int} special char of at least {int} characters")
    public void user_enters_to_second_text_box_with_special_char_of_at_least_characters(Integer int1, Integer int2)  {
    us_003_page.secondPassword.sendKeys(ConfigurationReader.getProperty("special_char"));
    us_003_page.registerButton.click();
    Driver.wait(3);
    us_003_page.firstPassword.clear();
    us_003_page.secondPassword.clear();
    Driver.wait(3);
    }
    //@UserStory003-05
    @Given("User enters a password with {int} chars")
    public void user_enters_a_password_with_chars(Integer int1) {
    us_003_page.firstPassword.sendKeys(ConfigurationReader.getProperty("full_pass"));
    Driver.wait(2);
    }
    @Then("User enters to second text box a password with {int} chars")
    public void user_enters_to_second_text_box_a_password_with_chars(Integer int1)  {
    us_003_page.secondPassword.sendKeys(ConfigurationReader.getProperty("full_pass"));
        Driver.wait(1);
    us_003_page.registerButton.click();
    Driver.wait(3);
    Driver.getDriver().close();

    }
}
