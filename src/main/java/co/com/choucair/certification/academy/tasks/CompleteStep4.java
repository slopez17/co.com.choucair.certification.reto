package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.UtestStep1;
import co.com.choucair.certification.academy.userinterface.UtestStep3;
import co.com.choucair.certification.academy.userinterface.UtestStep4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompleteStep4 implements Task {
    private String strPassword;

    public CompleteStep4(String strPassword) {
        this.strPassword = strPassword;
    }

    public static CompleteStep4 withTermsAcceptance(String strPassword) {
        return Tasks.instrumented(CompleteStep4.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UtestStep4.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestStep4.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestStep4.CHECKBOX_TERMS_OF_USE),
                Click.on(UtestStep4.CHECKBOX_PRIVACY_POLICY),
                Click.on(UtestStep4.BUTTON_COMPLETE)
        );

    }
}
