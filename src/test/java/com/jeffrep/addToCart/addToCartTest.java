package com.jeffrep.addToCart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class addToCartTest {

    @Test
    public void addToCartTest(){

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver(); //start up chrome driver

        driver.navigate().to("http://www.zappos.com"); //opens Zappos.com in a Chrome browser window

        WebElement element = driver.findElement(By.id("globalSearchField")); //adds "adidas addisage" in the Zappos search bar
        element.sendKeys("adidas addisage");
        element.submit();

        WebElement productName = driver.findElement(By.cssSelector("span.productName"));
        productName.click(); //selects the adissage SC

        WebElement size = driver.findElement(By.id("d3"));
        Select clickThis = new Select(size);
        clickThis.selectByVisibleText("9"); //selects the size

        WebElement cart = driver.findElement(By.id("addToCart"));
        cart.submit(); //adds to cart

        driver.close(); //closes driver
        driver.quit(); //quits driver

    }

}
