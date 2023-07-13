package T_cases;

import Base.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class T_Case_2 extends TestBase {
    @Test()
    public void searchingthrough()  {
        test= extent.createTest("Searching through the site ","Case2 : User verifies if he can search some products and if all the buttons are functional" )
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

        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Click on 'Fetite' section ");
        logger.info("Click on 'Fetite' section ");

        Utils.clickOnButton(produseFetite.partyF);
        test.log(Status.INFO, "Click on 'articole de petrecere' section ");
        logger.info("Click on 'Click on 'articole de petrecere' section ");

        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.outtoysF);
        test.log(Status.INFO, "Click on ' JUCARII EXTERIOR ");
        logger.info("Click on 'Click on 'JUCARII EXTERIOR ");

        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.toysF);
        test.log(Status.INFO, "Click on 'JUCARII COPII ");
        logger.info("Click on 'Click on 'JUCARII COPII ");
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.electronicsF);
        test.log(Status.INFO, "Click on 'KIDS ELECTRONICS ");
        logger.info("Click on 'Click on 'KIDS ELECTRONICS ");
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.strollerF);
        test.log(Status.INFO, "Click on 'CARUCIARE COPII ");
        logger.info("Click on 'Click on 'CARUCIOARE COPII ");
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.carseatF);
        test.log(Status.INFO, "Click on 'SCAUNE AUTO ");
        logger.info("Click on 'Click on 'SCAUNE AUTO ");
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.babyroomF);
        test.log(Status.INFO, "Click on 'CAMERA COPILULUI ");
        logger.info("Click on 'Click on 'CAMERA COPILULUI ");
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.feedF);
        test.log(Status.INFO, "Click on 'HRANA BEBELUSI ");
        logger.info("Click on 'Click on 'HRANA BEBELURI ");
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(produseFetite.towalkF);
        test.log(Status.INFO, "Click on 'LA PLIMBARE ");
        logger.info("Click on 'Click on 'LA PLIMBARE ");
        Utils.clickOnButton(Homepage.fetiteBtn);
        test.log(Status.INFO, "Return to 'Fetite' section ");
        logger.info("Return to 'Fetite' section ");

        Utils.clickOnButton(Homepage.baietiBtn);
        test.log(Status.INFO, "Click on 'Baieti' section ");
        logger.info("Click on 'Baieti' section ");

        Utils.clickOnButton(produseBaieti.electronicsB);
        test.log(Status.INFO, "Click on 'kids electronics' section ");
        logger.info("Click on 'kids electronics' section ");

        Utils.clickOnButton(Homepage.gravideBtn);
        test.log(Status.INFO, "Click on 'gravide' section ");
        logger.info("Click on 'gravide' section ");

        Utils.clickOnButton(produseGravide.produs1);
        test.log(Status.INFO, "Click on  first product ");
        logger.info("Click on  first product");

        Utils.clickOnButton(Homepage.colectiiBtn);
        test.log(Status.INFO, "Click on  'Colectii' section ");
        logger.info("Click on  'Colectii' section ");

        Utils.clickOnButton(produseColectii.FrozenBtn);
        test.log(Status.INFO, "Click on  Frozen collection of products ");
        logger.info("Click on  Frozen collection of products  ");

        Utils.clickOnButton(Homepage.colectiiBtn);
        test.log(Status.INFO, "Return to  'Colectii' section ");
        logger.info("Return to  'Colectii' section ");

        Utils.clickOnButton(produseColectii.MinnnieBtn);
        test.log(Status.INFO, "Click to  'Minnie Mouse collection of products ");
        logger.info("Click to  'Minnie Mouse collection of products ");

        Utils.clickOnButton(Homepage.colectiiBtn);
        test.log(Status.INFO, "Return to  'Colectii' section ");
        logger.info("Return to  'Colectii' section ");

        Utils.clickOnButton(produseColectii.CarsBtn);
        test.log(Status.INFO, "Click to  'Disney Cars collection of products ");
        logger.info("Click to  'Disney Cars Mouse collection of products ");

        Utils.clickOnButton(Homepage.colectiiBtn);
        test.log(Status.INFO, "Return to  'Colectii' section ");
        logger.info("Return to  'Colectii' section ");

        Utils.clickOnButton(produseColectii.searchbtn);
        Utils.enterText(produseColectii.searchbtn,"Bing");
        Utils.clickOnButton(produseColectii.bingBtn);
        Utils.clickOnButton(produseColectii.produs6);
        test.log(Status.INFO, "Click on search bar and type 'bing' , then select Bing collection of products and select 1 product fom list");
        logger.info("Click on search bar and type 'bing' , then select Bing collection of products and select 1 product from list");

        Utils.clickOnButton(Homepage.OFspecialeBtn);
        test.log(Status.INFO, "Click on 'oferte speciale' section ");
        logger.info("Click on 'oferte speciale' section");

        Utils.clickOnButton(produseofertespeciale.toysoffer);
        test.log(Status.INFO, "Click 'JUCARII COPII'");
        logger.info( "Click 'JUCARII COPII'");

        Utils.clickOnButton(produseofertespeciale.produs7);
        test.log(Status.INFO, "Click on 1 product");
        logger.info("Click on 1 product");

        Utils.clickOnButton(Homepage.OFspecialeBtn);
        test.log(Status.INFO, "Return to 'oferte speciale' section");


        Utils.clickOnButton(produseofertespeciale.babyroomoffer);
        test.log(Status.INFO, "Click 'CAMERA COPILULUI");
        logger.info( "Click 'CAMERA COPILULUI");

        Utils.clickOnButton(Homepage.OFspecialeBtn);
        test.log(Status.INFO, "Return to 'oferte speciale' section");
        logger.info("Return to previous page");

        Utils.clickOnButton(Homepage.OFspecialeBtn);
        test.log(Status.INFO, "Return to 'oferte speciale' section");
        logger.info("Return to previous page");

        Utils.clickOnButton(produseofertespeciale.foodoffer);
        test.log(Status.INFO, "Click 'ALIMENTATIE");
        logger.info( "Click 'ALIMENTATIE ");

        Utils.clickOnButton(Homepage.OFspecialeBtn);
        test.log(Status.INFO, "Return to 'oferte speciale' section");
        logger.info("Return to previous page");

        Utils.clickOnButton(Homepage.noutatiBtn);
        test.log(Status.INFO, "Click 'Noutati section");
        logger.info( "Click 'Noutati section ");

        Utils.clickOnButton(Homepage.noutatiBtn);
        test.log(Status.INFO, "Return to 'Noutati section");
        logger.info( "Return to 'Noutati section ");

        Utils.clickOnButton(Homepage.BranduriBtn);
        test.log(Status.INFO, "Click 'Branduri section");
        logger.info( "Click 'Branduri section ");

        Utils.clickOnButton(logoutPage.accountBtn);
        test.log(Status.INFO, "Return to account detais page");
        logger.info("Return to account detais page");
        Utils.clickOnButton(logoutPage.logOutBtn);
        test.log(Status.INFO, "Click on log out button");
        logger.info("Click on log out button");


    }
}
