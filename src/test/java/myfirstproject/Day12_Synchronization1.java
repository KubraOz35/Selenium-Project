
package myfirstproject;
import myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Day12_Synchronization1 extends TestBase {
    @Test
    public void synchronization1() throws InterruptedException {
//        Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        When user clicks on the Start button
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
//        Using explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        //div[@id='finish']//h4 is the xpath of the Hello World! element
//        1. Waits for the element DYNAMICALLY
//        2. returns the element. So no need to use findElement with explicit wait
        WebElement helloWord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
        Assert.assertEquals("Hello World!",helloWord.getText());
//        Thread.sleep(5000);//works but this is not recommended
//        Then verify the ‘Hello World!’ Shows up on the screen
//        String helloWorld = driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
//        Assert.assertEquals("Hello World!",helloWorld);
//        Implicit wait is not enough to handle the load issue
    }
}

/*1. Hard Wait : Thread.sleep(millisecond)
Java wait.
Waits for the given time. NO MORE NO LESS.
We should avoid using this wait. Avoid especially putting too many hard wait.
This will make the test execution time longer.
2. Dynamic Wait
Implicit Wait: driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Selenium wait
Wait UP TO the given time.
We should use dynamic wait
Global wait. When you use implicit wait once, then whenever driver is called, then implicit wait applies.
ExplicitWait:
Selenium wait. Dynamic wait
Wait UP TO the given time.
We should use dynamic wait
Local wait. We will apply the wait on to the specific elements
We must create a WebDriverWait object
This sometime handles wait isse BETTER THAN IMPLICIT WAIT
Element is not visible
Element no clickable
Text not displayed
….
Fluent Wait:
This is a type of Explicit wait.
We can put polling number.
We can ignore exception*/



