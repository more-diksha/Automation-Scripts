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
public class Checkboxes {
    public static void main(String args[]) throws InterruptedException
    {
        // Lauch a chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\NetBeansProjects\\SeleniumPracticeProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Save the url
        String baseurl = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
        
        //Go to the above mentioned url
        driver.get(baseurl);
        
        //Maximize the browser that is launched
        driver.manage().window().maximize();
        
        //Email Text box
        WebElement emailtextbox = driver.findElement(By.id("email_create"));
        emailtextbox.sendKeys("manoj.dhadke@getflint.io");
        
        //Click on Submit button
        WebElement submitbutton = driver.findElement(By.id("SubmitCreate"));
        submitbutton.click();
        Thread.sleep(3000);
        
        //TestCase1: Check the Status of the checkbox
        WebElement checkbox1 = driver.findElement(By.id("uniform-newsletter"));
        if(checkbox1.isSelected())
        {
            System.out.println("Checkbox is already selected");
        }
        else
        {
            System.out.println("Checkbox is not selected");
        }
        
        //TestCase2: Get the number of checkboxes on the web page
        List <WebElement> checkboxes;
        checkboxes = (List<WebElement>) driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("Number of Checkboxes are============>>>>" + checkboxes.size());
        Thread.sleep(3000);
       
       //TestCase3: Get the name of the checkboxs
       List <WebElement> checkbox2 = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
       System.out.println("Name of the checkboxes are");
       for(int i=0; i<checkbox2.size(); i++)
       {
           System.out.println(checkbox2.get(i).getAttribute("name"));
       }
       Thread.sleep(3000);
       
       //TestCase4: Get the default status of the checkboxes
       List <WebElement> checkbox3 = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("Default Status of checkboxes are:");
        for(int i=0; i<checkbox3.size(); i++)
        {
            System.out.println(checkbox3.get(i).getAttribute("name") + "------->>>>"  + checkbox3.get(i).getAttribute("checked"));
        }
    }
}
