package myfirstproject;

public class Day07_Review {

    /*
    * ***** What is alert?
    * Alerts are pop-ups generated by JS => Java scripts
    *
    * *****How do you handle Alerts?
    * Firstly I should switch the alerts then I can use accept, dismiss, getText, sendKeys
    * accept() => OK
    * dismiss() => Cancel
    * getText() => Returns text
    * sendKeys() => Types
    *
    * driver.switchTo().alert().getText();
    * driver.switchTo().alert().sendKeys();
    *
    * NOTE: If there is an alert on the page firstly we should handle
    * Without handling alert we can not continue on that page
    *
    *
    *
    * *****What is iFrame?
    * iFrame is used to add pages, maps, youtubes videos
    * iFrame generates html within the html
    * They can be accessed by using switchTo()
    *
    *
    * ****** How do you handle iFrames?
    * Firstly we should switch to iframe then we do automation
    * If the driver is not in the right frame, test case fails
    *
    * ***** How many way are there to switch to an iFrame?
    * There are 3 ways to switch to iframe => index, id/name, WebElement
    * *********************************************************************
    *  driver.switchTo().parentFrame(); //get 1 upper level by using parentFrame()
        driver.switchTo().defaultContent();//get us to default level
        *
        * ******How do you understand if an iframe on the page or not?
        * driver.findElement(By.xpath("//iframe")))
        * driver.findElements(By.xpath("//iframe")))
    *
    *

    *
    *
     */







}
