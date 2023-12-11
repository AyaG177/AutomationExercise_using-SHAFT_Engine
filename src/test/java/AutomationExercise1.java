
import Auto_Exercise.Pages.accountInformation;
import Auto_Exercise.Pages.homePage;
import Auto_Exercise.Pages.signupPage;
import Auto_Exercise.Pages.validationPage;
import Framework.Engine.PropertiesReader;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationExercise1 {
    SHAFT.TestData.JSON testData;
    SHAFT.GUI.WebDriver driver;
    private Auto_Exercise.Pages.homePage homePage;
    private signupPage signupPage;
    private validationPage validationPage;
    private accountInformation accountInformation;

    @BeforeClass
    public void beforeClass(){

        testData = new SHAFT.TestData.JSON("src/test/resources/Test Data/TestData.json");
        driver = new SHAFT.GUI.WebDriver();
        homePage=new homePage(driver);
        signupPage=new signupPage (driver);
        validationPage=new validationPage(driver);
        accountInformation=new accountInformation(driver);
        homePage.navigateTohomePage();
    }
    @Test
    public void test1() {homePage.asserthomepage(testData.getTestData("homepagelink"));}

    @Test
    public void test2() {
        homePage.clickonSignup();
        signupPage.assertSignUppage(testData.getTestData("signupPage.title"));
        //
        signupPage.newUserSignup(testData.getTestData("signupPage.Name"), testData.getTestData("signupPage.Email"));
        //
        accountInformation.assertEnterAccountInfoPage(testData.getTestData("accountInformation.title"));

    }
    @Test
    public void test3(){
        accountInformation.enterAccountInfo(testData.getTestData("accountInformation.form.password"), testData.getTestData("accountInformation.form.Day"),
                testData.getTestData("accountInformation.form.Month"), testData.getTestData("accountInformation.form.Year"),
                testData.getTestData("accountInformation.form.FirstName"), testData.getTestData("accountInformation.form.LastName"),
                testData.getTestData("accountInformation.form.Company"), testData.getTestData("accountInformation.form.Address1"),
                testData.getTestData("accountInformation.form.Address2"), testData.getTestData("accountInformation.form.Country"),
                testData.getTestData("accountInformation.form.State"), testData.getTestData("accountInformation.form.City"),
                testData.getTestData("accountInformation.form.Zipcode"), testData.getTestData("accountInformation.form.mobileNumber"));
        validationPage.assertAccountCreated(testData.getTestData("accountInformation.validationPageTitle"));
    }


    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
