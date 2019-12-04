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
 * @author Diksha 
 */
public class LinkMethods {
    
    public static void main(String args[]){
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diksha\\Documents\\NetBeansProjects\\mavenproject1\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Go to URL
        driver.get("https://www.cleartrip.com/activities");
        //fetch List of all the links on the Web page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
       
        //Find link using parialLinkText()and click on that element
        WebElement link = driver.findElement(By.partialLinkText("/activities/bangalore"));
        link.click();
        driver.close();
    }

   
}
