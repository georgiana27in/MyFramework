package pages;

import org.openqa.selenium.By;

public class NewaccountPage {
    public static By creeateaccountBtn = By.cssSelector("a#createAccount");
    public static By NameBtn = By.cssSelector("input#valid-name");
    public static By surnameBtn = By.cssSelector("input#valid-surname");
    public static By mailBtn = By.cssSelector("input#valid-reg-email");
    public static By phoneBtn = By.cssSelector("input#valid-phone");
    public static By newpassBtn = By.cssSelector("input#valid-password-reg");
    public static By new2passBtn = By.cssSelector("input#valid-password2");
    public static By checkmarkBtn = By.cssSelector(".check:nth-of-type(1) .checkmark");
    public static By SubmitBtn = By.cssSelector("input#submitinreg");

}
