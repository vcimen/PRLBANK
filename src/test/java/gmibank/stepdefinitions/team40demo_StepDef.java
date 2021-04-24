package gmibank.stepdefinitions;

import com.github.javafaker.Faker;
import gmibank.pages.LoginPage;
import gmibank.pages.Team40demo_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.codehaus.jackson.map.util.ISO8601Utils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class team40demo_StepDef {
    int totalBalance1;
    int totalBalance2;
    int amountOfMoneyTransfer;
    int amountOfMoneyTransferCent;
    LoginPage loginPage = new LoginPage();
    Team40demo_Page team40demo_page =new Team40demo_Page();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

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
        Driver.wait(1);

        //String lastName = faker.name().lastName();
        team40demo_page.lastName.sendKeys(ConfigurationReader.getProperty("lastName"));


        //String address = faker.address().fullAddress();
        team40demo_page.address.sendKeys("111 Test Drive");


        //String phoneNumber = faker.numerify("###-###-####");
        team40demo_page.mobilePhone.sendKeys("201-111-1001");


        //String username = faker.name().username();
        team40demo_page.userName.sendKeys(ConfigurationReader.getProperty("user"));


        //String email = faker.internet().emailAddress();
        team40demo_page.email.sendKeys(ConfigurationReader.getProperty("userEmail"));

        team40demo_page.password.sendKeys(ConfigurationReader.getProperty("customer_password2"));
        team40demo_page.secondPassword.sendKeys(ConfigurationReader.getProperty("customer_password2"));
        Driver.wait(1);

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
        Driver.wait(1);

    }

    @And("Admin logs in to admin account {string} and {string}")
    public void adminLogsInToAdminAccountAnd(String arg0, String arg1) {
        team40demo_page.userName.sendKeys(ConfigurationReader.getProperty("user_username"));
        Driver.wait(1);
        team40demo_page.signPassword.sendKeys(ConfigurationReader.getProperty("user_password"));
        Driver.wait(1);
        team40demo_page.signInButton.click();
        Driver.wait(3);

    }

    @Then("Admin activates the user account")
    public void adminActivatesTheUserAccount() {
        team40demo_page.administration.click();
        team40demo_page.user_Management.click();

        team40demo_page.createdDate.click();

        team40demo_page.starTester.click();

        team40demo_page.activated.click();
        Driver.wait(1);
        team40demo_page.edit_save.click();
        Driver.wait(1);

    }

    @And("Admin logs out from admin account")
    public void adminLogsOutFromAdminAccount() {
        loginPage.loginDropdown.click();
        Driver.wait(1);
        team40demo_page.signOut.click();
    }

    @Then("Employee logs in to employee account {string} and {string}")
    public void employeeLogsInToEmployeeAccountAnd(String arg0, String arg1) {
        loginPage.loginDropdown.click();
        Driver.wait(1);
        team40demo_page.signIn.click();
        Driver.wait(1);
        team40demo_page.userName.sendKeys(ConfigurationReader.getProperty("employee_username"));
        team40demo_page.signPassword.sendKeys((ConfigurationReader.getProperty("employee_password")));
        team40demo_page.signInButton.click();
        Driver.wait(3);

    }
    @And("Employee integrates accounts for the user")
    public void employeeIntegratesAccountsForTheUser() {
        team40demo_page.myOperations.click();
        team40demo_page.manageCustomers.click();
        Driver.wait(1);
        team40demo_page.createNewCustomer.click();
        Driver.wait(1);
        team40demo_page.SSN.sendKeys(ConfigurationReader.getProperty("Ssn"));
        team40demo_page.searchSSN.click();
        team40demo_page.middleinitialTextBox.sendKeys("M");
        team40demo_page.phonenumberTextBox.sendKeys("201-111-2222");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        team40demo_page.zipcodeTextBox.sendKeys("10001");
        team40demo_page.cityTextBox.sendKeys("Manhattan");
        //team40demo_page.countryDropdown.sendKeys("USA");
        team40demo_page.country.click();
        Driver.wait(1);
        team40demo_page.state.sendKeys("NJ");
        team40demo_page.account1.click();

        Driver.wait(1);
        team40demo_page.account2.click();
        Driver.wait(1);
        team40demo_page.zelle.click();
        Driver.wait(1);
        team40demo_page.employeeUserSave.click();
    }

    @Then("Employee logs out from account")
    public void employeeLogsOutFromAccount() {
        loginPage.loginDropdown.click();
        Driver.wait(1);
        team40demo_page.signOut.click();

    }

    @Then("User logs in to user account")
    public void userLogsInToUserAccount() {
        loginPage.loginDropdown.click();
        Driver.wait(1);
        team40demo_page.signIn.click();
        Driver.wait(1);
        team40demo_page.userName.sendKeys(ConfigurationReader.getProperty("user"));
        Driver.wait(1);
        team40demo_page.signPassword.sendKeys((ConfigurationReader.getProperty("customer_password")));
        Driver.wait(1);
        team40demo_page.signInButton.click();
        Driver.wait(3);
    }

    @And("User navigates to My Operations")
    public void userNavigatesToMyOperations() {
        Driver.waitAndClick(team40demo_page.myOperations);
        Driver.wait(1);
        team40demo_page.transferMoneyButton.click();
        Driver.wait(1);
    }

    @Then("User makes money transfer between accounts")
    public void userMakesMoneyTransferBetweenAccounts() {
        amountOfMoneyTransfer=150;
        amountOfMoneyTransferCent=10;

        Select select1 = new Select(team40demo_page.fromAccount);
        select1.selectByIndex(1);
        Driver.wait(2);
        Select select2 = new Select(team40demo_page.toAccount);
        select2.selectByIndex(1);
        Driver.wait(2);
        team40demo_page.balance.sendKeys(amountOfMoneyTransfer+"");
        Driver.wait(1);
        team40demo_page.balanceCent.clear();
        Driver.wait(1);
        team40demo_page.balanceCent.sendKeys(""+amountOfMoneyTransferCent);
        Driver.wait(1);
        team40demo_page.description.sendKeys("Rent");
        Driver.wait(1);
        team40demo_page.makeMoneyTransferButton.click();
        Driver.wait(1);

    }
    @And("User verifies their money transfer")
    public void userVerifiesTheirMoneyTransfer() {
        team40demo_page.myOperations.click();
        Driver.wait(1);
        team40demo_page.myAccount.click();
        Driver.wait(1);
        Assert.assertEquals(totalBalance1-amountOfMoneyTransfer*100+amountOfMoneyTransferCent+"",team40demo_page.firstAccountBalance.getText());
        Assert.assertEquals(totalBalance1-amountOfMoneyTransfer*100+amountOfMoneyTransferCent+"",team40demo_page.secondAccountBalance.getText());
        Driver.wait(5);

    }
}
