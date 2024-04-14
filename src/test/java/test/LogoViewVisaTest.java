package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

@Test
public class LogoViewVisaTest extends BaseWithThreadLocalTest {

  public void isLogoVisa() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    Assert.assertFalse(onlineReplenishmentWithoutCommission.isVisiableVisa());
  }
}
