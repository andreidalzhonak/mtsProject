package test;

import drivermanager.DriverType;
import drivermanager.DriverManager;
import drivermanager.DriverFactory;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;


public class BaseWithThreadLocalTest {

  DriverManager driverManager;

  @BeforeMethod
  public void createManager() {
    DriverFactory factory = new DriverFactory();
    driverManager = factory.getManager(DriverType.CHROME);
  }

  @BeforeMethod
  public void setUp() {
    driverManager.createDriver();
    driverManager.startMaximize();
    driverManager.setTimeout();
  }

  public WebDriver getDriver() {
    return driverManager.getDriver();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() {
    driverManager.quitDriver();
  }
}
