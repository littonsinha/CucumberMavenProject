package com.newtours.qa.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login
{
	WebDriver driver;
	String expectedTitle = "Welcome: Mercury Tours";
	
	@Given("user is already on login page")
	public void user_is_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "..\\CucumberMavenProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		System.out.println("User navigates to URL");
	}
	
	@And("username and password are entered")
	public void username_and_password_are_entered()
	{
		//String actualtitle = driver.getTitle();
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("sinha.litton@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("India@123");
		System.out.println("User enters login details ");
	}
	@When("user clicks on signin button")
	public void user_clicks_on_signin_button()
	{
		
		driver.findElement(By.cssSelector("input[name='login']")).click();
		System.out.println("User clicks login button");
	}
}