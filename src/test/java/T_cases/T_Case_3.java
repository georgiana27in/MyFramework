package T_cases;

import Base.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class T_Case_3 extends TestBase {
    @Test
    public void putproductstocart() throws InterruptedException {
        test = extent.createTest(" Log in ;Putting products to cart ; Log out", "Case3 : User verifies if he can log in and put products to cart")
                .assignCategory("Functional.testcase")
                .assignAuthor("NiculaeGeorgiana");
        logger.info("Verify URL");
        openURL("https://www.nichiduta.ro/");
        Utils.clickOnButton(Homepage.returntoHomePage);
        Utils.clickOnButton(Homepage.accountBtn);
        Utils.clickOnButton(Homepage.intraINcontBtn);
        test.log(Status.INFO, "Click on Account button and click on enter account button ");
        logger.info("Click on Account button and click on enter account button ");

        Utils.enterText(SignInPage.email, "georgianatest16@gmail.com");
        test.log(Status.INFO, "Add e-mail");
        logger.info("Add e-mail");
        Utils.enterText(SignInPage.password, "testpaSS@.");
        test.log(Status.INFO, "Add password");
        logger.info("Add password");
        Utils.clickOnButton(SignInPage.signinBtn);
        test.log(Status.INFO, "Click on Sign in Button");
        logger.info("Click on Sign in Button");


        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.clickOnButton(produseGravide.produs1);
        Utils.clickOnButton(adaugainCosPage.addcartp1);
        test.log(Status.INFO, "Click on Gravide section , then click on 1st product and put it in the cart");
        logger.info("Click on Gravide section , then click on 1st product and put it in the cart");

        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "delete first product prom cart");
        logger.info("Delete first product from cart");

        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.clickOnButton(produseGravide.produs2);
        Utils.clickOnButton(adaugainCosPage.addcartp2);
        test.log(Status.INFO, "Click on Gravide section , then click on 2nd product and put it in the cart");
        logger.info("Click on Gravide section , then click on 2nd product and put it in the cart");

        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "delete second product prom cart");
        logger.info("Delete second product from cart");

        Utils.waitForElementVisible(Homepage.gravideBtn);
        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.clickOnButton(produseGravide.produs3);
        Utils.clickOnButton(adaugainCosPage.addcartp3);
        test.log(Status.INFO, "Click on Gravide section , then click on 3rd product and put it in the cart");
        logger.info("Click on Gravide section , then click on 3rd product and put it in the cart");

        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "delete third product prom cart");
        logger.info("Delete third product from cart");

        Utils.clickOnButton(logoutPage.accountBtn);
        test.log(Status.INFO, "Return to account detais page");
        logger.info("Return to account detais page");
        Utils.clickOnButton(logoutPage.logOutBtn);
        test.log(Status.INFO, "Click on log out button");
        logger.info("Click on log out button");
    }}



