package BuyTheProductScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.BasePage;

public class MyBasketPage extends BasePage {
    By validatePriceLocator = By.cssSelector("p[title='9.692,24 TL']");

    public MyBasketPage(WebDriver driver) {
        super(driver);
    }

    public double validatePrice(){
       String price = find(validatePriceLocator).getText().split(",")[0];
        double priceAmount = Double.parseDouble(price);
        return priceAmount;

    }
}
