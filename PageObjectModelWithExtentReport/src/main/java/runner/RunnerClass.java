package runner;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Login.feature",glue={"pages"},monochrome=true,publish=true, tags="@Smoke or @Sanity")
public class RunnerClass extends BaseClass {

}

