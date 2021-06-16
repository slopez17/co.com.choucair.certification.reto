package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestHomePage {
    public static final Target BUTTON_JOIN_TODAY = Target.the("button that shows us the register form")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']" +
                    "//a[contains(text(),'Join Today')]"));
}
