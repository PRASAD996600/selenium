package org.testing.selenium_test_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    System.out.println("Script Started");	
       //initializing the web driver
    System.setProperty("webdriver.chrome.driver", "/Users/shubham/Documents/softwares/chrome-driver/chromedriver");

    //setting properties
    ChromeOptions chromeOptions = new ChromeOptions();
    // open url
    System.out.println("Driver opening up the url in browser");	
    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.get("http://localhost:8080/addressbook/");	
    
    //invole implicit waits to load the page
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    
    System.out.println("Enter details in the form");
    //enter details
    driver.findElement(By.className("v-button")).click();	
    Thread.sleep(2000);
    //firstname gwt-uid-5
    driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham Singh");
    Thread.sleep(2000);
    //lastname gwt-uid-7
    driver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
    Thread.sleep(2000);
    //contactno id="gwt-uid-9"
    driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
    //email gwt-uid-11
    driver.findElement(By.id("gwt-uid-11")).sendKeys("shubham@xyz.com");
    //date of birth gwt-uid-13
    driver.findElement(By.id("gwt-uid-13")).sendKeys("04/09/2023,");
    Thread.sleep(2000);
    //click on save -by class = v-button-primary
    driver.findElement(By.className("v-button-primary")).click();
    System.out.println("Saving details");
    Thread.sleep(2000);
    
    System.out.println("Test Case execution completed");
    Thread.sleep(2000);
    driver.quit();
    
    
    
    
    
    
    
    
    //submit form
    	
    //validate results
    	
    //take and store screenshots.
    	
    	
    	
    	
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
