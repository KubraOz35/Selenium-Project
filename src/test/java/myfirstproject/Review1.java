package myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Review1 extends TestBase {

    @Test
    public void windowHandle() {

         //1- amazon ana sayfaya gidin. Go to "amazon" webpage
        driver.get("https://www.amazon.com");
        String handleValueOfFistPage= driver.getWindowHandle();


         //2- Nutella icin arama yaptirin. Make a search for "Nutella"
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);


        //3- ilk urunun resmini tiklayarak farkili bir tab' da acin. In the result page, click the first image ,but open it inside of new Tab
        driver.switchTo().newWindow(WindowType.TAB);  //yeni tab acip ayni islemleri tekrar ettik su ana kadar iki ayri sayfada amazon,nutella miz var
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);


        //4- yeni tab da acilan urunun basligini yazdirin.
        WebElement firstProducttitle=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(firstProducttitle.getText());


        //5- Go to first page and print the URL of the first page
        driver.switchTo().window(handleValueOfFistPage);
        System.out.println(driver.getCurrentUrl());




    }
}