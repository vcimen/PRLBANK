package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Team40demo_Page {
    public Team40demo_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locator from homepage
    @FindBy(id = "account-menu")
    public WebElement accountMenu;
    // Locator from homepage
    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;
    // Locator from homepage
    @FindBy(xpath = "//*[text()=\"Register\"]")
    public WebElement registerButton;
    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement invalidFeedback;
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement Ssn;
    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id='address']")
    public WebElement address;
    @FindBy(xpath = "//*[@id='mobilephone']")
    public WebElement mobilePhone;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;
    @FindBy(xpath = "//ul[@id='strengthBar']")
    public WebElement strengthBar;
    @FindBy(xpath = "//li[@class='point']") // 5 cell with same xpath
    public List<WebElement> strengthBarCells;
    @FindBy(xpath = "//*[@id = \"secondPassword\"]")
    public WebElement secondPassword;
    @FindBy(xpath = "//*[@id= \"register-submit\"]")
    public WebElement underRegisterButton;
    @FindBy(xpath = "//*[@class= \"btn btn-primary\"]")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@id= \"password\"]")
    public WebElement signPassword;
    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administration;
    @FindBy(xpath = "//span[.='User management']")
    public WebElement user_Management;

    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement adminDropdownMenu;
    @FindBy(xpath = "//a[@href='/admin/user-management']")
    public WebElement userManagementButton;
    @FindBy(xpath = "//td[2]")
    public List<WebElement> rowIds;
    @FindBy(xpath = "//span[@class='badge badge-info']")
    public List<WebElement> userRoles;
    @FindBy(xpath = "//a[@aria-label = 'Next']")
    public WebElement nextPage;
    @FindBy(xpath = "//a[@aria-label = 'Previous']")
    public WebElement previousPage;
    @FindBy(xpath = "//a[text() = '««']")
    public WebElement firstPage;
    @FindBy(xpath = "//a[text() = '»»']")
    public WebElement lastPage;
    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement backButton;
    @FindBy(xpath = "//input[@name='activated']")
    public WebElement activateCheckbox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;




    @FindAll ({@FindBy(xpath = "//tbody/tr")})
    public static List<WebElement> customerUserNames;
    @FindAll ({@FindBy(xpath = "//tbody/tr/td[4]")})
    public static List<WebElement> activation;





    public static void main(String[] args) {
        for (int i = 0; i < customerUserNames.size(); i++) {
            if(customerUserNames.get(i).getText().equalsIgnoreCase("admin40")){
                activation.get(i).click();
            }

        }
    }


}
