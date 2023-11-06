package com.SampleTest.sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample_Test {

	public static WebDriver driver;

	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");

		String crt_header = driver.getTitle();
		System.out.println(crt_header);
		String act_title = "Gmail";

		if (act_title.equals(crt_header)) {
			System.out.println("Login Successsfull");
		}

		else {
			System.out.println("Login Failed");
		}

		System.out.println("Test Completed");
		driver.quit();

	}
	
	@Test
	public void Test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("iamsohail0@gmail.com");
		driver.close();
		
	}

}
