package PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Begüm on 09/02/2017.
 */
public class IconPage extends Page {
    public IconPage(WebDriver driver) { super (driver);
    }

    //@FindBy(xpath ="//li[@id='icon_357176870987957']")
    @FindBy(xpath ="//i[@class='sp_PSgbS8KX8-4 sx_faa883']")
    private WebElement chooseAnIcon;


    public void chooseAnIcon() {
        chooseAnIcon.click();
    }
}
