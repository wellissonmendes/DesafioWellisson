package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        tags = {"@SendQuote"},
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome = true
)
public class Runner {

    }



