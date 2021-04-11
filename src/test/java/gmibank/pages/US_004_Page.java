package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_004_Page {
    public US_004_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy (id = "login-item")
    public WebElement login;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")
    public WebElement userNameVerify;

    @FindBy (xpath = "//*[@class='btn btn-secondary']")
    public WebElement cancelButton;

}
