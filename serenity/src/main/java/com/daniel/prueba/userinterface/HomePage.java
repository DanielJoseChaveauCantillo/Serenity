package com.daniel.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://translate.google.com/?hl=es")
public class HomePage extends PageObject {
    public static final Target TEXTAREA_TRANSLATE = Target.the("Input donde se traduce").located(By.className("er8xn"));
}
