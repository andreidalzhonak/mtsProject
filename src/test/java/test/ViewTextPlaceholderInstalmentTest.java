package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class ViewTextPlaceholderInstalmentTest extends BaseWithThreadLocalTest {

  @Test
  public void isDisplayedTextPlaceholderInstalment() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    onlineReplenishmentWithoutCommission.choiseInstalment();
    Assert.assertEquals(onlineReplenishmentWithoutCommission.scoreInstalment(),
        "Номер счета на 44");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.sumInstalment(),
        "Сумма");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.emailInstalment(),
        "E-mail для отправки чека");
  }
}
