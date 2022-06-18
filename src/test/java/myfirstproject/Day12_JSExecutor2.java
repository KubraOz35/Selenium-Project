package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.chrono.ThaiBuddhistEra;

public class Day12_JSExecutor2 extends TestBase {
    @Test
    public void jsExecuterTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);


        //scroll to "our room" burada spesific yere kadar scroll yapiyoruz
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        scrollIntoViewByJS(ourRooms);//bu methodu test base de olusturduk su an cagiriyoruz


    }

    @Test
    public void scrollAllDownByJSTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);

        //scroll to all the way down//burada sayfanin en altina kadar scroll yapiyoruz
        scrollAllDownByJS();
        Thread.sleep(3000);
        //scroll to all the way up
        scrollAllUpByJS();

    }

    @Test
    public void clickByJSTest() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);

        //click on check availability
        WebElement checkAvailability = driver.findElement(By.xpath("//input[@type='submit']"));
        clickByJS(checkAvailability);

        //click on search button
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        clickByJS(searchButton);

    }

    @Test
    public void setValueByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);

        WebElement checkOutDate = driver.findElement(By.id("checkout_date"));
        //updating checkout date
        checkOutDate.clear();

        //checkOutDate.sendKeys("6/25/2022"); this is traditional selenium type
        setValueByJS(checkOutDate, "6/25/2022");//JS type


    }

    @Test
    public void getValueByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);
        WebElement checkOutDate = driver.findElement(By.id("checkout_date"));
        System.out.println(checkOutDate.getText());//this is the traditional way.It returns nothing because there is value not a text
        // when you inspect!! checkout date you will see value there is no text

        getValueByJS("checkout_date");//   5/29/2022

        //INTERVIEW QUESTION!!!
        /*How you get the value of an input box?
        I can use JS executor.I can get the value of the element
        For ex;I can get the element by id,and use value attribute to get the value of an input
        I have to do this,because get text() in this case doesn't return text in an input

         */
    }

    @Test
    public void changeBackgroundColorByJs() throws InterruptedException {
        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);

        WebElement checkAvailability = driver.findElement(By.xpath("//input[@type='submit']"));
        Thread.sleep(3000);
        changeBackgroundColorByJS(checkAvailability, "blue");
    }

    @Test
    public void addBorderWithJSTest() throws InterruptedException, IOException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.xpath("//a[.='Log in']"));
        Thread.sleep(3000);
        addBorderWithJS(loginButton,"3px solid red");
        Thread.sleep(3000);
        takeScreenShot();
    }
    }
