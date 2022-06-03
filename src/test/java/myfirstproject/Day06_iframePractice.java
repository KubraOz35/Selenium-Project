package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day06_iframePractice extends TestBase {
    @Test
    public void iframe() {

        // Go to the webpage: https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");


        //  “An IFrame containing....” Check the text in enable or not... and print on the console
        WebElement textElement = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(textElement.isEnabled());


        // Write “Hello World!” inside of the Text Box instead of " Your content goes here
        driver.switchTo().frame("mce_0_ifr");
        WebElement TextField = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        TextField.clear();
        TextField.sendKeys("Hello World!");
        driver.switchTo().defaultContent();


        // Check whether the “Elemental Selenium” link text is visible then print on the console.
        WebElement elementalSelenium = driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a"));
        String expectedText = "Elemental Selenium";
        String actualText = elementalSelenium.getText();
        Assert.assertEquals(expectedText, actualText);


    }
}
