package T_cases;

import Base.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class T_Case_4 extends TestBase {

    @Test()
    public void addToWishlist(){
        test= extent.createTest("Adding products to wishlist","Case4 : User verifies if he add products to wishlist for latter adding them to cart" )
                .assignCategory("Functional.testcase")
                .assignAuthor("NiculaeGeorgiana");
        logger.info("Verify URL");
        openURL("https://www.nichiduta.ro/");
        Utils.clickOnButton(Homepage.RETURNbtn);
        Utils.clickOnButton(Homepage.accountBtn);
        Utils.clickOnButton(Homepage.intraINcontBtn);
        test.log(Status.INFO, "Click on Account button and click on enter account button ");
        logger.info("Click on Account button and click on enter account button ");
        Utils.enterText(SignInPage.email,"georgianatest16@gmail.com");
        test.log(Status.INFO, "Add e-mail");
        logger.info("Add e-mail");
        Utils.enterText(SignInPage.password,"testpaSS@.");
        test.log(Status.INFO, "Add password");
        logger.info("Add password");
        Utils.clickOnButton(SignInPage.signinBtn);
        test.log(Status.INFO, "Click on Sign in Button");
        logger.info("Click on Sign in Button");

        Utils.clickOnButton(Homepage.jucariideexterior);
        test.log(Status.INFO, "Click on Jucarii de exterior");
        logger.info("Click on Jucarii de exterior");

        Utils.clickOnButton(Jucariideexterior.leaganecopii);
        test.log(Status.INFO, "Click on leagane copii");
        logger.info("Click on leagane copii");

        Utils.clickOnButton(leaganecopii.Addwishlist1);
        test.log(Status.INFO, "Add first product to wishlist");
        logger.info("Add first product to wishlist");
        Utils.clickOnButton(leaganecopii.Addwishlist2);
        test.log(Status.INFO, "Add second product to wishlist");
        logger.info("Add second product to wishlist");
        Utils.clickOnButton(leaganecopii.Addwishlist3);
        test.log(Status.INFO, "Add third product to wishlist");
        logger.info("Add third product to wishlist");
        Utils.clickOnButton(Homepage.wishlist);
        Utils.clickOnButton(Homepage.veziwishlist);
        test.log(Status.INFO, "Click on wishlist");
        logger.info("Click on wishlist");
        Utils.clickOnButton(wishlist.Addtocartwish1);
        test.log(Status.INFO, "Add first product from wishlist to cart");
        logger.info("Add first product from wishlist to cart");
        Utils.clickOnButton(wishlist.Addtocartwish1);
        test.log(Status.INFO, "Add second product from wishlist to cart");
        logger.info("Add second product from wishlist to cart");
        Utils.clickOnButton(wishlist.Addtocartwish1);
        test.log(Status.INFO, "Add third product from wishlist to cart");
        logger.info("Add third product from wishlist to cart");
        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "delete first product from cart");
        logger.info("Delete first product from cart");

        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcartp2);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "delete second product from cart");
        logger.info("Delete second product from cart");


        Utils.clickOnButton(adaugainCosPage.deletefromcartp3);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "delete third product from cart");
        logger.info("Delete third product from cart");

        Utils.clickOnButton(logoutPage.accountBtn);
        test.log(Status.INFO, "Return to account detais page");
        logger.info("Return to account detais page");
        Utils.clickOnButton(logoutPage.logOutBtn);
        test.log(Status.INFO, "Click on log out button");
        logger.info("Click on log out button");
    }
}
