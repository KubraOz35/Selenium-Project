package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day12_Synchronization2Homework extends TestBase {
    /*

    Create a class:Synchronization2.
    Create a method: synchronization2
    Go to https://the-internet.herokuapp.com/dynamic_loading/2
    When user clicks on the Start button
    Then verify the ‘Hello World!’ Shows up on the screen
     */
    @Test
    public void synchronization2Test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));

        Thread.sleep(3000);

        clickByJS(startButton);

        WebElement message= driver.findElement(By.xpath("//div[@id='finish']//h4"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Assert.assertEquals("Hello World!",message.getText());

        //





    }
}
