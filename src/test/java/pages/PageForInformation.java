package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageForInformation extends BasePage {

  public PageForInformation(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//h3[contains(text(), 'Оплата банковской картой')]")
  private WebElement namePage;

  public String checkNamePage() {
    String name = namePage.getText();
    return name;
  }
}
