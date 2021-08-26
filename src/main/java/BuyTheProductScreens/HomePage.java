package BuyTheProductScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.BasePage;

public class HomePage extends BasePage {
    By searchBoxLocator = By.cssSelector(".search-box");
    By searchIconLocator = By.cssSelector(".search-icon");
    By genderProductLocator = By.cssSelector(".modal-close");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchBox(String text) throws InterruptedException {
        click(genderProductLocator);
        send(searchBoxLocator,text);
        Thread.sleep(1000);
        click(searchIconLocator);


    }
}
