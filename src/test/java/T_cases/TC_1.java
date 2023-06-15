package T_cases;

import Base.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.SignInPage;
import pages.produseFetite;
import utils.Utils;
import pages.logoutPage;
import pages.produseBaieti;
import pages.produseGravide;
import pages.produseNoutati;


import static Base.TestBase.openURL;

public class TC_1 extends TestBase {

    @Test()
    public void login_andlogout(){
        test= extent.createTest("login and logout","Case1 : User verifies if he can login and logout" )
                .assignCategory("Functional.testcase")
                .assignAuthor("NiculaeGeorgiana");
        logger.info("Verify URL");
        openURL("https://www.nichiduta.ro/");
        Utils.waitForElementVisible(Homepage.RETURNbtn);
        Utils.clickOnButton(Homepage.RETURNbtn);
        Utils.waitForElementVisible(Homepage.accountBtn);
        Utils.clickOnButton(Homepage.accountBtn);
        Utils.waitForElementToBeClickable(Homepage.intraINcontBtn);
        Utils.clickOnButton(Homepage.intraINcontBtn);
        test.log(Status.INFO, "Click on Account button and click on enter account button ");
        logger.info("Click on Account button and click on enter account button ");

        Utils.waitForElementVisible(SignInPage.email);
        Utils.enterText(SignInPage.email,"georgianatest16@gmail.com");
        test.log(Status.INFO, "Add e-mail");
        logger.info("Add e-mail");
        Utils.waitForElementVisible(SignInPage.password);
        Utils.enterText(SignInPage.password,"testpaSS@.");
        test.log(Status.INFO, "Add password");
        logger.info("Add password");
        Utils.waitForElementVisible(SignInPage.signinBtn);
        Utils.clickOnButton(SignInPage.signinBtn);
        test.log(Status.INFO, "Click on Sign in Button");
        logger.info("Click on Sign in Button");

        Utils.waitForElementVisible(logoutPage.accountBtn);
        Utils.clickOnButton(logoutPage.accountBtn);
        test.log(Status.INFO, "Return to account detais page");
        logger.info("Return to account detais page");
        Utils.waitForElementLocated(logoutPage.logOutBtn);
        Utils.clickOnButton(logoutPage.logOutBtn);
        test.log(Status.INFO, "Click on log out button");
        logger.info("Click on log out button");
    }
    @Test()
    public void searchingthrough(){
        test= extent.createTest("Searching through the site","Case2 : User verifies if he can search some products and if all the buttons are functional" )
                .assignCategory("Functional.testcase")
                .assignAuthor("NiculaeGeorgiana");
        logger.info("Verify URL");
        openURL("https://www.nichiduta.ro/");
        Utils.waitForElementVisible(Homepage.RETURNbtn);
        Utils.clickOnButton(Homepage.RETURNbtn);
        Utils.waitForElementVisible(Homepage.accountBtn);
        Utils.clickOnButton(Homepage.accountBtn);
        Utils.waitForElementToBeClickable(Homepage.intraINcontBtn);
        Utils.clickOnButton(Homepage.intraINcontBtn);
        test.log(Status.INFO, "Click on Account button and click on enter account button ");
        logger.info("Click on Account button and click on enter account button ");

        Utils.waitForElementVisible(SignInPage.email);
        Utils.enterText(SignInPage.email,"georgianatest16@gmail.com");
        test.log(Status.INFO, "Add e-mail");
        logger.info("Add e-mail");
        Utils.waitForElementVisible(SignInPage.password);
        Utils.enterText(SignInPage.password,"testpaSS@.");
        test.log(Status.INFO, "Add password");
        logger.info("Add password");
        Utils.waitForElementVisible(SignInPage.signinBtn);
        Utils.clickOnButton(SignInPage.signinBtn);
        test.log(Status.INFO, "Click on Sign in Button");
        logger.info("Click on Sign in Button");

        Utils.waitForElementVisible(Homepage.fetiteBtn);
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Click on 'Fetite' section ");
        logger.info("Click on 'Fetite' section ");
        Utils.waitForElementVisible(produseFetite.partyF);
        Utils.clickOnButton(produseFetite.partyF);
        test.log(Status.INFO, "Click on 'articole de petrecere' section ");
        logger.info("Click on 'Click on 'articole de petrecere' section ");
        Utils.waitForElementVisible(Homepage.returntoHomePage);
        Utils.clickOnButton(Homepage.returntoHomePage);
        Utils.waitForElementVisible(Homepage.baietiBtn);
        Utils.clickOnButton(Homepage.baietiBtn);
        test.log(Status.INFO, "Click on 'Baieti' section ");
        logger.info("Click on 'Baieti' section ");
        Utils.waitForElementVisible(produseBaieti.electronicsB);
        Utils.clickOnButton(produseBaieti.electronicsB);
        test.log(Status.INFO, "Click on 'kids electronics' section ");
        logger.info("Click on 'kids electronics' section ");
        Utils.waitForElementVisible(Homepage.returntoHomePage);
        Utils.clickOnButton(Homepage.returntoHomePage);



    }


}
