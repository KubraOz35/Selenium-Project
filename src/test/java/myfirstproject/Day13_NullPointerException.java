package myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Day13_NullPointerException {

    String s;
    WebDriver driver;
    Faker faker;

        @Test
        public void test01() {
            System.out.println(s.length());//NullPointerException
        }

        @Test
        public void nullPointerExceptionTest01(){
            WebDriverManager.chromedriver().setup();
             driver.manage().window().maximize();  //NullPointerException
                                                   //we created driver but we didn't initialize it
        }

        @Test
        public void nullPointerExceptionTest02(){
            System.out.println(faker.name().firstName());    //NullPointerException
                                                             //we created faker but we didn't initialize it




        }
    }
