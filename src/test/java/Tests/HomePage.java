package Tests;

import BaseClasses.TestBase;
import Pages.LandingPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class HomePage extends TestBase {

    LandingPage landingPage;
   private Logger log = LogManager.getLogger(this);

    @Test(priority = 1, description = "Verify user is able to launch the test app")
    public void TC_001_validateUserCanLaunchApp(Method method) {
        landingPage = new LandingPage(driver);
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "LandingPage");
        validateText(landingPage.getPageTitle(), testData.getProperty("pageTitleText"));
    }
    @Test(priority = 2, description = "Verify that the home page header text is visible to user")
    public void TC_002_validateUserCanSeeHomePageHeader(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "LandingPage");
        validateAttribute(landingPage.getPageTitle(), "displayed", true);
    }
    @Test(priority = 3, description = "Verify that correct body of text is displayed on the App")
    public void TC_003_validateCorrectTextIsDisplayed(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "LandingPage");
        boolean testPassed = true;
        String[] homePageContent = testData.getProperty("homePageContent").split(";");
        for(int i = 0; i < homePageContent.length; i += 1 ) {
            try {
                validateText(landingPage.getHomePageContent().get(i + 1), homePageContent[i]);
            }catch (AssertionError e) {
                testPassed = false;
                log.error("Expected text is " + homePageContent[i] + " | " + "actual text is " + landingPage.getHomePageContent().get(i + 1).getAttribute("content-desc"));
            }
        }
        if (!testPassed) {
            Assert.fail("One or more text on the screen has typographical error, please check the logs for more information");
        }
    }
}
