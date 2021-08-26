package BuyTheProductScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.BasePage;

public class ProductPage extends BasePage {

    By checkBoxAppleLocator = By.xpath("//div[@class='srch-aggrgtn-cntnr']//div[2]//div[2]//a[1]//div[1]");
    By selectProduct = By.cssSelector("span[title=\"Mgn93tu/a Macbook Air/ M1/256gb/13.3'' Laptop Silver\"]");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void checkBoxApple(){
        click(checkBoxAppleLocator);
    }

    public void selectProduct(){
        click(selectProduct);

    }

}
