package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import static org.openqa.selenium.By.xpath;

/**
 * Created by Begüm on 06/02/2017.
 */
public class NavigatorPage extends Page{
    public NavigatorPage(WebDriver driver) {super (driver);}


    //@FindBys({@FindBy(className = "Create Group"), @FindBy(xpath =("//*[@id=\"BLUE_BAR_ID_DO_NOT_USE\"]/div/div/div[1]/div/div/ul/li[4]/a/span/span"))})
            //@FindBy(xpath =("//*[@id=\"BLUE_BAR_ID_DO_NOT_USE\"]/div/div/div[1]/div/div/ul/li[4]/a/span/span"))
    //@FindBy(className= "_54nh",  "Create Group")
    //@FindBy(how= How.NAME, using="Create Group")
    //@FindBys ({@FindBy(xpath=("//*[@id=\"BLUE_BAR_ID_DO_NOT_USE\"]/div/div/div[1]/div/div/ul/li[7]/a/span/span")), @FindBy(how= How.NAME, using="Create Group")})
    //@FindBy(name="Create Group")
    @FindBy(xpath=("//*[@id=\"BLUE_BAR_ID_DO_NOT_USE\"]/div/div/div[1]/div/div/ul/li[3]/a/span/span"))
    //@FindBy(xpath="//input[@name='Create Group']")
    private WebElement createGroup;
    public void clickCreateGroup() {
        createGroup.click();
    }
}
