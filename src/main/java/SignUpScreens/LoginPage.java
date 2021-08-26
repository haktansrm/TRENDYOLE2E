package SignUpScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import resources.BasePage;

public class LoginPage extends BasePage {
    By loginEmailLocator = By.id("login-email");
    By loginPasswordLocator= By.id("login-password-input");
    By loginButtonLocator = By.cssSelector("button[type='submit']");
    By validateMemberLocator = By.cssSelector(".account-nav-item.user-login-container");



    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void loginPageProcces(String text, String text1){
        send(loginEmailLocator,text);

        send(loginPasswordLocator,text1);
        click(loginButtonLocator);


    }
    public String validateMember(){
       return find(validateMemberLocator).getText();
    }
}
