package com.banismo.certificacion.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue= "com.banismo.certificacion.screenplay.steps_definitions",
        features = "src/test/resources/features/view_document_contract.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class ViewDocumentContractRunner {
}
