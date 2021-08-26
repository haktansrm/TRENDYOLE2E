package testcase;

import BuyTheProductScreens.HomePage;
import BuyTheProductScreens.MyBasketPage;
import BuyTheProductScreens.ProductDetailPage;
import BuyTheProductScreens.ProductPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.BasePage;
import resources.BaseTest;

public class BuyProductTest extends BaseTest {
    public static Logger Log = LogManager.getLogger(BaseTest.class.getName());
    double realPrice = 9.691;


    @Test
    public void buyProduct() throws InterruptedException {
        HomePage hp = new HomePage(driver);

        hp.searchBox("macbook air m1");
        Thread.sleep(2000);
        ProductPage pp = new ProductPage(driver);


        pp.checkBoxApple();
        BasePage bp = new BasePage(driver);
        bp.scroll();
        pp.selectProduct();
        ProductDetailPage pdp = new ProductDetailPage(driver);
        pdp.windowHandles();

        pdp.addToProduct();
        Thread.sleep(1000);
        pdp.goToBasket();
        MyBasketPage mbp = new MyBasketPage(driver);
        Assert.assertEquals(mbp.validatePrice(),realPrice);
        Log.info("Prices matched");






    }

}
