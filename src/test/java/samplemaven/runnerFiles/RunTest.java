package samplemaven.runnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\java\\samplemaven\\featureFiles\\Login.feature"},
glue={"stepDefinitions"},
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE)
public class RunTest {

}
