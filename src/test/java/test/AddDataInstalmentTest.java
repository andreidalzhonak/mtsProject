package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;
import pages.PaymentPage;

public class AddDataInstalmentTest extends BaseWithThreadLocalTest {

  @Test
  public void inputData() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission =
        new OnlineReplenishmentWithoutCommission(driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    onlineReplenishmentWithoutCommission.addInformationInField();
    PaymentPage paymentPage = new PaymentPage(driverManager.getDriver());
    Assert.assertEquals(paymentPage.checkAmount(),
        5);
    Assert.assertEquals(paymentPage.checkAmountButton(), 5);
    Assert.assertEquals(paymentPage.getNumberPhone(), "Оплата: Услуги связи Номер:375297777777");
    Assert.assertEquals(paymentPage.getNumberOfCardField(), "Номер карты");
    Assert.assertEquals(paymentPage.getValidatyPeriodField(), "Срок действия");
    Assert.assertEquals(paymentPage.getCvcField(), "CVC");
    Assert.assertEquals(paymentPage.getHoldersNameField(), "Имя держателя (как на карте)");
    Assert.assertFalse(paymentPage.isVisiableIconVisa());
    Assert.assertFalse(paymentPage.isVisiableIconMasterCard());
    Assert.assertFalse(paymentPage.isVisiableIconBelCard());
  }
}
