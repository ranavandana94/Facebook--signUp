package automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import com.gargoylesoftware.htmlunit.javascript.host.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class FirstAppiumTest {

	// Create instance for Appium Driver
	AppiumDriver<WebElement> driver;

	@BeforeClass
	public void Setup() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"com.example.calculator");
		cap.setCapability("avd", "Test");

		driver = new AndroidDriver<WebElement>(new URL(
				"http://127.0.0.1:4723/wd/hub"), cap);

	}

	@Test
	public void SimpleTest() {
		Assert.assertNotNull(driver.getContext());
         }
}