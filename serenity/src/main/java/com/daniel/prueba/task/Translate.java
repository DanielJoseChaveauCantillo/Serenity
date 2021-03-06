package com.daniel.prueba.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.daniel.prueba.userinterface.HomePage.TEXTAREA_TRANSLATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Translate implements Task {

    private String txt;

    public Translate(String txt) {
        this.txt = txt;
    }

    public static Performable translateWorld(String txt) {
        return instrumented(Translate.class, txt);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(txt).into(TEXTAREA_TRANSLATE)
        );
    }
}
