package info.esoft.pizza.helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.webdriver.WebDriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Settings {

    protected static String app = "/Users/user/Downloads/pizza.apk";
    protected static String nameDevice = "Pixel_3a_API_30_x86";
    protected static String connectAppiumString = "http://127.0.0.1:4723/wd/hub";
    protected static String platformName = "Android";
    protected static String automationName = "UIAutomator2";

    private static DesiredCapabilities setSettingCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, nameDevice);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
        // capabilities.setCapability("fullReset", true);

        return capabilities;
    }

    protected static AndroidDriver createAndroidDriver() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL(connectAppiumString), setSettingCapabilities());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    protected static void setSettingsForDriver() throws MalformedURLException {
        WebDriver driver = createAndroidDriver();

        WebDriverRunner.setWebDriver(driver);
    }
}
