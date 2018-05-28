package automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class signup {
	
	public void openurl(){
		System.setProperty("webdriver.firefox.marionette","");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public void signup1(){
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
  	System.setProperty("webdriver.firefox.marionette","");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
		//this.openurl();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name("firstname")).sendKeys("Durank");	
	driver.findElement(By.name("lastname")).sendKeys("sharma");
	driver.findElement(By.name("reg_email__")).sendKeys("vandana.chauhan@abspl.in");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vandana.chauhan@abspl.in");
	driver.findElement(By.name("reg_passwd__")).sendKeys("vandana@123");
	Select day=new Select(driver.findElement(By.name("birthday_day")));
	day.selectByIndex(20);
	Select month=new Select(driver.findElement(By.name("birthday_month")));
	month.selectByVisibleText("Jan");
	Select year=new Select(driver.findElement(By.name("birthday_year")));
	year.selectByValue("1990");
	WebElement radio=driver.findElement(By.name("sex"));
	radio.click();
	driver.findElement(By.name("websubmit")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.close();
	}
	public void signin(){
		System.setProperty("webdriver.firefox.marionette","");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
    	driver.findElement(By.name("email")).sendKeys("vandana.chauhan@abspl.in");
    	driver.findElement(By.name("pass")).sendKeys("vandana@123");
    	driver.findElement(By.linkText("Log In")).click();
    	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      signup Scall=new signup();
      //Scall.openurl();
     // Scall.signup1();
      Scall.signin();
	}

}
