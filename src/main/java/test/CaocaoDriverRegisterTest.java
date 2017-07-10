package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import commonController.SwipeTo;
import getPageObject.GetEnumDriverResgisterElements;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.EnumDriverResgisterElements;

public class CaocaoDriverRegisterTest extends GetEnumDriverResgisterElements{
//	private static AppiumDriver driver;
//	public static AndroidDriver<AndroidElement> driver;

	@BeforeClass
	public static void setup() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = setUp();
	}
/*	public static void setUp() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "April");
		caps.setCapability("appPackage", "cn.caocaokeji.driver");
		caps.setCapability("appActivity", ".activity.ActLoading");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}*/

	@Test
	public void test() throws IOException{


		GetEnumDriverResgisterElements getEnumDriverResgisterElements = new GetEnumDriverResgisterElements();

		/*设置左滑，滑动1秒，滑动3次*/
		SwipeTo.swipeToLeft(driver,500, 3);

		/*寻找元素进行点击*/
		driver.findElement(By.id("cn.caocaokeji.driver:id/btn_start_experience")).click();
		driver.findElement(By.id("cn.caocaokeji.driver:id/bt_sign_up")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		/*进行司机注册输入手机号*/
		/*WebElement textPhone = driver.findElement(By.id("cn.caocaokeji.driver:id/et_phone"));
		textPhone.click();
		textPhone.sendKeys("12345678901");*/

		getEnumDriverResgisterElements.getEt_phone_id().click();
		getEnumDriverResgisterElements.getEt_phone_id().sendKeys("12345678901");


		/*获取验证码*/
		driver.findElement(By.id("cn.caocaokeji.driver:id/bt_get_validate_code")).click();

		/*进行司机注册输入验证码*/
		WebElement textPhoneCode = driver.findElement(By.id("cn.caocaokeji.driver:id/et_code"));
		textPhoneCode.click();
		textPhoneCode.sendKeys("1234");

		/*点击下一步完成*/
		driver.findElement(By.id("cn.caocaokeji.driver:id/bt_confirm")).click();


	}

	@AfterClass
	public static void tearDown(){
		driver.quit();
	}
}
