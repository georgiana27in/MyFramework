package pages;
import org.openqa.selenium.By;
import utils.Utils;

import static Base.TestBase.openURL;

public class Homepage {
    public static By accountBtn = By.cssSelector("button#acc_button");
    public static By RETURNbtn= By.xpath("//div[@id='header']/div[@class='inner']/div[4]//a[@title='Nichiduta']");
    public static By intraINcontBtn = By.cssSelector(".account_info.bigRadius.hidden.menu_dropdown.shadow  .bigRadius.buttonBorder");
    public static By baietiBtn = By.cssSelector("a[title='Pentru Baieti']']");
    public static By fetiteBtn = By.cssSelector("a[title='Pentru Fetite']");
    public static By gravideBtn = By.cssSelector("ul#megamenu  a[title='Gravide']");
    public static By colectiiBtn = By.cssSelector("a[title='Colectii']");
    public static By OFspecialeBtn = By.cssSelector("ul#megamenu  a[title='Oferte speciale']");
    public static By noutatiBtn = By.cssSelector("ul#megamenu  a[title='Noutati']");
    public static By BranduriBtn = By.cssSelector("a[title='Branduri']");
    public static By returntoHomePage = By.cssSelector("a#logo");
}

