package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyTransferPage {
    public MoneyTransferPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement usersMenuDropdown;



    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[text()='Transfer Money']")
    public WebElement transferMoneyButton;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccount;

    @FindBy(id = "toAccountId")
    public WebElement toAccount;

    @FindBy(xpath = "//*[@name='balance']")
    public WebElement balance;

    @FindBy(xpath = "(//*[@name= 'description'])[2]")
    public WebElement description;

    @FindBy(id = "make-transfer")
    public WebElement makeMoneyButton;
}
