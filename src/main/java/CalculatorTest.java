
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
	private static AppiumDriver driver;
	@BeforeClass
	public static void setUp() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "demo");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", ".Calculator");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}
	
	@Test
	public void testmul() throws IOException{
		WebElement num9 = driver.findElement(By.name("9"));
		num9.click();
		
		WebElement mul = driver.findElement(By.name("×"));
		mul.click();
		
		WebElement num2 = driver.findElement(By.name("2"));
		num2.click();
		
		WebElement equal = driver.findElement(By.name("equals"));
		equal.click();
		
	    WebElement result = driver.findElement(By.className("android.widget.EditText"));
		Assert.assertEquals(result.getText(), "18",  "输出结果错误！");

		System.out.println("输出结果正确！");
	}
	
	@AfterClass
	public static void tearDown(){
		driver.quit();
	}
}
