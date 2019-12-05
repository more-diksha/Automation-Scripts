/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Diksha
 */
public class RadioButton {
  
    public static void main(String args[]) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Diksha\\Documents\\NetBeansProjects\\mavenproject1\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    //Save url in the String
    String baseurl = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";
    
    //Maximize the windows that is launched
    driver.manage().window().maximize();
    
    //Go to the url
    driver.get(baseurl);
    
    // create object of WebDriverWait Class 
        WebDriverWait explicitwait = new WebDriverWait(driver, 50);
    
     //Wait untill Element is not visible
        WebElement element = (WebElement) explicitwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\\\"easycont\\\"]/div/div[2]/div[1]/div[2]/label[1]")));
        //Boolean status = element.booleanValue();
        
    //Get Male radio button
    WebElement male_radio_button = driver.findElement(By.className("radio-inline"));
    Boolean status = male_radio_button.isDisplayed();
    System.out.println("The very first status of the Radio button is ------->" + status);
    
    
    }
}