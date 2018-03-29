package com.vocalink.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vocalink.utility.UIdata;

public class FindOwner {
	public static Logger log = Logger.getLogger(FindOwner.class.getName());
	public boolean addowner(WebDriver driver) throws Exception {
			
		boolean isownerAdded = false;

	        log.info("Started data adding into owner form");	
			WebDriverWait wait = new WebDriverWait(driver, 70L);
			
			//Clicking on find owners menu
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//A[@href='/owners/find']")));
			driver.findElement(By.xpath("//A[@href='/owners/find']")).click();
			log.info("Clicked on Find Owner menu");
			
			Thread.sleep(5000);
			
			//Clicking on Add button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/owners/new']")));
			driver.findElement(By.xpath("//a[@href='/owners/new']")).click();
			log.info("Clicked on Add Owner Button");
			
			Thread.sleep(5000);
			
			//Entering data into first name field
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
			driver.findElement(By.id("firstName")).sendKeys("Mark");
			log.info("Owner first name entered");
			
			Thread.sleep(2000);
			
			//Entering data into last name field
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
			driver.findElement(By.id("lastName")).sendKeys("Duglas");
			log.info("Owner last name entered");
			
			Thread.sleep(2000);
			
			//Entering data into address field
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
			driver.findElement(By.id("address")).sendKeys("Address 0012 Test");
			log.info("Entered owner address");
			
			Thread.sleep(2000);
			
			//Entering data into city field
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
			driver.findElement(By.id("city")).sendKeys("London");
			log.info("Entered owner city");
			
			Thread.sleep(2000);
			
			//Entering data into telephone field
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("telephone")));
			driver.findElement(By.id("telephone")).sendKeys("950325698");
			log.info("Entered telephone number");
			
			Thread.sleep(3000);
			
			//Clicking on submit button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			log.info("Clicked on submit button");
			
	        Thread.sleep(4000);
	        
	        //Navigating user to home page
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='home page']")));
			driver.findElement(By.xpath("//a[@title='home page']")).click();
			log.info("Navigated to Home page");
			
			Thread.sleep(4000);
			
			isownerAdded = true;
	
		return isownerAdded;
	}
}
