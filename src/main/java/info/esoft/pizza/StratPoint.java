package info.esoft.pizza;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StratPoint {

    public static void main(String[] params) throws MalformedURLException {
        String filePizzaApk = "/Users/user/Downloads/pizza.apk";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MyPhone");
        capabilities.setCapability(MobileCapabilityType.APP, filePizzaApk);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Connected!");

        // cancel condtion
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();
        // close modaldialog
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View")).click();
        String menu = driver.findElement(By.id("fef407c2-a92d-494c-92de-63d0ec4701e3")).getText();
        System.out.println("Name: " + menu);
    }

}
