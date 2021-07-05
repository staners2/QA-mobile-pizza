package info.esoft.pizza.helpers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Settings {
    protected static AndroidDriver driver;
    protected static String pathFilePizzaApk = "/Users/user/Downloads/pizza.apk";
    protected static String nameDevice = "MyPhone";
    protected static String connectAppiumString = "http://127.0.0.1:4723/wd/hub";

    private static DesiredCapabilities setSettingCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, nameDevice);
        capabilities.setCapability(MobileCapabilityType.APP, pathFilePizzaApk);
        return capabilities;
    }

    protected static AndroidDriver createAndroidDriver() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL(connectAppiumString), setSettingCapabilities());
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }


}
