package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {

    //        1.Create a new class: VerifyURLTest
    //        2.Navigate to google homepage
    //        3.Verify if google homepage url is "www.google.com"

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2.Navigate to google homepage
        driver.get("https://www.google.com");

        //3.Verify if google homepage url is "www.google.com"
      String actualUrl= driver.getCurrentUrl();
      String expectedUrl="www.google.com";//there is no https://,our test will fail ,we will see what we should do in case of fail,don't fix manually


      if (actualUrl.equals(expectedUrl)){
          System.out.println("Passed");

      }else{
          System.out.println("Failed");
          System.out.println("Actual : " + actualUrl);
          System.out.println("Expected : "+ expectedUrl);
      }

      /*
        FAILED
        Actual: https://www.google.com/
         Expected: www.google.com
         IQ: What do you do if a test case fails?
         1.Re-run your test one more time
         2.Do manual testing to be sure
         3.Contact with Developer
         4.Contact with BA
           -Check if this is document issue(spelling mistake..)
           -If the is documentation, then let BA fix the documents
           -And correct your test case
         5.If this is an actual bug  ?
         -Raise a bug ticket in JIRA
         -Assign it to developer
         6.After developer fixes the issue, deploy the code test environment
         -Retest manually, then run automation script.
         -And close the ticket if all good!

         Note: Each company has a different culture!

         When you find a bug, do you fix the bug your self?
         !!!-Nope. I document and report.

         */


    }
}
