package pages;

import org.openqa.selenium.WebDriver;
public class SofiaPage extends BasePage {
    public SofiaPage() {
        super(driver);
    }
    public void navegarASofia() {
        navegarASofia("https://oferta.senasofiaplus.edu.co/sofia-oferta/");
    }
    public static void cerrarNavegador() {
        driver.quit();
    }
}
