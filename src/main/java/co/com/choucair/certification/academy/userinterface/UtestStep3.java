package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStep3 {
    public static final Target TEXT_AUTODETECTED_PC=
            Target.the("text which notifies us that the PC's OS was autodetected").located(By.xpath(
                    "//div[@class='ui-select-box']//span[contains(@ng-show,'autoDetectDevice.webDevice.osId')]"));
    public static final Target TEXT_AUTODETECTED_VERSION=
            Target.the("text which notifies us that the version was autodetected").located(By.xpath(
                    "//div[@class='ui-select-box']//span[contains(@ng-show,'autoDetectDevice.webDevice.osVersionId')]"));
    public static final Target TEXT_AUTODETECTED_LAN =
            Target.the("text which notifies us that the language was autodetected").located(By.xpath(
                    "//div[@class='ui-select-box']//span[contains(@ng-show,'autoDetectDevice.webDevice.osLanguageId')]"));
    public static final Target BUTTON_NEXT = Target.the("button that allows us move on the next step (4)")
            .located(By.xpath("//div[@class='pull-right next-step']//a/span[contains(text(), 'Next: Last Step')]"));
}
