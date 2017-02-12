package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by Begüm on 06/02/2017.
 */
public class GroupPage extends Page {
    public GroupPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@class='_3-8y _3-90 rfloat _ohf img sp_kDIj_sn6ezr sx_305811']")
    private WebElement setPrivacy1;
    @FindBy(xpath = "//*[@aria-labelledby='groupsCreateName']")
    private WebElement groupName;
    @FindBy(xpath = "//*[@data-placeholder='Enter names or email addresses...']")
    private WebElement addEmail;
    @FindBy(xpath = "//li[contains(@class,'__MenuItem')]/descendant::a[@role='menuitemcheckbox']")
    private List<WebElement> setPrivacy2;
    @FindBy(xpath = "//*[@class='_42ft _4jy0 layerConfirm _29bh uiOverlayButton _4jy3 _4jy1 selected _51sy']")
    //@FindBy(className="_42ft _4jy0 layerConfirm _29bh uiOverlayButton _4jy3 _4jy1 selected _51sy")
    private WebElement clickCreateButton;
    //@FindBy(xpath="//img[@src='/images/groups/invite/email-icon.png']")
    //@FindBy(id="js_1nw")
    //@FindBy(xpath="//*[@class='subtext']")
    @FindBy(xpath = "//*[@role='listbox']")
    private WebElement emailPopUp;

    public void setPrivacy() {
        setPrivacy1.click();
    }

    public void setPrivacy2() {
        setPrivacy2.get(2).click();
    }

    public void nameTheGroup(String name) throws InterruptedException {
        groupName.sendKeys(name);
        //Thread.sleep(5000);
        //emailPopUp.click();
        // System.out.println(this.driver.getPageSource());
    }

    public void addEmail(String email) throws InterruptedException {
        addEmail.sendKeys(email);
        Thread.sleep(2000);
        emailPopUp.click();
    }


    public void clickCreateButton() throws InterruptedException {

        clickCreateButton.click();
        Thread.sleep(5000);
    }
}