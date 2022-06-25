package myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day13_NoSuchElementException {
    WebDriver driver;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.manage().window().maximize();
    }

    @Test
    public void noSuchElementExceptionTest() {
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.linkText("Log")).click();// noSuchElementException
                                                        //Locator is not correct,it should be "Log in" not Log
                                                         //how we can handle==>instead of LinkText we should use Partially LinkText
    }

    @Test
    public void noSuchElementExceptionTest02(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        String helloWorld = driver.findElement(By.xpath("//div[@id='finish']")).getText();
        Assert.assertEquals("Hello World!",helloWorld); //ComparisonFailure
        //Locator is correct, this reason is not same as first test
        //Wait issue

    }

    @Test
    public void noSuchElementExceptionTest03() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        String goneMessage = driver.findElement(By.xpath("//p[@id='message']")).getText();
        Assert.assertEquals("It's gone!",goneMessage); //NoSuchElementException
//        Solution
//        We can use implicit wait
//        We can use explicit wait

    }
}