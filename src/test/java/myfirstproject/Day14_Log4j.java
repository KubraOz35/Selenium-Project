package myfirstproject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

    public class Day14_Log4j {

        private static Logger logger = LogManager.getLogger(Day14_Log4j.class.getName());


        @Test
        public void log4jDemo(){
            logger.info("Info log");
            logger.debug("Debug log");
            logger.error("Error log");
            logger.fatal("Fatal log");
        }


        //    1.Change the LEVEL to trace to see all Logs
//    2.Log the information in a file
//    3.Do all there for the test package ONLY


    }

