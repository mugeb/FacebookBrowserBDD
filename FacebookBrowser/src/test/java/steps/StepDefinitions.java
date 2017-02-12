package steps;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Begüm on 03/02/2017.
 */

public class StepDefinitions {
    FacebookBrowserSteps bojoUser;
    WebDriver driver;
    @Before
    public void setupTest() throws Throwable {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
       // capabilities.setCapability("chrome.binary", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Begüm\\workspace\\Constructor\\chromedriver.exe");
        capabilities.setCapability("chrome.debuggerAddress", "127.0.0.1:4723");

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.get("https://www.facebook.com");

        bojoUser = new FacebookBrowserSteps(driver);
        Thread.sleep(2000);
    }




    @Given("^Bojo opens the Facebook in Google Chrome$")
    public void navigateToFacebook() throws Throwable {
        //bojoUser.driver.navigate().to("https://www.facebook.com");
    }

    @And("^Bojo logs in with ([^\"]*) and ([^\"]*)$")
    public void userLogin(String username, String password) throws Throwable {
        bojoUser.login(username,password);
    }

    @And("^Bojo clicks Account Settings button$")
    public void accountSettings() throws Throwable {
        bojoUser.clickAccSettings();
    }

    @Then("^Bojo clicks Create Group button$")
    public void createGroup() throws Throwable {
        bojoUser.clickCreateGroup();
    }

    @And("^Bojo names the group as ([^\"]*)$")
    public void setGroupName(String name) throws Throwable {
        bojoUser.nameTheGroup(name);
    }

    @And("^Bojo adds an email of a friend which is ([^\"]*)$")
    public void addGroupParticipants(String email) throws Throwable {
         bojoUser.addEmail(email);
    }

    @Then("^Bojo clicks the privacy settings button$")
    public void bojoSetsTheGroupPrivacyAsSecretGroup() throws Throwable {
        bojoUser.setPrivacy();
    }

    @And("^Bojo sets the group privacy as Secret Group$")
    public void bojoClicksThePrivacySettingsButton() throws Throwable {
        bojoUser.setPrivacystep2();
    }

    @And("^Bojo clicks Create button$")
    public void bojoClicksCreateButton() throws Throwable {
        bojoUser.clickCreateButton();
    }

    @Then("^Bojo choose an icon Bear and clicks OK$")
    public void bojoChooseAnIconBearAndClicksOK() throws Throwable {
        bojoUser.chooseAnIcon();
}

    @And("^Bojo checks if the group has been created successfully$")
    public void bojoChecksIfTheGroupHasBeenCreatedSuccessfully() throws Throwable {
        bojoUser.checkIfItHasSuccess();
    }

    @And("^Bojo write a Welcome post: ([^\"]*)$")
    public void bojoWriteAWelcomePostWelcomeToOurSecretGroup(String welcome) throws Throwable {
        bojoUser.writeWelcomePost(welcome);
    }

    @After
    public void quit() throws InterruptedException{
        Thread.sleep(4000);
        driver.quit();
    }

}
