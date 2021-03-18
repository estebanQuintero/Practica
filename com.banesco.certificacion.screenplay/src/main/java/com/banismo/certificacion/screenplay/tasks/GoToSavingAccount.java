package com.banismo.certificacion.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static com.banismo.certificacion.screenplay.user_interfaces.DepositPage.*;
import static com.banismo.certificacion.screenplay.user_interfaces.HomeCompanyPage.*;
import static com.banismo.certificacion.screenplay.util.GeneralConstant.NAME_OF_DOCUMENT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToSavingAccount implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTS_SERVICES),
                Click.on(DEPOSITS),
                Scroll.to(SAVINGS_ACCOUNT),
                Click.on(SAVINGS_ACCOUNT),
                Scroll.to(DOCUMENTS),
                Click.on(DOCUMENTS)
        );
        actor.remember(NAME_OF_DOCUMENT, NAME_DOCUMENT.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(OPEN_PDF)
        );
    }

    public static GoToSavingAccount toSeeDocument(){
        return instrumented(GoToSavingAccount.class);
    }
}
