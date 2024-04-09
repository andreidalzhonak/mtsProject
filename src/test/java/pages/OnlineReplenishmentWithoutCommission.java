package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineReplenishmentWithoutCommission extends BasePage{
  public OnlineReplenishmentWithoutCommission(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[contains(@class, 'pay')]/h2")
  private WebElement blockNameField;

  @FindBy(xpath = "//div[contains(@class, 'pay__wrapper')]//child::a")
  private WebElement serviceUrl;

  public void openPage() {
    driver.get(Urls.START_SITE_URL);
  }

  public String checkBlockName() {
    String name = blockNameField.getText();
    return name;
  }

}
