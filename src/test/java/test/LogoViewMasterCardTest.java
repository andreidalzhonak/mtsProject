package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class LogoViewMasterCardTest extends BaseWithThreadLocalTest {
  @Test
  public void isLogoViewMasterCard() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    Assert.assertFalse(onlineReplenishmentWithoutCommission.isVisiablelogoMasterCard());
  }
}
