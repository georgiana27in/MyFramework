package T_cases;

import Base.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.SignInPage;
import pages.adaugainCosPage;
import pages.produseGravide;
import utils.Utils;

public class T_Case_3 extends TestBase {
    @Test
    public void putproductstocart() throws InterruptedException {
        test = extent.createTest("Putting products to cart", "Case3 : User verifies if he can log in and put products to cart")
                .assignCategory("Functional.testcase")
                .assignAuthor("NiculaeGeorgiana");
        logger.info("Verify URL");
        openURL("https://www.nichiduta.ro/");
        Utils.waitForElementToBeClickable(Homepage.accountBtn);
        Utils.clickOnButton(Homepage.accountBtn);
        Utils.waitForElementToBeClickable(Homepage.intraINcontBtn);
        Utils.clickOnButton(Homepage.intraINcontBtn);
        test.log(Status.INFO, "Click on Account button and click on enter account button ");
        logger.info("Click on Account button and click on enter account button ");

        Utils.waitForElementVisible(SignInPage.email);
        Utils.enterText(SignInPage.email, "georgianatest16@gmail.com");
        test.log(Status.INFO, "Add e-mail");
        logger.info("Add e-mail");
        Utils.waitForElementVisible(SignInPage.password);
        Utils.enterText(SignInPage.password, "testpaSS@.");
        test.log(Status.INFO, "Add password");
        logger.info("Add password");
        Utils.waitForElementVisible(SignInPage.signinBtn);
        Utils.clickOnButton(SignInPage.signinBtn);
        test.log(Status.INFO, "Click on Sign in Button");
        logger.info("Click on Sign in Button");


        Utils.waitForElementVisible(Homepage.gravideBtn);
        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.waitForElementLocated(produseGravide.produs1);
        Utils.clickOnButton(produseGravide.produs1);
        Utils.waitForElementVisible(adaugainCosPage.addcartp1);
        Utils.clickOnButton(adaugainCosPage.addcartp1);
        test.log(Status.INFO, "Click on Gravide section , then click on 1st product and put it in the cart");
        logger.info("Click on Gravide section , then click on 1st product and put it in the cart");

        Utils.waitForElementVisible(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.waitForElementVisible(adaugainCosPage.deletefromcart);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);

Thread.sleep(20000);


    }}
/*
        Utils.waitForElementVisible(Homepage.gravideBtn);
        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.waitForElementLocated(produseGravide.produs1);
        Utils.clickOnButton(produseGravide.produs1);
        Utils.waitForElementVisible(adaugainCosPage.addcartp1);
        Utils.clickOnButton(adaugainCosPage.addcartp1);
        test.log(Status.INFO, "Click on Gravide section , then click on 1st product and put it in the cart");
        logger.info("Click on Gravide section , then click on 1st product and put it in the cart");

        Utils.waitForElementVisible(Homepage.gravideBtn);
        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.waitForElementVisible(produseGravide.produs2);
        Utils.clickOnButton(produseGravide.produs2);
        Utils.waitForElementVisible(adaugainCosPage.addcartp2);
        Utils.clickOnButton(adaugainCosPage.addcartp2);
        test.log(Status.INFO, "Click on Gravide section , then click on 2nd product and put it in the cart");
        logger.info("Click on Gravide section , then click on 2nd product and put it in the cart");

        Utils.waitForElementVisible(Homepage.gravideBtn);
        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.waitForElementVisible(produseGravide.produs3);
        Utils.clickOnButton(produseGravide.produs3);
        Utils.waitForElementVisible(adaugainCosPage.addcartp3);
        Utils.clickOnButton(adaugainCosPage.addcartp3);
        test.log(Status.INFO, "Click on Gravide section , then click on 3rd product and put it in the cart");
        logger.info("Click on Gravide section , then click on 3rd product and put it in the cart");

        Utils.waitForElementVisible(Homepage.gravideBtn);
        Utils.clickOnButton(Homepage.gravideBtn);
        Utils.waitForElementVisible(produseGravide.produs4);
        Utils.clickOnButton(produseGravide.produs4);
        Utils.waitForElementVisible(adaugainCosPage.addcartp4);
        Utils.clickOnButton(adaugainCosPage.addcartp4);
        test.log(Status.INFO, "Click on Gravide section , then click on 4th product and put it in the cart");
        logger.info("Click on Gravide section , then click on 4th product and put it in the cart");

*/



