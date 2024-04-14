package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testdata.PrepareAddInformationForPayments;

public class OnlineReplenishmentWithoutCommission extends BasePage {

  public OnlineReplenishmentWithoutCommission(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[contains(@class, 'pay')]/h2")
  private WebElement blockNameField;

  @FindBy(xpath = "//div[contains(@class, 'pay__wrapper')]//child::a")
  private WebElement serviceUrl;

  @FindBy(xpath = "//div[contains(@class, 'cookie__buttons')]//button[contains(text(), 'Отклонить')]")
  private WebElement canceledButton;

  @FindBy(css = "img[alt= Visa]")
  private WebElement logoImageVisa;

  @FindBy(css = "img[alt= 'Verified By Visa']")
  private WebElement logoImageVerifiedByVisa;

  @FindBy(xpath = "//div[contains(@class, 'pay__partners')]//ul//li[3]//img")
  private WebElement logoMasterCard;

  @FindBy(css = "img[alt= 'MasterCard Secure Code']")
  private WebElement logoMasterCardSecureCode;

  @FindBy(xpath = "//div[contains(@class, 'pay__partners')]//ul//li[5]//img")
  private WebElement logoBelcard;

  @FindBy(xpath = "//div[contains(@class, 'pay__partners')]//ul//li[6]//img")
  private WebElement logoMir;

  @FindBy(id = "connection-phone")
  private WebElement phoneNumber;

  @FindBy(id = "connection-sum")
  private WebElement sum;

  @FindBy(id = "connection-email")
  private WebElement email;

  @FindBy(css = "#pay-connection > button")
  private WebElement buttonContinue;

  @FindBy(xpath = "//p[contains(@class, 'header__payment-info')]")
  private WebElement textArea;


  public void openPage() {
    driver.get(Urls.START_SITE_URL);
  }

  public String checkBlockName() {
    String name = blockNameField.getText();
    return name;
  }

  public void canceledCookies() {
    canceledButton.click();
  }

  public void pageWithInformationAboutPayCard() {
    serviceUrl.click();
  }

  public boolean isVisiableVisa() {
    logoImageVisa.isDisplayed();
    return false;
  }

  public boolean isVisiablelogoImageVerifiedByVisa() {
    logoImageVerifiedByVisa.isDisplayed();
    return false;
  }

  public boolean isVisiablelogoMasterCard() {
    logoMasterCard.isDisplayed();
    return false;
  }

  public boolean isVisiablelogoMasterCardSecureCode() {
    logoMasterCardSecureCode.isDisplayed();
    return false;
  }

  public boolean isVisiablelogoBelcard() {
    logoBelcard.isDisplayed();
    return false;
  }

  public boolean isVisiablelogoMir() {
    logoMir.isDisplayed();
    return false;
  }

  public void addInformationInField() {
    phoneNumber.sendKeys("297777777");
    sum.sendKeys(PrepareAddInformationForPayments.addInformationData().getSum());
    email.sendKeys(PrepareAddInformationForPayments.addInformationData().getEmail());
    buttonContinue.click();
  }

  public String getTextNumber() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
    wait.until(ExpectedConditions.elementToBeClickable(textArea));
    String text = textArea.getText();
    return text;
  }
}

