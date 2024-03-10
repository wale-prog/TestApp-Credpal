package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends PageBase {
    public LandingPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Flutter Demo Home Page")
    private WebElement pageTitle;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Flutter Demo Home Page\"]/../../*")
    private List<WebElement> pageContent;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Flutter Demo Home Page\"]/../../*[5]")
    private WebElement counter;
    @AndroidFindBy(className = "android.widget.Button")
    private WebElement incrementalBtn;

    public WebElement getPageTitle() {
        return pageTitle;
    }
    public List<WebElement>getHomePageContent() {
        return pageContent;
    }
    public WebElement getCounter() {
        return counter;
    }
    public WebElement getIncrementalBtn() {
        return incrementalBtn;
    }
    public void clickIncrementalBtn() {
        click(incrementalBtn);
    }
}
