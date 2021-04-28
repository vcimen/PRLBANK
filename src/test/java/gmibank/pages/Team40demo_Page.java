package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(xpath = "//a[text()='2']")
    public WebElement secondPage;
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
    @FindBy(xpath = "//span[text()='Created date']")
    public WebElement createdDate;
    @FindBy(xpath = "//a[@href='/admin/user-management/star_tester5/edit']")
    public WebElement starTester;
    @FindBy(id = "activated")
    public WebElement activated;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement edit_save;
    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;
    //My Operations - Employee - User
    @FindBy(id="entity-menu")
    public WebElement myOperations;
    @FindBy(xpath = "//*[text()='My Accounts']")
    public WebElement myAccount;
    @FindBy(linkText = "Manage Customers")
    public WebElement manageCustomers;
    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;
    @FindBy(id="search-ssn")
    public WebElement SSN;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement searchSSN;
    @FindBy(name = "middleInitial")
    public WebElement middleinitialTextBox;
    @FindBy(name = "phoneNumber")
    public WebElement phonenumberTextBox;
    @FindBy(name = "zipCode")
    public WebElement zipcodeTextBox;
    @FindBy(name = "city")
    public WebElement cityTextBox;
    @FindBy(name = "createDate")
    public  WebElement createDate;
    @FindBy(xpath = "//select[@name='country.id']/option[133]")
    public WebElement country;
    @FindBy(name = "state")
    public WebElement state;
    @FindAll ({@FindBy(xpath = "//select[@name='accounts']")})
    public static List<WebElement> accounts;
    @FindBy(xpath = "(//*[text()='Team40account1'])")
    public WebElement account1;
    @FindBy(xpath = "(//*[text()='Team40account2'])")
    public WebElement account2;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement employeeUserSave;
    @FindBy(name = "user.id")
    public WebElement userDropdown;
    @FindBy(id = "save-entity")
    public WebElement saveButtonEmployeeUser;
    @FindBy(id="tp-customer-zelleEnrolled")
    public WebElement zelle;


    @FindBy(xpath = "//*[text()='Transfer Money']")
    public WebElement transferMoneyButton;
    @FindBy(id = "fromAccountId")
    public WebElement fromAccount;
    // @FindBy(xpath = "//*[text()='CHECKING-3562-20$']")
    //public WebElement checking;
    //@FindBy(xpath = "//*[text()='SAVING-3563-30$']")
    //public WebElement saving;
    @FindBy(id = "toAccountId")
    public WebElement toAccount;
    @FindBy(xpath = "//*[@name='balance']")
    public WebElement balance;
    @FindBy(id = "balancecent")
    public WebElement balanceCent;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement validation;

    @FindBy(xpath = "(//*[@name= 'description'])[2]")
    public WebElement description;
    @FindBy(id = "make-transfer")
    public WebElement makeMoneyTransferButton;
    @FindBy(xpath = "(//td)[3]")
   public WebElement firstAccountBalance;
   @FindBy(xpath = "(//td)[7]")
   public WebElement secondAccountBalance;




    @FindAll ({@FindBy(xpath = "//tbody/tr")})
    public static List<WebElement> customerUserNames;
    @FindAll ({@FindBy(xpath = "//tbody/tr/td[4]")})
    public static List<WebElement> activation;

    public void scroolPage(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public static void main(String[] args) {
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getText().equalsIgnoreCase("Team40account")){
                activation.get(i).click();
            }

        }
    }
}
