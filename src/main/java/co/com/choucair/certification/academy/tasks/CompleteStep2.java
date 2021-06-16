package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.UtestStep2;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompleteStep2 implements Task {

    public static CompleteStep2 withDefaultLocation() {
        return Tasks.instrumented(CompleteStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UtestStep2.TEXT_AUTODETECTED_CITY, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(UtestStep2.TEXT_AUTODETECTED_ZIP, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(UtestStep2.TEXT_AUTODETECTED_COUNTRY, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(UtestStep2.BUTTON_NEXT));
    }
}
