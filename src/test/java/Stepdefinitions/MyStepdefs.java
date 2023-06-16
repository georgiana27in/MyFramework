package Stepdefinitions;
import io.cucumber.java.PendingException;
import Base.TestBase;
import io.cucumber.java.en.*;
import pages.*;
import utils.Utils;
import java.io.IOException;

public class MyStepdefs {
    @Given("that i will open the page")
    public void thatIWillOpenThePage() throws IOException {
        TestBase.propertiesLoad();
        TestBase.openBrowser();
        TestBase.openURL("https://www.nichiduta.ro/");
        Utils.waitForElementToBeClickable(Homepage.returntoHomePage);
        Utils.waitForElementToBeClickable(Homepage.returntoHomePage);
    }

    @Then("I will click on account button")
    public void iWillClickOnAccountButton() {
        Utils.waitForElementLocated(Homepage.accountBtn);
        Utils.clickOnButton(Homepage.accountBtn);
    }

    @Then("I will click on login button")
    public void iWillClickOnLoginButton() {
        Utils.waitForElementToBeClickable(Homepage.intraINcontBtn);
        Utils.clickOnButton(Homepage.intraINcontBtn);
    }


    @And("I will add the password: {string}")
    public void iWillAddThePassword(String arg0) {
        Utils.waitForElementVisible(SignInPage.password);
        Utils.clickOnButton(SignInPage.email);
        Utils.enterText(SignInPage.password, arg0);
    }

    @And("I will click Sign in button")
    public void iWillClickSignInButton() {
        Utils.waitForElementVisible(SignInPage.signinBtn);
        Utils.clickOnButton(SignInPage.signinBtn);
    }

    @Then("I will click on Log out button")
    public void iWillClickOnLogOutButton() {
        Utils.waitForElementLocated(logoutPage.logOutBtn);
        Utils.clickOnButton(logoutPage.logOutBtn);


    }


    @And("I will add the email address :{string}")
    public void iWillAddTheEmailAddress(String arg0) {
        Utils.waitForElementLocated(SignInPage.email);
        Utils.clickOnButton(SignInPage.email);
        Utils.enterText(SignInPage.email, arg0);
    }
    @And("I click on section : {string}")
    public void iClickOnSection(String arg0) {
        String section = arg0;
        switch (section) {
            case "Articole de petrecere":
                if (section == "Articole de petrecere") {
                    Utils.waitForElementVisible(produseFetite.partyF);
                    Utils.clickOnButton(produseFetite.partyF);
                }
            case "Jucarii copii":
                if (section == "Jucarii copii") {
                    Utils.waitForElementVisible(produseFetite.toysF);
                    Utils.clickOnButton(produseFetite.toysF);
                }
            case "Kids electronics ":
                if (section == "Kids electronics ") {
                    Utils.waitForElementVisible(produseFetite.electronicsF);
                    Utils.clickOnButton(produseFetite.electronicsF);
                }
            case "Carucioare copii":
                if (section == "Carucioare copii") {
                    Utils.waitForElementVisible(produseFetite.strollerF);
                    Utils.clickOnButton(produseFetite.strollerF);
                }
            case "Scaune auto":
                if (section == "Scaune auto") {
                    Utils.waitForElementVisible(produseFetite.carseatF);
                    Utils.clickOnButton(produseFetite.carseatF);
                }
            case "Camera copilui":
                if (section == "Camera copilui") {
                    Utils.waitForElementVisible(produseFetite.babyroomF);
                    Utils.clickOnButton(produseFetite.babyroomF);
                }
            case "La plimbare  ":
                if (section == "La plimbare  ") {
                    Utils.waitForElementVisible(produseFetite.towalkF);
                    Utils.clickOnButton(produseFetite.towalkF);
                }
            case "Jucarii exterior  ":
                if (section == "Jucarii exterior  ") {
                    Utils.waitForElementVisible(produseFetite.outtoysF);
                    Utils.clickOnButton(produseFetite.outtoysF); }
            case "Alimentatie":
                if (section=="Alimentatie"){
                    Utils.waitForElementVisible(produseFetite.feedF);
                    Utils.clickOnButton(produseFetite.feedF);
                }
            case "Igiena si ingrijire"  :
                if (section=="Igiena si ingrijire"){
                    Utils.waitForElementVisible(produseFetite.nurseryF);
                    Utils.clickOnButton(produseFetite.nurseryF);
                }
            case "Gradinita si scoala"  :
                if (section=="Gradinita si scoala"){
                    Utils.waitForElementVisible(produseFetite.schoolF);
                    Utils.clickOnButton(produseFetite.schoolF);
                }
            case "Hrana bebelusi"  :
                if (section=="Hrana bebelusi"){
                    Utils.waitForElementVisible(produseFetite.babyfoodF);
                    Utils.clickOnButton(produseFetite.babyfoodF);
                }
            case "Haine si imbracaminte"  :
                if (section=="Haine si imbracaminte"){
                    Utils.waitForElementVisible(produseFetite.chlotesF);
                    Utils.clickOnButton(produseFetite.chlotesF);
                }
                }


    }
    @And("I click on fetite section")
    public void iClickOnFetiteSection() {
        Utils.waitForElementVisible(Homepage.fetiteBtn);
        Utils.clickOnButton(Homepage.fetiteBtn);
    }



}
