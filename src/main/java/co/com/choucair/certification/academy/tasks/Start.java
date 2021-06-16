package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Start implements Task {

    public static Start theRegisterProcess() {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UtestHomePage.BUTTON_JOIN_TODAY));
    }
}
