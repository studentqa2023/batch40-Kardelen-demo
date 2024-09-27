package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	MasterPageFactory mpf;
	public void getLogin() {
		
		WebDriverManager.chromiumdriver().setup();
		//open the browser &maximize it
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//go to the url
		//driver.get("https://automationexercise.com/");
		driver.navigate().to("https://automationexercise.com/");
		mpf=new MasterPageFactory();
		
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		
		
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Boston2023");
	    
		
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();	
	    
		
		mvn clean onstall
		driver.findElement(By.xpath("//*[text()=' Logout']"));
	
	}
}
