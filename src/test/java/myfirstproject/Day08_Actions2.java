package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions2 extends TestBase {

    @Test
    public void hoverOver (){
//        Create a class: Actions2
//        Create test method : hoverOver() and test the following scenario:
//        Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");

//        When use click on “Account” link
        WebElement accountList= driver.findElement(By.id("nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountList).perform();

        //clicking on the account link
        driver.findElement(By.linkText("Account")).click();

//        Then verify the page title contains “Your Account”
        Assert.assertTrue(driver.getTitle().contains("Your Account"));

    }

}
