package com.duoc.Commons_hook;
import io.cucumber.java.en.Given;
import static com.duoc.Commons_hook.CommonsDriverSteps.driver;


public class NavegadorSteps {

    @Given("que puedo acceder a la url {string}")
    public void que_puedo_acceder_a_la_url(String url) {
        // IMPORTANTE: usar http para evitar la advertencia SSL
        if (url.startsWith("https://demo.testfire.net")) {
            url = url.replace("https://", "http://");
        }
        driver.get(url);
        driver.manage().window().maximize();
    }

}
