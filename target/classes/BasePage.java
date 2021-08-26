package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement find(By locator) {
        return driver.findElement(locator);

    }

    public WebElement findAll(By locator) {
        return (WebElement) driver.findElements(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void send(By locator, String text){
        find(locator).sendKeys(text);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoView();",find(locator));
        js.executeScript("window.scrollBy(0,850)");


    }

   /* public void alertAccept(){
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }*/


}
