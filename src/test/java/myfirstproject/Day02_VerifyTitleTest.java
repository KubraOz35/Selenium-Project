package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {

    //  1.Create a new class: VerifyTitleTest
    // 2.Navigate to google homepage
    // 3.Verify if google title is "Google"


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // 2.Navigate to google homepage
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        String actualTitle=  driver.getTitle();
        String expectedTitle= "Google";

        // 3.Verify if google title is "Google"
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected Title : " + expectedTitle);
            System.out.println("Actual Title : " +actualTitle);
        }

        driver.quit();







    }
}
