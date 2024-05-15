package steps;

import io.cucumber.java.en.Given;
import pages.SofiaPage;

public class SofiaSteps {
    SofiaPage sofiaPage = new SofiaPage();
    @Given("Ingreso a la pagina de Sofia")
    public void navegarASofiaPlus(){
        sofiaPage.navegarASofia();
    }


}
