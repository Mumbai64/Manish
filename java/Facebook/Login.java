package Facebook;

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

@Given ("I want to open browser")
public void openbrowser() {
//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe"); 	
browser=new ChromeDriver();
}
@And ("I open url of facebook application")
public void openurl() {
	String Expected = "Login - FACEBOOK";
	//String Expected = "Dashboard -FACEBOOK";
	browser.manage().window().maximize();
	//browser.manage().window().maximize();
	browser.get("https://www.facebook.com/");
	//Assert.assertEquals(browser.getTitle(), Expected);
	//String Expected = "Dashboard - PHPTRAVELS";
	//browser.findElement(By.name("email")).sendKeys("mm.manish@gmail.com");
	//String Expected = "Login - FACEBOK";
	//browser.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/a[2]")).click();
    Assert.assertEquals(browser.getTitle(),Expected);
}

@When("I open username")
public void enter_username() throws Throwable {
	browser.findElement(By.id("email")).sendKeys("mm.manish@gmail.com");
//public void username() {
	//findElement(By.id("email")).sendKeys("mm.manish.COM");
	//System.out.println("username");
}
@And("I enter password")
public void password() throws Throwable{
	browser.findElement(By.id("pass")).sendKeys("Patel88");
	System.out.println("password");
}
@And("I click remember me")
	public void rememberme() {
	browser.findElement(By.id("u_0_d_f4")).click();
//Assert.assertEquals(browser.getTitle(),Expected);
}
@And  ("I click Login button")
public void loginbutton() {
	//browser.findElement(By.xpath(("//*[@id=\"u_0_h_GI\"]")).click();
	System.out.println("loginbutton");
	}
@Then ("dashboard page of facebook should open")
public void dashboard() {
	System.out.println("open");
}
	
	
	
	
}