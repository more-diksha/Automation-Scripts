/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.session.ChromeFilter;

/**
 *
 * @author Diksha
 */
public class HeadlessBrowser {
    
    public static void main(String args[]){
    String baseUrl = "http://google.com";
    HtmlUnitDriver unitDriver = new HtmlUnitDriver();
    unitDriver.get(baseUrl);
    System.out.println("Title of the Page is:" + unitDriver.getTitle());
    WebElement searchBox = unitDriver.findElement(By.name("q"));
    searchBox.sendKeys("Manoj Dhadke");
    WebElement button = unitDriver.findElement(By.name("btnK"));
    button.click();
        System.out.println("URL------>" +unitDriver.getCurrentUrl() );
    }
}
