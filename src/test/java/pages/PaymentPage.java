package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage extends BasePage {

  public PaymentPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//span[contains(text(), 'BYN')]")
  private WebElement paymentAmount;
  @FindBy(xpath = "//div[contains(@class, 'pay-description__text')]//span")
  private WebElement numberPhone;

  @FindBy(xpath = "//button[contains(text(), 'BYN')]")
  private WebElement paymentAmountButton;
  @FindBy(xpath = "//label[contains(text(), 'Номер карты')]")
  private WebElement numberOfCardField;
  @FindBy(xpath = "//label[contains(text(), 'Срок действия')]")
  private WebElement validatyPeriodField;
  @FindBy(xpath = "//label[contains(text(), 'CVC')]")
  private WebElement cvcField;
  @FindBy(xpath = "//label[contains(text(), 'Имя держателя (как на карте)')]")
  private WebElement holdersNameField;
  @FindBy(css = "img[src='assets/images/payment-icons/card-types/visa-system.svg']")
  private WebElement iconVisa;
  @FindBy(css = "img[src='assets/images/payment-icons/card-types/mastercard-system.svg']")
  private WebElement iconMasterCard;
  @FindBy(css = "img[src='assets/images/payment-icons/card-types/belkart-system.svg']")
  private WebElement iconBelCard;


  public int checkAmount() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
    wait.until(ExpectedConditions.elementToBeClickable(paymentAmount));
    String amount = paymentAmount.getText().split(" ")[0];
    int intValue = (int) Math.floor(Double.parseDouble(amount));
    return intValue;
  }

  public int checkAmountButton() {
    String amountButton = paymentAmountButton.getText().split(" ")[1];
    int intValueSumButton = (int) Math.floor(Double.parseDouble(amountButton));
    return intValueSumButton;
  }

  public String getNumberOfCardField() {
    String text = numberOfCardField.getText();
    return text;
  }

  public String getNumberPhone() {
    String text = numberPhone.getText();
    return text;
  }

  public String getValidatyPeriodField() {
    String text = validatyPeriodField.getText();
    return text;
  }

  public String getCvcField() {
    String text = cvcField.getText();
    return text;
  }

  public String getHoldersNameField() {
    String text = holdersNameField.getText();
    return text;
  }

  public boolean isVisiableIconVisa() {
    iconVisa.isDisplayed();
    return false;
  }

  public boolean isVisiableIconMasterCard() {
    iconMasterCard.isDisplayed();
    return false;
  }

  public boolean isVisiableIconBelCard() {
    iconBelCard.isDisplayed();
    return false;
  }

}
