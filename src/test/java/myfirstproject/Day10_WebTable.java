package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Day10_WebTable extends TestBase {
    /*
https://the-internet.herokuapp.com/tables
Create a class: Day10_WebTables
Work on Table1
Task 1 : Print the entire table
Task 2 : Print All Rows
Task 3 : Print Last row data only
Task 4 : Print column 5 data in the table body
Task 5 : Write a method that accepts 2 parameters
Parameter 1 = row number
Parameter 2 = column number
printData(2,3);  => prints data in 2nd row 3rd column
*/

    @Test
    public void printTable() {
        driver.get("https://the-internet.herokuapp.com/tables");


        //Task 1 : Print the entire table
        System.out.println("*********Print Table********");
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());//get.text() methodu tablodaki bilgileri almamizi sagliyor

        System.out.println();
        System.out.println("*******Print Table Data*********");

        List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachData : tableData) {
            System.out.println(eachData.getText());

            System.out.println();
            System.out.println("*******Print Table Headers*********");

            List<WebElement> table1Header = driver.findElements(By.xpath("//table[@id='table1']//th"));
            for (WebElement each : table1Header) {
                System.out.println(each.getText());

            }
        }
    }


    public void getRows() {
        //Task 2 : Print All Rows including Header
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("***********Print Rows*********");
        for (WebElement each : allRows) {
            System.out.println(each.getText());
        }
    }

    @Test
    public void getLastRow() {
        //   Task 3 : Print Last row data only
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement lastRow = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[last()]"));
        System.out.println(lastRow.getText());
    }

    @Test
    public void getColumn5(){
//       Task 4 : Print column 5 data in the table body
        driver.get("https://the-internet.herokuapp.com/tables");     //table[@id='table1']//tbody//tr//td[5]
        List<WebElement> column5data = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[last()-1]"));
        for(WebElement each : column5data){
            System.out.println(each.getText());
        }
    }


        //    Task 5 : Write a method that accepts 2 parameters (body)
//    Parameter 1 = row number
//    Parameter 2 = column number
//    printData(2,3);  => prints data in 2nd row 3rd column
//                     => fbach@yahoo.com


    public void printData(int row, int column){
        //table[@id='table1']//tbody//tr[2]//td[3] => fbach@yahoo.com
        //table[@id='table1']//tbody//tr[1]//td[1] => Smith
        //table[@id='table1']//tbody//tr[3]//td[4] => $100.00

        driver.get("https://the-internet.herokuapp.com/tables");
        String xpath = "//table[@id='table1']//tbody//tr["+row+"]//td["+column+"]";
        WebElement cellData = driver.findElement(By.xpath(xpath));
        System.out.println(cellData.getText());
    }


    public void printData(int row, int column, String tableID){
        //table[@id='table1']//tbody//tr[2]//td[3] => fbach@yahoo.com
        //table[@id='table1']//tbody//tr[1]//td[1] => Smith
        //table[@id='table1']//tbody//tr[3]//td[4] => $100.00

        driver.get("https://the-internet.herokuapp.com/tables");
        String xpath = "//table[@id='"+tableID+"']//tbody//tr["+row+"]//td["+column+"]";
        WebElement cellData = driver.findElement(By.xpath(xpath));
        System.out.println(cellData.getText());
    }


    @Test
    public void printDataTest(){
        printData(2,3); //fbach@yahoo.com
        printData(1,1); //Smith
        printData(4,4,"table2");
        printData(4,5,"table2");
    }

    }
