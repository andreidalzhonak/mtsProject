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
  private WebElement phoneNumberConnectionPlaceholder;

  @FindBy(id = "connection-sum")
  private WebElement sumConnectionPlaceholder;

  @FindBy(id = "connection-email")
  private WebElement emailConnectionPlaceholder;

  @FindBy(css = "#pay-connection > button")
  private WebElement buttonContinue;

  @FindBy(xpath = "//p[contains(@class, 'header__payment-info')]")
  private WebElement textArea;
  @FindBy(id = "internet-phone")
  private WebElement phoneNumberInternetPlaceholder;

  @FindBy(id = "internet-sum")
  private WebElement sumInternetPlaceholder;

  @FindBy(id = "internet-email")
  private WebElement emailInternetPlaceholder;

  @FindBy(id = "score-instalment")
  private WebElement scoreInstalmentPlaceholder;

  @FindBy(id = "instalment-sum")
  private WebElement sumInstalmentPlaceholder;

  @FindBy(id = "instalment-email")
  private WebElement emailInstalmentPlaceholder;

  @FindBy(id = "score-arrears")
  private WebElement scoreArrearsPlaceholder;

  @FindBy(id = "arrears-sum")
  private WebElement sumArrearsPlaceholderr;

  @FindBy(id = "arrears-email")
  private WebElement emailArrearsPlaceholder;

  @FindBy(xpath = "//div[contains(@class, 'pay__form')]//p[contains(text(), 'Домашний интернет')]")
  private WebElement homeInternetPaymentList;

  @FindBy(xpath = "//div[contains(@class, 'pay__form')]//p[contains(text(), 'Рассрочка')]")
  private WebElement instalmentPaymentList;

  @FindBy(xpath = "//div[contains(@class, 'pay__form')]//p[contains(text(), 'Задолженность')]")
  private WebElement arrearsPaymentList;

  @FindBy(xpath = "//div[contains(@class, 'pay__form')]//span[2]")
  private WebElement paymentList;


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
    phoneNumberConnectionPlaceholder.sendKeys("297777777");
    sumConnectionPlaceholder.sendKeys("5");
    emailConnectionPlaceholder.sendKeys(
        PrepareAddInformationForPayments.addInformationData().getEmail());
    buttonContinue.click();
  }

  public String getTextNumber() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
    wait.until(ExpectedConditions.elementToBeClickable(textArea));
    String text = textArea.getText();
    return text;
  }

  public String phoneNumberCommunicationService() {
    return phoneNumberConnectionPlaceholder.getAttribute("placeholder");
  }

  public String sumCommunicationService() {
    return sumConnectionPlaceholder.getAttribute("placeholder");
  }

  public String emailCommunicationService() {
    return emailConnectionPlaceholder.getAttribute("placeholder");
  }

  public void choiseHomeInternet() {
    paymentList.click();
    homeInternetPaymentList.click();
  }

  public String phoneNumberHomeInternet() {
    return phoneNumberInternetPlaceholder.getAttribute("placeholder");
  }

  public String sumHomeInternet() {
    return sumInternetPlaceholder.getAttribute("placeholder");
  }

  public String emailHomeInternet() {
    return emailInternetPlaceholder.getAttribute("placeholder");
  }

  public String scoreInstalment() {
    return scoreInstalmentPlaceholder.getAttribute("placeholder");
  }

  public String sumInstalment() {
    return sumInstalmentPlaceholder.getAttribute("placeholder");
  }

  public String emailInstalment() {
    return emailInstalmentPlaceholder.getAttribute("placeholder");
  }

  public void choiseInstalment() {
    paymentList.click();
    instalmentPaymentList.click();
  }

  public void choiseArrears() {
    paymentList.click();
    arrearsPaymentList.click();
  }

  public String scoreArrears() {
    return scoreArrearsPlaceholder.getAttribute("placeholder");
  }

  public String sumArrears() {
    return sumArrearsPlaceholderr.getAttribute("placeholder");
  }

  public String emailArrears() {
    return emailArrearsPlaceholder.getAttribute("placeholder");
  }

}

