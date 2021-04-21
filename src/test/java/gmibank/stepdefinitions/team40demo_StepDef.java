package gmibank.stepdefinitions;

import com.github.javafaker.Faker;
import gmibank.pages.LoginPage;
import gmibank.pages.Team40demo_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.jackson.map.util.ISO8601Utils;

public class team40demo_StepDef {
    LoginPage loginPage = new LoginPage();
    Team40demo_Page team40demo_page =new Team40demo_Page();
    Faker faker = new Faker();


    @Given("User goes to landing page")
    public void userGoesToLandingPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));

    }

    @And("User navigates to registration page")
    public void userNavigatesToRegistrationPage() {
    loginPage.loginDropdown.click();
    //Driver.wait(2);

    }

    @And("User enters required data for registration")
    public void userEntersRequiredDataForRegistration() {
        team40demo_page.registerButton.click();
        team40demo_page.Ssn.sendKeys(ConfigurationReader.getProperty("Ssn"));

       // String firstName = faker.name().firstName();
        team40demo_page.firstName.sendKeys(ConfigurationReader.getProperty("firstname"));

        //String lastName = faker.name().lastName();
        team40demo_page.lastName.sendKeys(ConfigurationReader.getProperty("lastName"));

        String address = faker.address().fullAddress();
        team40demo_page.address.sendKeys(address);

        String phoneNumber = faker.numerify("###-###-####");
        team40demo_page.mobilePhone.sendKeys(phoneNumber);

        //String username = faker.name().username();
        team40demo_page.userName.sendKeys("Ali_Can");

        String email = faker.internet().emailAddress();
        team40demo_page.email.sendKeys(email);

        team40demo_page.password.sendKeys("customer_password2");
        team40demo_page.secondPassword.sendKeys("customer_password2");

        team40demo_page.underRegisterButton.click();
    }

    @Then("User navigates to main page")
    public void userNavigatesToMainPage() {
        loginPage.loginDropdown.click();
        Driver.wait(2);

    }

    @Then("Admin clicks sign in button")
    public void adminClicksSignInButton() {
        team40demo_page.signIn.click();
        Driver.wait(2);

    }

    @And("Admin logs in to admin account {string} and {string}")
    public void adminLogsInToAdminAccountAnd(String arg0, String arg1) {
        team40demo_page.userName.sendKeys(ConfigurationReader.getProperty("user_username"));
        team40demo_page.signPassword.sendKeys(ConfigurationReader.getProperty("user_password"));
        team40demo_page.signInButton.click();
        Driver.wait(3);

    }

    @Then("Admin activates the user account")
    public void adminActivatesTheUserAccount() {
        team40demo_page.administration.click();
        team40demo_page.user_Management.click();
        Driver.wait(3);
        team40demo_page.createdDate.click();
        Driver.wait(3);
        team40demo_page.ali_can.click();
        team40demo_page.activated.click();
        Driver.wait(3);
        team40demo_page.edit_save.click();
        Driver.wait(3);

    }


    @And("Admin logs out from admin account")
    public void adminLogsOutFromAdminAccount() {
        loginPage.loginDropdown.click();
        Driver.wait(2);
        team40demo_page.signOut.click();

    }

    @Then("Employee logs in to employee account {string} and {string}")
    public void employeeLogsInToEmployeeAccountAnd(String arg0, String arg1) {

    }

    @And("Employee integrates accounts for the user")
    public void employeeIntegratesAccountsForTheUser() {
    }

    @Then("Employee logs out from account")
    public void employeeLogsOutFromAccount() {
    }

    @Then("User logs in to user account")
    public void userLogsInToUserAccount() {
    }

    @And("User navigates to My Operations")
    public void userNavigatesToMyOperations() {
    }

    @Then("User makes money transfer between accounts")
    public void userMakesMoneyTransferBetweenAccounts() {
    }

    @And("User verifies their money transfer")
    public void userVerifiesTheirMoneyTransfer() {
    }
}
