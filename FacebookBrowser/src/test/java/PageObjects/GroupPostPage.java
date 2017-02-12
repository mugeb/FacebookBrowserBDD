package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Begüm on 09/02/2017.
 */
public class GroupPostPage extends Page{
    public GroupPostPage(WebDriver driver) {super (driver);}

    @FindBy(xpath="//*[@placeholder='Write something...']")
    private WebElement writeWelcomePost;

    public void writeWelcomePost(String welcome) {
        writeWelcomePost.sendKeys(welcome);
    }



}








