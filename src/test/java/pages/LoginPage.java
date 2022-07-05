package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class= 'button -icon-stacked ngcw-main-navigation__sign-in ngcw-main-navigation__main-button']")
    public WebElement signInRegisterBtn;


    @FindBy(xpath = "//*[@id='main-navigation']/ul/li[7]/a/span")
    public WebElement signInRegisterBtn2;

    @FindBy(id = "signInName")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id='attributeVerification']/div[6]/button[1]")
    public WebElement signInBtn;


    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div/div/div[1]/div/button[2]/h3")
    public WebElement selectNYCregionBtn;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div/div/div[2]/div/div/button[2]/p")
    public WebElement selectWhichRegionBtn;


    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div/div/div[3]/div/div/a[1]/h3")
    public WebElement selectTypeOfCustomer;



    @FindBy(xpath = "//*[@id='actual_content']/div/div/form/input[1]")
    public WebElement goHomeBtn;

    @FindBy(xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/button[2]")
    public WebElement directionNYdownTown;










}