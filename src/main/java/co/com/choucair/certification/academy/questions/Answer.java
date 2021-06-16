package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterface.UtestStep4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question ) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String strWelcome  = Text.of(UtestStep4.TEXT_WELCOME).viewedBy(actor).asString();
        if(question.equals(strWelcome)){
            return true;
        }
        return false;
    }
}
