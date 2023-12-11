package Auto_Exercise.Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class homePage {
    private  SHAFT.GUI.WebDriver driver;

    String homePageURL= "https://automationexercise.com/";

    // Locators
    private final By signupButton = By.xpath("//i[@class=\"fa fa-lock\"]");

    public homePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    // Actions
    public void navigateTohomePage() {
        driver.browser().navigateToURL(homePageURL);
    }
    public void clickonSignup() {driver.element().click(signupButton);}
    public void asserthomepage(String expecteResult){
        driver.browser().assertThat().url().isEqualTo(expecteResult);
    }

}
