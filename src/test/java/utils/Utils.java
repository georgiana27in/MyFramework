package utils;

import Base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import pages.Homepage;


import javax.swing.plaf.basic.BasicSliderUI;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import static java.awt.SystemColor.scrollbar;
import static java.awt.SystemColor.window;

public class Utils extends TestBase {

    public static Object AssertFunction;

    public static void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }
    public void clearText(By locator) {

        WebElement element = driver.findElement(locator);
        element.clear();
    }

    public static void clickOnButton(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        element.click();
    }
//    public static void click(WebDriver driver, By by, int timeout) {
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(timeout))
//                .ignoring(NoSuchElementException.class);
//        WebElement element = driver.findElement(locator);
//        element.click();



    public String getText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    public String getPlaceholder(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getAttribute("placeholder");
    }

    public void selectValueOnDropDown(By locator, String Text) {

        Select selectValue = new Select(driver.findElement(locator));
        selectValue.selectByVisibleText(Text);
    }

    public void selectValueOnCheckBox(By chkBoxCollection, By labelText, By getInput, String Text) {

        List<WebElement> chkBoxCollections = driver.findElements(chkBoxCollection);
        for (WebElement webElement : chkBoxCollections) {
            WebElement getLabel = webElement.findElement(labelText);
            WebElement getInput1 = webElement.findElement(getInput);

            if (getLabel.getText().equals(Text)) {
                if (!getInput1.isSelected()) {
                    getLabel.click();
                    break;
                }
            }
        }

    }
    public void switchTabs() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String parent_window = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String child_window = i1.next();
            if (!parent_window.equalsIgnoreCase(child_window)) {
                driver.switchTo().window(child_window);
                driver.close();
            }
        }

        driver.switchTo().window(parent_window);
    }

    public static void waitForElementVisible(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

//    public static void skipcampanie (){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//       for (wait.until(ExpectedConditions.urlMatches("https://www.nichiduta.ro/campanie"))){
//               Utils.clickOnButton(Homepage.RETURNbtn)}
//
//    }

    public  static void waitForElementLocated(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public static void Scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
    }


}


