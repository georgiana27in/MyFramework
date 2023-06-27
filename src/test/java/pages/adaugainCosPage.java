package pages;

import org.openqa.selenium.By;

public class adaugainCosPage {
    public static By addcartp1=By.cssSelector("button#add_to_cart_product");
    public static By cartbtn=By.cssSelector(".cart_menu.drop_button");
    public static By deletefromcartp3=By.cssSelector(".delete_from_cart.relative");

public static By deletefromcartp2=By.cssSelector("div#cart_listing > div:nth-of-type(1)  .delete_from_cart.relative");
    public static By deletefromcart=By.xpath("//div[@id='cart_product_item_0']/div[4]/button[@type='button']");
}
