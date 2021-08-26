package SignUpScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import resources.BasePage;

public class SignUpPage extends BasePage {
    By genderLocator = By.cssSelector(".modal-close");
    WebElement moveToSingup= (WebElement) find(By.cssSelector("div[class='link account-user'] div[class='icon-container']"));
    By singUpButtonLocator = By.cssSelector(".signup-button");
    By singUpEmailLocator = By.id("register-email");
    By singUpPasswordLocator = By.id("register-password-input");
    By signUpGenderSelect= By.xpath("//span[normalize-space()='Erkek']");
    By signUpCheckBoxLocator= By.cssSelector(".q-typography.q-body.q-inline.black");
    By andSignUpButtonLocator = By.cssSelector("button[type='submit']");
    By closeLocator = By.cssSelector(".ty-cross");
    By validateEmailLocator= By.cssSelector(".title");
    By signUpLoginButtonLocator = By.cssSelector(".q-secondary.q-button-medium.q-button.tab.button.mr-5.left");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void genderSelect(){
        click(genderLocator);

    }



    public void MoveToSignUpButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(moveToSingup).build().perform();

    }

    public void singUpButton(){
        click(singUpButtonLocator);
    }
    public void signUpEmail(String text){
        send(singUpEmailLocator,text);

    }
    public void signUpPassword(String text){
         send(singUpPasswordLocator,text);
    }
    public void signUpGender(){
        click(signUpGenderSelect);

    }
    public void signUpCheckBox(){
        click(signUpCheckBoxLocator);

    }
    public void andSignUpButton(){
        click(andSignUpButtonLocator);
    }
    public String validateEmail(){
        return find(validateEmailLocator).getText();
    }
    public void closeButton(){
        click(closeLocator);
    }

    public void signUpLoginButtonLocator(){
        click(signUpLoginButtonLocator);
    }
}
