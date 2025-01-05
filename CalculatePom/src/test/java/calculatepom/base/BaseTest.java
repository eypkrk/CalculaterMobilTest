package calculatepom.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseTest {
    static AppiumDriver driver = null;
    public static WebDriverWait wait;

    @BeforeClass
    public void setup(){
        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName","PIXEL2");
            cap.setCapability("platformName","Android");
            cap.setCapability("udid","emulator-5554");
            cap.setCapability("platformVersion","10.0");
            cap.setCapability("appPackage","pl.netigen.calculator");
            cap.setCapability("appActivity","pl.netigen.calculator.SplashActivity");
            cap.setCapability("skipUnlock","true");
            cap.setCapability("noReset","false");

            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(driver,60);

        }catch (Exception e){
            System.out.println("Hatalı işlem yaptınız.");
        }
    }

    public AppiumDriver getAppiumDriver(){
        return driver;
    }

    public void setAppiumDriver(AppiumDriver driver){
        this.driver = driver;
    }

    @AfterClass
    public void teardown(){
        getAppiumDriver().quit();
    }
}
