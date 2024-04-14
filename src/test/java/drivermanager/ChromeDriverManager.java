package drivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

  @Override
  public void createDriver() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("disable-popup-blocking");
    options.addArguments("window-size=1800x900");
    options.addArguments("--disable-notifications");
    threadLocalDriver.set(new ChromeDriver(options));
  }
}
