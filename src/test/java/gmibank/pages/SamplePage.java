package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePage {

    public SamplePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=\"Register\"]")
    public WebElement registerButton;


    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement humanIcon;
}