package com.teralco.training.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        //features = "src/test/resources/features/",

//        features = "src/test/resources/features/form_text.feature",
//        features = "src/test/resources/features/register.feature",
//        features = "src/test/resources/features/check_box.feature",
//        features = "src/test/resources/features/alerts.feature",
//        features = "src/test/resources/features/modals.feature",
//        features = "src/test/resources/features/alertsEnum.feature",
          features = "src/test/resources/features/login.feature",


        glue = "com.teralco.training.glue"
)
public class TestRunner {
}
