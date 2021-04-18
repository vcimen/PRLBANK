package gmibank.stepdefinitions;

import gmibank.pages.US_006_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US_006_StepDef {
    US_006_Page userInfo = new US_006_Page();

    @Given("login to GMI bank")
    public void loginToGMIBank() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
    }

    @And("navigate to user info")
    public void navigateToUserInfo() {
        userInfo.loginDropdown.click();
        userInfo.SignInButton.click();
    }

    @And("Send {string} to username blank")
    public void sendToUsernameBlank(String user_username) {
        userInfo.username.sendKeys(ConfigurationReader.getProperty(user_username));
    }

    @And("Send {string} to password blank")
    public void sendToPasswordBlank(String user_password) {
        userInfo.password.sendKeys(ConfigurationReader.getProperty(user_password));
    }

    @And("click to sign in button")
    public void clickToSignInButton() {
        userInfo.login.click();
    }

    @And("click on James John User drop-down")
    public void clickOnCustomerUserDropDown() {
        userInfo.UserJamesJohn.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("click on User Info")
    public void clickOnUserInfo() {
        userInfo.userInfoBtn.click();
    }

    @Then("verify firstname, lastname email and language")
    public void verifyFirstnameLastnameEmailAndLanguage() {
        boolean isDisplayedName=userInfo.firstName.isDisplayed();
        boolean isDisplayedLastName=userInfo.firstName.isDisplayed();
        boolean isDisplayedEmail=userInfo.firstName.isDisplayed();
        boolean isDisplayedLanguage=userInfo.firstName.isDisplayed();

        Assert.assertTrue("James", isDisplayedName);
        Assert.assertTrue("John", isDisplayedLastName);
        Assert.assertTrue("customer40@gmail.com", isDisplayedEmail);

        Select select=new Select(userInfo.dropDownSelect);
        select.selectByVisibleText("English");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        select.selectByVisibleText("Türkçe");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.closeDriver();

    }

    @Given("verify {int} languages {string}")
    public void verifyLanguages(int int1, String string) {
        Select select = new Select(userInfo.dropDownSelect);
        List<WebElement> options = select.getOptions();
        for(WebElement element:options) {
            String language = element.getText();
            System.out.println(language);
            Driver.closeDriver();
        }
    }

    @Given("update {string}")
    public void Update(String first_Name) {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userInfo.firstName.clear();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userInfo.firstName.sendKeys(ConfigurationReader.getProperty(first_Name));
        userInfo.submit.click();
        Driver.closeDriver();

    }

    @Given("update_lastname {string}")
    public void update_lastname(String last_Name) {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userInfo.lastName.clear();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userInfo.lastName.sendKeys(ConfigurationReader.getProperty(last_Name));
        userInfo.submit.click();
        Driver.closeDriver();
    }

    @Given("update_email {string}")
    public void update_email(String email) {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userInfo.email.clear();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userInfo.email.sendKeys(ConfigurationReader.getProperty(email));
        userInfo.submit.click();
        Driver.closeDriver();
    }
}
