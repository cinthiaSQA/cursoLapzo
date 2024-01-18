package com.blaze.www.Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\inicioSesion.feature",
        glue = "com.blaze.www.StepDefinitions",
        // tags = "@LoginIncorrecto",(esto sirve para decir que solo queiro que me ejecute esta parte de la automatizacion)

        snippets = SnippetType.CAMELCASE
)
public class InicioSesion {
}
