package com.daniel.prueba.stepsdefinitions;

import com.daniel.prueba.task.Translate;
import com.daniel.prueba.userinterface.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actions.Hit.the;

public class GoogleTranslateStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor actor = Actor.named("Daniel");
    private HomePage homePage = new HomePage();

    @Given("^that Daniel wants to translate words$")
    public void thatDanielWantsToTranslateWords() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^he translate the words (.*) from English to Spanish$")
    public void heTranslateTheWordsTeacherFromEnglishToSpanish(String txt) {
        actor.wasAbleTo(
                Translate.translateWorld(txt)
        );
    }

    @Then("^he should see the word Profesor in the screen$")
    public void heShouldSeeTheWordProfesorInTheScreen() {
    }
}
