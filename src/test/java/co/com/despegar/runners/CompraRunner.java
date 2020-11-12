package co.com.despegar.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co/com/despegar/features/Compra.feature", 
glue = "co.com.despegar.stepdefinitions", 
snippets = SnippetType.CAMELCASE)
public class CompraRunner {

}