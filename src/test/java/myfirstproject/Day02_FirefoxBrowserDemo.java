package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxBrowserDemo {


//    Create a new class under : FirefoxBrowserDemo


//    Create main method
//    Set Path
//    Create gecko driver
//    Open google home page https://www.google.com/
//    Maximize the window
//    Close/Quit the browser


    //1- Create main method
    public static void main(String[] args) {

        //2- set path
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

        //3- Create gecko driver
        WebDriver driver = new FirefoxDriver();

        //4- Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        //5- Maximize the window
        driver.manage().window().maximize();

        //6- Close/Quit the browser
        driver.quit();
    }


}
