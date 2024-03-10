package Tests;

import BaseClasses.TestBase;
import Pages.LandingPage;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class Counter extends TestBase {
    LandingPage landingPage;

    @Test(priority = 1, description = "Verify that the initial count is zero(0)")
    public void TC_004_validateInitialCounterValueIsZero(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Counter");
        landingPage = new LandingPage(driver);
        validateText(landingPage.getCounter(), "0");
    }
    @Test(priority = 2, description = "Verify that the increment button at the buttom right corner on the home page is visible")
    public void TC_005_validateIncrementalButtonIsVisible(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Counter");
        validateAttribute(landingPage.getIncrementalBtn(), "displayed", true);
    }
    @Test(priority = 3, description = "Verify that the increment button at the buttom right corner on the home page is clickable")
    public void TC_006_validateIncrementalButtonIsClickable(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Counter");
        validateAttribute(landingPage.getIncrementalBtn(), "clickable", true);
    }
    @Test(priority = 4, description = "Verify that when user clicks on the incremental button at the bottum right corner, the counter increases")
    public void TC_007_validateThatUponClickingIncrementalButtonCounterIncreases(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Counter");
        landingPage.clickIncrementalBtn();
        validateText(landingPage.getCounter(), "1");
    }
}
