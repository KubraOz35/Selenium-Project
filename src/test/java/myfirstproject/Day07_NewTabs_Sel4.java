package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class Day07_NewTabs_Sel4 extends TestBase {

    @Test
    public void newTabs() throws InterruptedException {

        // replace WindowType.WINDOW==>WindowType.TAB
        // we are able to open a new tab and do testing on that tab

        /*
         * With Selenium 4 we are able to create and switch between new windows or tabs
         *
         * driver.switchTo().newWindow(WindowType.WINDOW);
         * driver.switchTo().newWindow(WindowType.TAB);
         *
         * */


        // Open google on window 1
        driver.get("https://www.google.com");
        System.out.println("Google title :" + driver.getTitle());
        String googleWindowHandle=driver.getWindowHandle();//yeni windowa gecebilmek icin bunu kullanmamiz gerekiyor

        // Open amazon on window 2
        driver.switchTo().newWindow(WindowType.TAB);//by using this method create a new window and switch to it
        driver.get("https://www.amazon.com");//i have 2 different web page on one driver
        System.out.println("Amazon title:" +driver.getTitle());
        String amazonWindowHandle=driver.getWindowHandle();

        // Open linkedin on window 3
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");//
        System.out.println("Linkedin title:" +driver.getTitle());
        String linkedInWindowHandle=driver.getWindowHandle();

        //  Switch between windows
        // Switch to amazon
        Thread.sleep(5000);
        driver.switchTo().window(amazonWindowHandle);

        //Switch to google
        Thread.sleep(5000);
        driver.switchTo().window(googleWindowHandle);

        // Switch back to linkedin
        Thread.sleep(5000);
        driver.switchTo().window(linkedInWindowHandle);


    }



}
