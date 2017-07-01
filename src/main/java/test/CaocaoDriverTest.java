package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import commonController.SwipeTo;
import io.appium.java_client.android.AndroidElement;
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

public class CaocaoDriverTest {
//	private static AppiumDriver driver;
	private static AndroidDriver<AndroidElement> driver;

	@BeforeClass
	public static void setUp() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "April");
		caps.setCapability("appPackage", "cn.caocaokeji.driver");
		caps.setCapability("appActivity", ".activity.ActLoading");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	@Test
	public void test() throws IOException{

		for(int i = 0;i < 3;i ++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

			}
//		SwipeTo.swipeToLeft(driver,60,3);
			driver.swipe(450, 300, 50, 300, 500);
		}

		WebElement startWork = driver.findElement(By.id("cn.caocaokeji.driver:id/btn_start_experience"));
		startWork.click();
		WebElement register = driver.findElement(By.id("cn.caocaokeji.driver:id/bt_sign_up"));
		register.click();

	}

	@AfterClass
	public static void tearDown(){
		driver.quit();
	}
}
