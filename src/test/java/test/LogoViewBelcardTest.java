package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineReplenishmentWithoutCommission;

public class LogoViewBelcardTest extends BaseWithThreadLocalTest {

  @Test
  public void isLogoBelcard() {
    OnlineReplenishmentWithoutCommission onlineReplenishmentWithoutCommission = new OnlineReplenishmentWithoutCommission(
        driverManager.getDriver());
    onlineReplenishmentWithoutCommission.openPage();
    onlineReplenishmentWithoutCommission.canceledCookies();
    Assert.assertFalse(onlineReplenishmentWithoutCommission.isVisiablelogoBelcard());
  }
}
