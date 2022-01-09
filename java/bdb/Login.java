package bdb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver browser;
@Given("I want to open browser")
public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe"); 	
	//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	browser=new ChromeDriver();
}
@And("I open url of PHP travels application")
public void openurl() {
	String Expected = "PHPTRAVELS - PHPTRAVELS";
	browser.manage().window().maximize();
	browser.get("https://www.phptravels.net/signup");
	Assert.assertEquals(browser.getTitle(), Expected);
	
}
@When  ("I Enter Username")
public void username() {
	String Expected = "Dashboard - PHPTRAVELS";
	browser.findElement(By.name("email(username)")).sendKeys("user@phptravels.com");
	//browser.findElement(By.name("password")).sendKeys("demouser");
	//browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")).click();
	//browser.findElement(By.id("cookie_stop")).click();
	//browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
    Assert.assertEquals(browser.getTitle(), Expected);
	//browser.findElement(By.name("email")).sendKeys("user@phptravels.com");
	System.out.println("username enter");
}
@And("I Enter Password")
public void Password() {
	
	browser.findElement(By.name("password")).sendKeys("demouser");
	System.out.println(" enter password");
}
@ And  ("I  Click remember me")
public void rememberme() {
	System.out.println();
}
@And   ("I Click login button")
public void loginbutton() {
	System.out.println("login button");
}
@Then  ("Dashboard page of php travels should open")
public void dashboard() {
	System.out.println("Dashboard");
	
}
}
