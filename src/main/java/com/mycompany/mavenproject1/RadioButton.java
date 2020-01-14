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
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\NetBeansProjects\\SeleniumPracticeProject\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    //Save url in the String
    String baseurl = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    
    //Maximize the windows that is launched
    driver.manage().window().maximize();
    
    //Go to the url
    driver.get(baseurl);
    
    //Email TextBox
    WebElement textboxemail = driver.findElement(By.id("email_create"));
    textboxemail.sendKeys("manoj.dhadke@getflint.io");
    
    //Submit Button
    WebElement submitbutton = driver.findElement(By.id("SubmitCreate"));
    submitbutton.click();
    
       Thread.sleep(3000);
    //
    
    //Get Male radio button
    WebElement male_radio_button = driver.findElement(By.id("uniform-id_gender1"));
    
        System.out.println(" ========================>>>. The status of Radio button is " + male_radio_button.isDisplayed() + "<<<===============");
    Thread.sleep(3000);
    
    //Get the text of the radio button
    List <WebElement> male_radio_button1 = driver.findElements(By.id("uniform-id_gender1"));
    for(int i = 0; i< male_radio_button1.size(); i++)
    {
        System.out.println("----------------" + male_radio_button1.get(i).getAttribute("text"));
    } 
        Thread.sleep(3000);
    male_radio_button.click();  
    Thread.sleep(3000);
    
    //Close the browser
    driver.close();
    
    }
}