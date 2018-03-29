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
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//A[@href='/owners/find']")));
			driver.findElement(By.xpath("//A[@href='/owners/find']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/owners/new']")));
			driver.findElement(By.xpath("//a[@href='/owners/new']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
			driver.findElement(By.id("firstName")).sendKeys("Mark");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
			driver.findElement(By.id("lastName")).sendKeys("Duglas");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
			driver.findElement(By.id("address")).sendKeys("Address 0012 Test");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
			driver.findElement(By.id("city")).sendKeys("London");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("telephone")));
			driver.findElement(By.id("telephone")).sendKeys("950325698");
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	        log.info("Data added into owner form");	

			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='home page']")));
			driver.findElement(By.xpath("//a[@title='home page']")).click();
			
			log.info("Navigated to Home page");
			
			isownerAdded = true;
	
		return isownerAdded;
	}
}
