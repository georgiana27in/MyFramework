package pages;
import org.openqa.selenium.By;
import utils.Utils;

import static Base.TestBase.openURL;

public class Homepage {
    public static By accountBtn = By.cssSelector("button#acc_button");
    public static By RETURNbtn= By.xpath("//div[@id='header']/div[@class='inner']/div[4]//a[@title='Nichiduta']");
    public static By intraINcontBtn = By.xpath("//div[@id='header_options']/div[1]/ul//a[@href='/autentificare']");
    public static By baietiBtn = By.xpath("//ul[@id='megamenu']//a[@title='Pentru Baieti']");
    public static By fetiteBtn = By.cssSelector("a[title='Pentru Fetite']");
    public static By gravideBtn = By.cssSelector("ul#megamenu  a[title='Gravide']");
    public static By colectiiBtn = By.cssSelector("a[title='Colectii']");
    public static By OFspecialeBtn = By.cssSelector("ul#megamenu  a[title='Oferte speciale']");
    public static By noutatiBtn = By.cssSelector("ul#megamenu  a[title='Noutati']");
    public static By BranduriBtn = By.cssSelector("a[title='Branduri']");
    public static By returntoHomePage = By.xpath("/html//div[@id='header']/div[@class='inner']//a[@title='Nichiduta']");
    public static By jucariideexterior = By.cssSelector("a[title='Jucarii De Exterior']");
    public static By wishlist=By.cssSelector(".drop_button.wishlist_menu > .counter");
    public static By veziwishlist=By.cssSelector("a[title='Vezi produsele']");
}


