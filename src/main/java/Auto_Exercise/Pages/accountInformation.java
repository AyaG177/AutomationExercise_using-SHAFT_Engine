package Auto_Exercise.Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class accountInformation {
    private  SHAFT.GUI.WebDriver driver;
    private final By accountInfopageTitle = By.xpath("//b[contains(text(),\"Enter Account\")]");
    private final By Title= By.id("id_gender2");
    private final By Password= By.id("password");
    private final By Year_input= By.id("years");
    private final By Month_input= By.id("months");
    private final By Day_input= By.id("days");
    private final By newsLetter=By.id("newsletter");
    private final By option=By.id("optin");
    private final By FirstName= By.id("first_name");
    private final By LastName= By.id("last_name");
    private final By Company= By.id("company");
    private final By Address1= By.id("address1");
    private final By Address2= By.id("address2");
    private final By Country= By.id("country");
    private final By State= By.id("state");
    private final By City= By.id("city");
    private final By ZipCode= By.id("zipcode");
    private final By MobileNumber= By.id("mobile_number");
    private final By submitButton= By.xpath("//button[contains(text(),\"Create Account\")]");
    public accountInformation(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public void enterAccountInfo(String password, String Day, String month, String year, String firstname,
                                    String lastname, String company, String address1, String address2,
                                    String country, String state, String city, String zipcode, String mobilenumber){
        driver.element()
                .click(Title)
                .type(Password,password)
                .select(Day_input,Day)
                .select(Month_input,month)
                .select(Year_input,year)
                .click(newsLetter)
                .click(option)
                .type(FirstName,firstname)
                .type(LastName,lastname)
                .type(Company,company)
                .type(Address1,address1)
                .type(Address2,address2)
                .select(Country,country)
                .type(State,state)
                .type(City,city)
                .type(ZipCode,zipcode)
                .type(MobileNumber,mobilenumber)
                .click(submitButton);
    }
    public void assertEnterAccountInfoPage(String expectedResult){
        String actualAccountInfoTitle = driver.element().getText(accountInfopageTitle);
        Assert.assertEquals(actualAccountInfoTitle, expectedResult);
    }
}
