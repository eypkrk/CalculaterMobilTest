package calculatepom.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    AppiumDriver driver;
    WebDriverWait wait;

    public BasePage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,60);
    }

    public void waitElement(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public WebElement findElement(By by){
        waitElement(by);
        return driver.findElement(by);
    }

    public void click(By by){
        findElement(by).click();
    }

    public void senKeys(By by,String txt){
        findElement(by).sendKeys(txt);
    }

    public void clear(By by){
        findElement(by).clear();
    }

    public String getTetxt(By by){
        return findElement(by).getText();
    }

}
