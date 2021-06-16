package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.UtestStep1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CompleteStep1 implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonthOfBirth;
    private String strDayOfBirth;
    private String strYearOfBirth;

    public CompleteStep1(String strFirstName, String strLastName, String strEmail, String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonthOfBirth = strMonthOfBirth;
        this.strDayOfBirth = strDayOfBirth;
        this.strYearOfBirth = strYearOfBirth;
    }

    public static CompleteStep1 withSelfInformation(String strFirstName, String strLastName, String strEmail,
                                                    String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth) {
    return Tasks.instrumented(CompleteStep1.class,
            strFirstName, strLastName, strEmail, strMonthOfBirth, strDayOfBirth, strYearOfBirth);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(UtestStep1.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestStep1.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestStep1.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonthOfBirth).from(UtestStep1.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDayOfBirth).from(UtestStep1.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYearOfBirth).from(UtestStep1.SELECT_YEAR),
                Click.on(UtestStep1.BUTTON_NEXT)
        );
    }
}
