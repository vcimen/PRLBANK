package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_003_Page {
    public static US_003_Page us_003_page;
    public US_003_Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement register;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div[2]")
    public WebElement anyWhere;

    @FindBy(xpath = "//*[@name='firstPassword']")
    public WebElement firstPassword;

    @FindBy(xpath = "//*[@name='secondPassword']")
    public WebElement secondPassword;

    @FindBy(xpath = "//*[@id=\"register-submit\"]/span")
    public WebElement underRegisterButton;

    @FindBy(xpath = "//*[@id=\"register-form\"]/div[1]/div")
    public WebElement confirmationWritting;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy (xpath = "(//li[@class='point'])[1]")
    public WebElement line1;

    @FindBy (xpath = "(//li[@class='point'])[2]")
    public WebElement line2;

    @FindBy (xpath = "(//li[@class='point'])[3]")
    public WebElement line3;

    @FindBy (xpath = "(//li[@class='point'])[4]")
    public WebElement line4;

    @FindBy (xpath = "(//li[@class='point'])[5]")
    public WebElement line5;




}
