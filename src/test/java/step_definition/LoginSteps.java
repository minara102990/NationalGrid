package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

import static junit.framework.TestCase.assertEquals;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        String url = ConfigurationReader.getProperty("Url");
        Driver.getDriver().get(url);


    }

    @When("user enters username")
    public void user_enters_username() {
        BrowserUtils.wait(3);

        loginPage.signInRegisterBtn.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.selectNYCregionBtn).click().perform();
        actions.moveToElement(loginPage.selectWhichRegionBtn).click().perform();
        actions.moveToElement(loginPage.selectTypeOfCustomer).click().perform();
        BrowserUtils.wait(2);

        loginPage.goHomeBtn.click();
        BrowserUtils.wait(5);
        actions.moveToElement(loginPage.signInRegisterBtn2).click().perform();


        BrowserUtils.wait(5);
        loginPage.directionNYdownTown.click();
        BrowserUtils.wait(5);
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("Username"));


    }

    @When("user enters password")
    public void user_enters_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("Password"));
        BrowserUtils.wait(5);

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.signInBtn.click();

        BrowserUtils.wait(10);
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Natural Gas & Electricity | National Grid"));
        String expectedTitle="Natural Gas & Electricity | National Grid";
        String actualTitle=Driver.getDriver().getTitle();
        assertEquals("Title did not match!",expectedTitle,actualTitle);

        BrowserUtils.wait(10);
    }

}
