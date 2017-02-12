package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Begüm on 06/02/2017.
 */
public class MainPage extends Page{

    public MainPage(WebDriver driver) { super(driver);}

    @FindBy(id = "userNavigationLabel")
    private WebElement navigator;
    public void clickAccSettings() {
        navigator.click();
    }
}
