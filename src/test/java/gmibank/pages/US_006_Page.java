package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_006_Page {

        public US_006_Page() {

            PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy(id = "account-menu")
    public WebElement loginDropdown;

    @FindBy(xpath = "//span[text()='Sign in'][1]")
    public WebElement SignInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public  WebElement login;


    @FindBy(xpath = "(//a[@aria-haspopup='true'])[3]")
    public WebElement UserJamesJohn;

    @FindBy(xpath = "//span[text()='User Info']")
    public WebElement userInfoBtn;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement dropDownSelect;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;


}
