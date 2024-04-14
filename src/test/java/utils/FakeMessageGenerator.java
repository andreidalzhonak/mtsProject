package utils;

import java.util.Locale;
import net.datafaker.Faker;

public class FakeMessageGenerator {


  public static int generateSum() {
    return new Faker().number().randomDigitNotZero();
  }

  public static String generateEmail() {
    return new Faker().internet().emailAddress();
  }

}
