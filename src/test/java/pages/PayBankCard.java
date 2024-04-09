package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBankCard extends BasePage {


  public PayBankCard(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//h3[contains(text(), 'Оплата банковской картой')]")
  private WebElement namePage;
}
