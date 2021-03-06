package com.daniel.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/google_traslate.feature",
        glue = "com.daniel.prueba.stepsdefinitions",
        tags = "@Prueba",
        snippets = SnippetType.CAMELCASE
)
public class GoogleTranslateRunner {
}
