package drivermanager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

  protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

  public abstract void createDriver();

  public WebDriver getDriver() {
    return threadLocalDriver.get();
  }

  public void startMaximize() {
    threadLocalDriver.get().manage().window().maximize();
  }

  public void setTimeout() {
    threadLocalDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  public void quitDriver() {
    getDriver().quit();
  }
}
