package myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Day09_ReadExcel {


    //    Import the apache poi dependency in your pom file
//    Create resources directory under java folder(right click on java and create the folder)
//    Add the Excel file on the -resources'- folder
//    Create a new package: excel automation
//    Create a new class : ReadExcel

//    Create a new test method : readExcel()
//    Store the path of the  file in a string
//    Open the file
//    Open the workbook using fileinputstream
//    Open the first worksheet
//    Go to first row
//    Go to first cell on that first row and print
//    Go to second cell on that first row and print
//    Go to 2nd row first cell  and assert if the data equal to the USA
//    Go to 3rd row 2nd cell-chain the row and cell
//    Find the number of row
//    Find the number of used row
//    Print country, capitol key value pairs as map object


    //    Create a new test method : readExcel()
    @Test
    public void readExcel() throws IOException {

        //    Store the path of the  file in a string//resource dosyasina sag click ile absolute path alip kopyaladik,string e koyduk,src oncesini silip sadece nokta koyduk
        String path = ".\\src\\test\\java\\Resources\\Capitals.xlsx";

        //    Open the file
        FileInputStream fileInputStream = new FileInputStream(path);

        //    Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //    Open the first worksheet
        //  Sheet sheet1=  workbook.getSheet("Sheet1");      // looking with name
        Sheet sheet1 = workbook.getSheetAt(0);              //  looking with index number


        //    Go to first row
        //getRow() method accept an integer and is used for to go a specific row
        //to be able to go 1st row,you should type 0 inside it
        Row row1 = sheet1.getRow(0);

        //    Go to first cell on that first row and print
        //getCell() method accepts an integer and it is used for to go a specific cell
        //to be able to go 1st cell,you should type 0 inside it
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);//COUNTRY

        /*
         * Cell objects can be converted to string easily,
         * we can manipulate the data, we can use toLowerCase(), toUpperCase(), length()..
         * */
        System.out.println(cell1.toString().toLowerCase(Locale.ROOT));//country i kucuk harfle gormek istedik o yuzden string e cevirip methot kullandik


        //    Go to second cell on that first row and print
        Cell cell2 = row1.getCell(1);
        System.out.println(cell2);//CAPITAL


        //    Go to 2nd row first cell  and assert if the data equal to the USA
        String row2Cell1 = sheet1.getRow(1).getCell(0).toString();//data type cell idi onu string ile comppare yapamam o yuzden cell datayi string e cevirdim
        Assert.assertEquals("USA", row2Cell1);

        //    Go to 3rd row 2nd cell-chain the row and cell
        String row3Cell2 = sheet1.getRow(2).getCell(1).toString();
        System.out.println(row3Cell2);//paris

        //    Find the number of row
        int numberOfRow = sheet1.getLastRowNum() + 1;
        System.out.println(numberOfRow);

        //    Find the number of used row
        /*getPhysicalNumberOfRows() indexes starts from 1
         * Checks total number of rows that is used*/
        int numberOfUsedRows = sheet1.getPhysicalNumberOfRows();
        System.out.println(numberOfUsedRows);


        //    Print country, capitol key value pairs as map object
        //{USA=D.C,France=Paris,England=London...}
        Map<String, String> countriesAndCapitals = new HashMap<>();
        for (int rowNumber = 1; rowNumber < numberOfRow; rowNumber++) {
            String countries = sheet1.getRow(rowNumber).getCell(0).toString();
            //  System.out.println(countries);
            String capitals = sheet1.getRow(rowNumber).getCell(1).toString();
            //   System.out.println(capitals);

            countriesAndCapitals.put(countries, capitals);
        }
        System.out.println(countriesAndCapitals);
    }


}


