package cucumberJava;
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(
		features = "C:/Eclicpse Selenium WorkSpace/BDDFrameWork/src/test/java/cucumberJava/cucumberJava.feature"
		,glue = {"newstepDefination"}
		//format = {"pretty", "html:target/cucumber"},
        //dryRun = true
        		)
public class runTest {

}
