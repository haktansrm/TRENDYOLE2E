package BuyTheProductScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.BasePage;

import java.util.Iterator;
import java.util.Set;

public class ProductDetailPage extends BasePage {
    By addToProductLocator = By.xpath("//button[@class='add-to-basket']");
    By goToBasketLocator = By.cssSelector(".goBasket");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToProduct(){
        driver.getWindowHandle();
        click(addToProductLocator);
    }
    public void goToBasket(){
        click(goToBasketLocator);
    }

    public void windowHandles(){
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);

    }
}
