package test;

import org.testng.Assert;
import pages.OnlineReplenishmentWithoutCommission;

public class CheckBlockNameTest extends BaseWithThreadLocalTest {

  public void checkBlockName() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();

    Assert.assertEquals(onlineReplenishmentWithoutCommission.checkBlockName(),
        "Онлайн пополнение без комиссии");
  }
}
