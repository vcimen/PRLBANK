package gmibank.stepdefinitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginPageStep {

    LoginPage loginPage = new LoginPage();
    String username;
    String password;

    @Given("User on the landing page")
    public void user_on_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
    }

    @Given("User sign in as {string}")
    public void user_sign_in_as(String user) {
        if (user.equals("customer")){
            username = ConfigurationReader.getProperty("customer_username");
            password = ConfigurationReader.getProperty("customer_password");
            Driver.waitAndClick(loginPage.loginDropdown);
            Driver.waitAndClick(loginPage.signInButton);
            Driver.waitAndSendText(loginPage.username,username,5 );
            Driver.waitAndSendText(loginPage.password,password,5 );
            Driver.waitAndClick(loginPage.loginButton);
        }
    }
}
