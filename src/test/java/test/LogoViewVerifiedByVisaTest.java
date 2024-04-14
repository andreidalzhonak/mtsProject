package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class LogoViewVerifiedByVisaTest extends BaseWithThreadLocalTest {

  @Test
  public void isLogoViewVerifiedByVisa() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    Assert.assertFalse(onlineReplenishmentWithoutCommission.isVisiablelogoImageVerifiedByVisa());
  }
}
