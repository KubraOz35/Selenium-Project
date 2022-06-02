package practice02;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Q06 {

    //Verify that we have a pom.xml file in our project


    @Test
    public void test() {
        String homePath = System.getProperty("user.home");

        String filePath = homePath + "\\IdeaProjects\\myseleniumprojectwinter2022\\pom.xml";

        String absolutePath = "C:\\Users\\kubra\\IdeaProjects\\myseleniumproject\\pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(filePath)));


    }
}