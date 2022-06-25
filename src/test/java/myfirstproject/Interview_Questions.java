package myfirstproject;

public class Interview_Questions {
      /*
  Interview Questions

     1-  Tell me 5 exception that you get.What type of exceptions do you get in selenium?
     ==> NullPointerException,  TimeOut Exception ,  NoSuchElementException,   StaleElementException ,   WebDriverException


     2- What is your solution?
     ==> We can read the console, read error message ,try to understand what is the problem
     ==> Check Locator , Do manual Test , Add wait ,Searched the problem


     3-  What type of waits do you use?
     ==> We can use implicit wait and explicit wait


     4- Which wait do you prefer? Why do you prefer that wait?
     ==> It depends on the case
     ==> I prefer implicitly wait first if it doesn't work,or it is not enough I will try explicit wait
     ==> As last solution we might try Thread.sleep()


     5- How to you resolve synchronization issue?
     ==> We can use different wait types for solving synchronization issues



  /*
        What is the difference between assertion and verification?
Assertion means hard assertion. Verification means soft assertion. Verification is similar to if else statement.
If hard assertion fails, rest of the test case stops.
What is the difference between soft assert and hard assert?
Hard assertion stops execution, after assertion failure. Soft assert continues to execute even after failure
We need to create a soft assert object to do soft assertion
assertAll() need to be used in soft assert to make the actual result
Which assertion do you prefer? Why?
I used both. Both assertion are useful. But I used hard assertion the most, because I need to fix the issue the moment it shows up. It usually doesn’t make sense to wait for other tests if there is a failure.
If there are  lots of test cases , I prefer to use hard assert to find the wrong test case quickly to fix it.
If I use soft assertion, It will run all the tests every time even there are wrong cases in them. I usually use soft assertion when I write new test cases to see if all good or some fails.
         */



}
