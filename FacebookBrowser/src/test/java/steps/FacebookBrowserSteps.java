package steps;

import PageObjects.*;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by Begüm on 03/02/2017.
 */
public class FacebookBrowserSteps {

    LoginPage loginPage;
    MainPage mainPage;
    NavigatorPage navigatorPage;
    GroupPage groupPage;
    IconPage iconPage;
    GroupPostPage groupPostPage;

    public FacebookBrowserSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        navigatorPage = new NavigatorPage(driver);
        groupPage = new GroupPage(driver);
        iconPage = new IconPage(driver);
        groupPostPage = new GroupPostPage(driver);
    }

    public void login(String username, String password) {
        loginPage.login(username,password);
    }

    public void clickAccSettings() {
        mainPage.clickAccSettings();
    }

    public void clickCreateGroup() {
        navigatorPage.clickCreateGroup();
    }

    public void nameTheGroup(String name) throws InterruptedException {
        groupPage.nameTheGroup(name);
    }
    public void addEmail(String email) throws InterruptedException{
        groupPage.addEmail(email);
    }

    public void setPrivacy() {
        groupPage.setPrivacy();
    }

    public void setPrivacystep2() {
        groupPage.setPrivacy2();
    }


    public void clickCreateButton() throws InterruptedException{ groupPage.clickCreateButton();
    }

    public void chooseAnIcon() { iconPage.chooseAnIcon();
    }

    public void checkIfItHasSuccess() {
    }

    public void writeWelcomePost(String welcome) {
        groupPostPage.writeWelcomePost(welcome);
    }
}
