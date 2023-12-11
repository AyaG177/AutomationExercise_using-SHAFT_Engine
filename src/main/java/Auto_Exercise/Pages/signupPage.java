package Auto_Exercise.Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class signupPage {
    private  SHAFT.GUI.WebDriver driver;
    private final By signupPageTitle = By.xpath("//h2[contains(text(),\"New User\")]");
    private final By Name_input= By.xpath("//input[@placeholder='Name']");
    private final By Email_input= By.xpath("//input[@data-qa='signup-email']");
    private final By ClickOnSignup_Button= By.xpath("//button[@data-qa='signup-button']");
    public signupPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    public void newUserSignup(String Name, String Email){
        driver.element().type(Name_input,Name);
        driver.element().type(Email_input,Email);
        driver.element().click(ClickOnSignup_Button);
    }
    public void assertSignUppage(String expecteResult){
        String actualSignUpPageTitle = driver.element().getText(signupPageTitle);
        Assert.assertEquals(actualSignUpPageTitle,expecteResult);
    }
}
