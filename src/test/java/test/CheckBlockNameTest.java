package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class CheckBlockNameTest extends BaseWithThreadLocalTest {

  @Test(priority = 1)

  public void checkBlockName() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();

    Assert.assertEquals(onlineReplenishmentWithoutCommission.checkBlockName(),
        "Онлайн пополнение\n"
            + "без комиссии");


  }
}
