package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Day10_ScreenOfSpecificElements extends TestBase {
        //    screenshot of google image
        @Test
        public void screenShotTest() throws IOException {
            driver.get("https://www.google.com");
            WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
            File logoImage = googleLogo.getScreenshotAs(OutputType.FILE);
//       Save the image to path
            File finalPath = new File("./test-output/elements/googleLogo.png");
            FileUtils.copyFile(logoImage, finalPath);//this is where I will save
            //homework
            // get the screenshot of "Oturum açın" button

        }
        @Test
    public void oturumAcButton() throws IOException {
            driver.get("https://www.google.com");
            WebElement oturumAc = driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_7d gb_7c']"));
            File SignInImage = oturumAc.getScreenshotAs(OutputType.FILE);
            File finalPath = new File("./test-output/elements/googleLogo.png");
            FileUtils.copyFile(SignInImage, finalPath);




        }
    }


