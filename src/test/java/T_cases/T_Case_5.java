package T_cases;

import Base.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class T_Case_5  extends TestBase {
    @Test()
    public void Filtering() {
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
        test.log(Status.INFO, "Click on jucarii copii section");
        logger.info("Click on jucarii copii section");
        Utils.clickOnButton(jucariicopiifilter.Papusiaccesorii);
        test.log(Status.INFO, "Click on papusi si accesorii section");
        logger.info("Click on papusi si accesorii section");
        Utils.clickOnButton(jucariicopiifilter.pretfilter1);
        test.log(Status.INFO, "Alege filtru de pret intre 200-500 lei");
        logger.info("Alege filtru de pret intre 200-500 lei");
        Utils.Scroll();
        Utils.clickOnButton(jucariicopiifilter.sexfilter1);
        test.log(Status.INFO, "Alege filtru produse pentru baieti");
        logger.info("Alege filtru produse pentru baieti");
        Utils.clickOnButton(produseBaieti.produspapusimana);
        Utils.clickOnButton(adaugainCosPage.addcartp1);
        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "Click on first product , add it to cart for latter deleting it");
        logger.info("Click on first product  , add it to cart for latter deleting it");
        Utils.clickOnButton(Homepage.returntoHomePage);
        Utils.clickOnButton(Homepage.jucariicopii);
        test.log(Status.INFO, "Click on jucarii copii section");
        logger.info("Click on jucarii copii section");
        Utils.clickOnButton(jucariicopiifilter.Jucariiplus);
        test.log(Status.INFO, "Click on jucarii de plus section");
        logger.info("Click on jucarii de plus section");
        Utils.clickOnButton(jucariicopiifilter.Seturidoctor);
        test.log(Status.INFO, "Click on seturi de doctor section");
        logger.info("Click on seturi de doctor section");
        Utils.clickOnButton(jucariicopiifilter.maiMult);
        Utils.Scroll();
        Utils.clickOnButton(jucariicopiifilter.MasinuteMotociclete);
        test.log(Status.INFO, "Click on masinute si motociclete section");
        logger.info("Click on masinute si motociclete section");
        Utils.clickOnButton(masinutemotoFilter.prod2);
        Utils.clickOnButton(adaugainCosPage.addcartp1);
        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "Click on second product , add it to cart for latter deleting it");
        logger.info("Click on second product , add it to cart for latter deleting it");
        Utils.clickOnButton(Homepage.returntoHomePage);
        Utils.clickOnButton(Homepage.jucariicopii);
        Utils.clickOnButton(jucariiMuzicalefilter.jucariimuzicale);
        test.log(Status.INFO, "Click on jucarii muzicale section");
        logger.info("Click on jucarii muzicale section");
        Utils.Scroll();
        Utils.clickOnButton(jucariiMuzicalefilter.varstafilter);
        test.log(Status.INFO, "Alege filtru varsta intre 3 si 6 ani");
        logger.info("Alege filtru varsta intre 3 si 6 ani");
        Utils.clickOnButton(jucariiMuzicalefilter.prod3);
        Utils.clickOnButton(adaugainCosPage.addcartp1);
        Utils.clickOnButton(adaugainCosPage.cartbtn);
        Utils.clickOnButton(adaugainCosPage.deletefromcart);
        driver.switchTo().alert().accept();
        test.log(Status.INFO, "Click on third product , add it to cart for latter deleting it");
        logger.info("Click on third product  , add it to cart for latter deleting it");
        Utils.clickOnButton(logoutPage.accountBtn);
        test.log(Status.INFO, "Return to account detais page");
        logger.info("Return to account detais page");
        Utils.clickOnButton(logoutPage.logOutBtn);
        test.log(Status.INFO, "Click on log out button");
        logger.info("Click on log out button");
    }

}
