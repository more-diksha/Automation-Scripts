/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Diksha
 */
public class TestboxMethods {
   public static void main(String args[]){
       
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diksha\\Documents\\NetBeansProjects\\mavenproject1\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
      //Go to the URL
       driver.get("https://accounts.google.com");
      //Find the web element textbox
       WebElement username = driver.findElement(By.id("identifierId"));
       username.sendKeys("more.diksha@gmail.com");
       
       WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
       //Click on the Next button
       nextbutton.click();
       try{
       driver.wait();
       }
       catch(Exception e){
           System.out.println("Session Time Out");
       }
       
       WebElement password = driver.findElement(By.name("password"));
       password.sendKeys("");
       
       WebElement nextbutton2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
       nextbutton2.click();
     
       driver.close();
   } 
}
