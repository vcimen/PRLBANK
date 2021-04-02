package gmibank.stepdefinitions;
import gmibank.pages.SamplePage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sample {

    SamplePage samplePage = new SamplePage();

    @And("you should navigate to registration page")
    public void youShouldNavigateToRegistrationPage() {
        samplePage.humanIcon.click();
        samplePage.registerButton.click();
    }
    @Then("Click on SSN textbox")
    public void clickOnSSNTextbox() {
    }
    @And("Provide the SNN of the applicant")
    public void provideTheSNNOfTheApplicant() {
    }
    @And("Then I should not see the error message translation-not-found[Your SSN is required]")
    public void thenIShouldNotSeeTheErrorMessageTranslationNotFoundYourSSNIsRequired() {
    }
    @Given("Go to {string}")
    public void goTo(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url)); // methoddan gelen data gmibank_url
    }
}
