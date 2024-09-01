package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class ViewTextPlaceholderArrearsTest extends BaseWithThreadLocalTest {

  @Test
  public void isDisplayedTextPlaceholderArrears() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    onlineReplenishmentWithoutCommission.choiseArrears();
    Assert.assertEquals(onlineReplenishmentWithoutCommission.scoreArrears(),
        "Номер счета на 2073");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.sumArrears(),
        "Сумма");
    Assert.assertEquals(onlineReplenishmentWithoutCommission.emailArrears(),
        "E-mail для отправки чека");

  }
}
