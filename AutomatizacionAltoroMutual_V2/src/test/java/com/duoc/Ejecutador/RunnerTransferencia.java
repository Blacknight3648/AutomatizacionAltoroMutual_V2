package com.duoc.Ejecutador;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TransferirFondos.feature",

        glue = {"com.duoc.Steps"},
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports/report.html",
                "junit:target/cucumber-results.xml"
        },
        monochrome = true
)

public class RunnerTransferencia {
}
