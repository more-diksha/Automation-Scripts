/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author admin
 */
public class Images {
    public static void main(String args[]) throws InterruptedException
    {
        //Launch Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\NetBeansProjects\\SeleniumPracticeProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Save the url
        String baseurl = "http://automationpractice.com/index.php?id_category=3&controller=category";
        
        //Go to the url
        driver.get(baseurl);
        
        //Maximize the Browser
        driver.manage().window().maximize();
        
        //Testcase1: Get the number of images on the webpage
        List <WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Number of images on the web page are=========>>" + images.size());
        
        //TestCase2:Get all sources of all the images
        List <WebElement> imagessrc = driver.findElements(By.tagName("img"));
        for(int i =0; i<imagessrc.size(); i++)
        {
            System.out.println(imagessrc.get(i).getAttribute("src"));
        }
        
        //TestCase3:Clicking on Image
        WebElement image1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
        image1.click();
        Thread.sleep(3000);
        
        //Get url of the curreny redirected page
        String url = driver.getCurrentUrl();
        System.out.println("Current Url is: " + url);
        
        //Get title of the current redirected page
        String title = driver.getTitle();
        System.out.println("Title of thepage is" + title);
        
        //Close the browser
        driver.close();
    }
    
}
