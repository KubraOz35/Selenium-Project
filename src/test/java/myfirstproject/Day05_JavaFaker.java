package myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {



    @Test
    public void fakerTest(){
        //create faker object
        Faker faker=new Faker();

        //generate fake data
        String fName=faker.name().firstName();
        System.out.println(fName);

        String lName=faker.name().lastName();
        System.out.println(lName);

        String fullName=faker.name().fullName();
        System.out.println(fullName);

        String userName=faker.name().username();
        System.out.println(userName);

        String title=faker.name().title();
        System.out.println(title);

        String city = faker.address().city();
        System.out.println(city);

        String state=faker.address().state();
        System.out.println(state);

        String fullAddress=faker.address().fullAddress();
        System.out.println(fullAddress);

        String cellPhone=faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

        String email=faker.internet().emailAddress();
        System.out.println(email);

        String randomZipCode = faker.number().digits(5);
        System.out.println(randomZipCode);

    }
}
