package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStep2 {

    public static final Target TEXT_AUTODETECTED_CITY =
            Target.the("text which notifies us that the city was autodetected").located(By.xpath(
                    "//div[@class='form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12']" +
                    "//span[contains(@ng-show, 'autoDetectAddress.city')]"));
    public static final Target TEXT_AUTODETECTED_ZIP =
            Target.the("text which notifies us that the zip code was autodetected").located(By.xpath(
                    "//div[@class='form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12']" +
                    "//span[contains(@ng-show, 'autoDetectAddress.zip')]"));
    public static final Target TEXT_AUTODETECTED_COUNTRY =
            Target.the("text which notifies us that the country was autodetected").located(By.xpath(
                    "//div[@class='form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12 select2-theme-form clear']"
                    + "//span[contains(@ng-show, 'autoDetectAddress.country')]"));
    public static final Target BUTTON_NEXT =
            Target.the("button that allows us move on the next step (3)")
                    .located(By.xpath("//div[@class='pull-right next-step']//a/span[contains(text(),'Next: Devices')]"));
}
