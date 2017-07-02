package commonController;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidElement;


import java.util.concurrent.TimeUnit;


/**
 * Created by april_chou on 2017/7/1.
 */
public class SwipeTo {


    /**
     * 上滑
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToUp(AppiumDriver<AndroidElement> driver, int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        for (int i = 0; i < num; i++) {
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
        }
    }

    /**
     * 下拉
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToDown(AppiumDriver<AndroidElement> driver,int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        System.out.println(width);
        System.out.println(height);
        for (int i = 0; i < num; i++) {
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
        }
    }

    /**
     * 向左滑动
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToLeft(AppiumDriver<AndroidElement> driver,int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        for (int i = 0; i < num; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            driver.swipe(width * 4 / 5, height / 3, width / 11, height / 3, during);

        }
    }

    /**
     * 向右滑动
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToRight(AppiumDriver<AndroidElement> driver, int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        for (int i = 0; i < num; i++) {
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
        }
    }


}
