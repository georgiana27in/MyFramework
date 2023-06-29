package T_cases;

import Base.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class T_Case_5  extends TestBase {
    @Test()
    public void Filtering() throws InterruptedException {
        test= extent.createTest("Filtering","Case5 : User verifies if filtering works correctly on category pages" )
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

        Utils.clickOnButton(Homepage.jucariicopii);
        Utils.clickOnButton(jucariicopiifilter.Papusiaccesorii);
        Utils.clickOnButton(jucariicopiifilter.pretfilter1);
        Utils.Scroll();
        Utils.clickOnButton(jucariicopiifilter.sexfilter1);
        Utils.clickOnButton(produseBaieti.produspapusimana);
        Utils.clickOnButton(adaugainCosPage.addcartp1);
        Utils.clickOnButton(Homepage.returntoHomePage);
//        Utils.clickOnButton(jucariicopiifilter.Jucariiplus);
//        Utils.clickOnButton(jucariicopiifilter.Seturidoctor);
//        Utils.clickOnButton(jucariicopiifilter.maiMult);
//        Utils.clickOnButton(jucariicopiifilter.MasinuteMotociclete);
//        Utils.Scroll();













        Utils.clickOnButton(logoutPage.accountBtn);
        test.log(Status.INFO, "Return to account detais page");
        logger.info("Return to account detais page");
        Utils.clickOnButton(logoutPage.logOutBtn);
        test.log(Status.INFO, "Click on log out button");
        logger.info("Click on log out button");
    }

}
