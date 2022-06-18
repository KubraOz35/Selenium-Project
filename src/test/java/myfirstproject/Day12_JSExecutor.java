package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Day12_JSExecutor extends TestBase {

    /*
     * What is JS Executor?
     * It is an API which is used to execute javascript commands in Selenium
     *
     * Why are we learning JavaScript Executor?
     * We might need some js executor method to interact with some webelements
     * When traditional methods are not enough
     * click, scrolling into a specific element
     *
     * What can we do by using JS Executor?
     * Click. It is good especially when we want to click a hidden element.
     * Scroll onto a specific webelement, scroll down/up/right/left
     * Type an input
     * Change the value of an element
     * Hover over
     * Change background colour...
     *
     *
     *

     * When did you use it?
     * when we can not interact with some webelements with a traditional selenium methods
For example, when we cannot click, scroll, get text… then we can use js executor
     * How do you scroll with selenium?
     * There are 2 ways: actions class, js executor
     * Actually, I am using js executor, since it is better
     * For example, with js executor, I can scroll to a specific element(scrollIntoView), or right, left, all the way bottom,… We have a reusable method that I can call to scroll on a specific element
     * How do you get the text in an input?
     * use getText() method for getting the text on a page. HOWEVER, we need to use jsexecutor to get the input value. I have a reusable method to get the value from an input.
     * what would you do if your selenium click doesn’t work?
     * can use javascript executor click. I can get the element and click using javascript.
     *
     * */
    @Test
    public void jsExecutorTest() throws InterruptedException {


        driver.get("https://www.carettahotel.com/");

        Thread.sleep(5000);

//        1.Creating js executor object
        JavascriptExecutor js = (JavascriptExecutor) driver;   //bi sonraki sayfada burayi test base e atiyoruz,class ta durmasi guzel degil,test base i control et ne attik gor

        //we inspect our room and scroll down there.   Param:Web element
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));//"//*[.='Our Rooms']")==>bu yapi sayfadaki text i almak icin kullaniyoruz,   *==>all text
        js.executeScript("arguments[0].scrollIntoView(true)", ourRooms);//  use js executor object to add your action

        Thread.sleep(3000);

        //we inspect email and scroll down there.
        WebElement email = driver.findElement(By.xpath("//span[.='info@carettahotel.com']"));   //Find element
        js.executeScript("arguments[0],scrollIntoView(true)", email);                     //Scroll element

        Thread.sleep(3000);

        js.executeScript("arguments[0],scrollIntoView(true)",driver.findElement(By.xpath("//input[@type='submit']")));//bu yol da var ama tavsiye edilmiyor tek line da gostermek
                                                                                                                                      //yukaridaki sekilde adim adim yaoilmasi guzel olan

    }

}