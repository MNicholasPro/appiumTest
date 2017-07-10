package commonController;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by april_chou on 2017/7/2.
 */
public class AppUiBaseDevice {

    /*定义一个driver*/
    public static AndroidDriver<AndroidElement> driver;

    /*对基本配置进行配置*/
    public static AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "April");
        caps.setCapability("appPackage", "cn.caocaokeji.driver");
        caps.setCapability("appActivity", ".activity.ActLoading");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        return driver;
    }
}
