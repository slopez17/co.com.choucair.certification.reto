package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStep4 {
    public static final Target INPUT_PASSWORD =
            Target.the("where do we write the password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD =
            Target.the("where do we write the password for confirmation")
                    .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS_OF_USE=
            Target.the("where do we accept utest terms of use and utest code of conduct")
                    .located(By.id("termOfUse"));
    public static final Target CHECKBOX_PRIVACY_POLICY=
            Target.the("where do we accept utest privacy and security policy")
                    .located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("button that allows us complete sign up")
            .located(By.xpath("//div[@class='pull-right next-step']//a/span[contains(text(), 'Complete Setup')]"));
    public static final Target TEXT_WELCOME= Target.the("first text after succesfull sign up")
            .located(By.xpath("//p[@class='welcome-lead']//b[contains(text(), 'First, please check your email inbox')]"));
}
