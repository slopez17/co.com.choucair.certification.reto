package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.UtestStep3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompleteStep3 implements Task {

    public static CompleteStep3 withDefaultDevices() {
        return Tasks.instrumented(CompleteStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UtestStep3.TEXT_AUTODETECTED_PC, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(UtestStep3.TEXT_AUTODETECTED_VERSION,  isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(UtestStep3.TEXT_AUTODETECTED_LAN, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(UtestStep3.BUTTON_NEXT));
    }
}
