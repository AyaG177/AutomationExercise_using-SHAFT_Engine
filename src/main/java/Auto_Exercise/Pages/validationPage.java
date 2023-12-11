package Auto_Exercise.Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class validationPage {
    private  SHAFT.GUI.WebDriver driver;
    private final By accountInformationTitle= By.xpath("//b[contains(text(),\"Account Created\")]");
    public validationPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public void assertAccountCreated(String expectedResult){
        String actualAccountCreated = driver.element().getText(accountInformationTitle);
        Assert.assertEquals(actualAccountCreated, expectedResult);
    }
}
