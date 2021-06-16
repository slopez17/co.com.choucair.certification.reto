package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStep1 {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select the month of birth")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do we select the day of birth")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select the year of birth")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("button that allows us move on the next step (2)")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']" +
                    "//a/span[contains(text(), 'Next: Location')]"));
}
