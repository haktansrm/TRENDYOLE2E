package testcase;

import SignUpScreens.LoginPage;
import SignUpScreens.SignUpPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.BaseTest;

public class SignUpTest extends BaseTest {
    public static Logger Log = LogManager.getLogger(BaseTest.class.getName());


    @Test
    public void signUpTest() throws InterruptedException {
        SignUpPage sup = new SignUpPage(driver);
        sup.genderSelect();
        sup.MoveToSignUpButton();
        sup.singUpButton();
        sup.signUpEmail("srmhktan@mail.com");
        sup.signUpPassword("123456a");
        sup.signUpGender();
        sup.signUpCheckBox();
        sup.andSignUpButton();
        Assert.assertEquals(sup.validateEmail(),"E-POSTA DOĞRULAMA");
        Log.info("email correct");
        sup.closeButton();
        sup.signUpLoginButtonLocator();

        LoginPage lp = new LoginPage(driver);
        lp.loginPageProcces("siramhaktan@gmail.com","456852.,l");
        Assert.assertEquals(lp.validateMember(),"Giriş Yap");
        Log.info("Login matched");




    }
}
