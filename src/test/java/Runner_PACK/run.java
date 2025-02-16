package Runner_PACK;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  // Tells JUnit to use Cucumber
@CucumberOptions(
    features = "C:\\Users\\somes\\eclipse-workspace\\BDD_HRM\\Feature",  // Path to feature files
    glue = "TestDefination_PACK",  // Package where step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // Report generation
    monochrome = true  // Clean console output
)
public class run {

}
