package getPageObject;

import commonController.AppUiBaseDevice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.EnumDriverResgisterElements;
import test.CaocaoDriverRegisterTest;

/**
 * Created by april_chou on 2017/7/2.
 */
public class GetEnumDriverResgisterElements extends AppUiBaseDevice {

    public By et_phone_id = By.id(EnumDriverResgisterElements.et_phone.getE_id());//返回

    /**
     * 输入手机号
     */
    public WebElement getEt_phone_id() {
        return driver.findElement(et_phone_id);
    }

}
