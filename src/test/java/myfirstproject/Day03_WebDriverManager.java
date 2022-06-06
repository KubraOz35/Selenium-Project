package myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_WebDriverManager {
    public static void main(String[] args) {

//verify google title
        //set the path:

        //  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        //we were doing like this before.But now we don't need it because we added webdrivermanager dependencies,we will use WebDriverManager



        //calling chrome driver and setting it up
        WebDriverManager.chromedriver().setup();

        //create chrome driver object
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //go to google home page
        driver.get("https://google.com");
        String expectedTitle= "Google";
        String actualTitle= driver.getTitle();

        //Assert the title
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }




}
