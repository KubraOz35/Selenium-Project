package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileDownload extends TestBase {

    @Test

    public void downloadTest() throws InterruptedException {
//        Create a class:FileDownloadTest
//        downloadTest()
//        In the downloadTest() method, do the following test:
//        Go to https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

//        Download flower.png file
        driver.findElement(By.linkText("sample.png")).click();

        //it takes about a second to download the file
        //Implicit way cannot solve this issue,cause this is related to desktop aplication
        Thread.sleep(3000);

//        Then verify if the file downloaded successfully
        String path = System.getProperty("user.home") + "\\Downloads\\sample.png";//Syntax e dikkat et

        //Assert if this path exist
        boolean isExist = Files.exists(Paths.get(path));
        Assert.assertTrue(isExist);

    }
}
