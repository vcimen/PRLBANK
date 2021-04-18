package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_005_Page {
    public US_005_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement loginDropdown;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy( id = "password")
    public WebElement password;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement loginButton;
    @FindBy( xpath = "//*[@id='account-menu']")
    public WebElement signOutDropDown;
    @FindBy( xpath = "//*[text()='Sign out']")
    public WebElement signOutButton;
    @FindBy(xpath = "//div[@class='alert alert-danger fade show']/span/strong")
    public WebElement FailedToSignIn;
    @FindBy(xpath = "//a[@href='/account/reset/request']")
    public WebElement forgetPasswordLink;
    @FindBy(xpath = "//span[text()='Reset your password']")
    public WebElement resetPasswordText;
}


