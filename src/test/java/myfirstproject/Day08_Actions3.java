package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions3 extends TestBase {


/*
*We may need to scroll the pages when page is long,or element is not displayed properly because element is the bottom of the page
* Then we have to scroll the page
* With Actions class,we can scroll down,up,left,right
 */


    @Test
    public void scrollUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com");

        Thread.sleep(3000);

        //1. To scroll pages ,we can use Actions class or JavaScript executer
        Actions actions=new Actions(driver);
        //2. Use actions to scroll page
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //ARROW DOWN=> scrolling a little bit
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        //Scrolling Up
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();

        //ARROW UP
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP).perform();


    }
}
