package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Begüm on 06/02/2017.
 */
public class LoginPage extends Page{

    public LoginPage (WebDriver driver) { super(driver); }
    @FindBy(xpath = "//input[@id='email']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='pass']")
    private WebElement password;
    @FindBy(xpath="//label[@id='loginbutton']")

    private WebElement loginButton;
    public void setUsername(String user) {username.sendKeys(user);}
    public void setPassword(String pass) {password.sendKeys(pass);}

    public void login(String email, String pass) {
        setUsername(email);
        setPassword(pass);
        loginButton.click();
    }


}
