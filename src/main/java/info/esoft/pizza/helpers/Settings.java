package info.esoft.pizza.helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Settings {

    protected static String pathFilePizzaApk = "/Users/user/Downloads/pizza.apk";
    protected static String nameDevice = "Pixel_3a_API_30_x86";
    protected static String connectAppiumString = "http://127.0.0.1:4723/wd/hub";
    protected static String platformName = "Android";

    private static DesiredCapabilities setSettingCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, nameDevice);
        capabilities.setCapability(MobileCapabilityType.APP, pathFilePizzaApk);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        return capabilities;
    }

    protected static AndroidDriver createAndroidDriver() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL(connectAppiumString), setSettingCapabilities());
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }

    protected static WebDriver setSettingsForDriver() throws MalformedURLException {
        WebDriver driver = createAndroidDriver();

        WebDriverRunner.setWebDriver(driver);
        return driver;
    }
}
