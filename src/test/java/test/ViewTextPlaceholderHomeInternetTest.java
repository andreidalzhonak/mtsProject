package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class ViewTextPlaceholderHomeInternetTest extends BaseWithThreadLocalTest {

  @Test
  public void isDisplayedTextPlaceholderHomeInternet() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    onlineReplenishmentWithoutCommission.choiseHomeInternet();
    Assert.assertEquals(onlineReplenishmentWithoutCommission.phoneNumberHomeInternet(),
        "Номер абонента");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.sumHomeInternet(),
        "Сумма");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.emailHomeInternet(),
        "E-mail для отправки чека");

  }
}
