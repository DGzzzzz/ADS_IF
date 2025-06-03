package org.dg.tests;

import org.dg.core.DSL;
import org.dg.pages.SignupFormPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteInteracaoFormSignup {

    private WebDriver driver;
    private SignupFormPage page;

    @Before
    public void inicializar() {
        String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\webdriver\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);

        driver = new FirefoxDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "\\src\\main\\resources\\html\\signup_form.html");

        page = new SignupFormPage(driver);

        page.setBotaoSignup();
        page.getBotaoSignup();
    }

    @After
    public void finalizar() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.out.println("Erro ao fechar o driver: " + e.getMessage());
            }
        }
    }

    @Test
    public void deveInteragirFieldEmail() {
        page.setEmail("douglas.teste@gmail.com");
        Assert.assertEquals("douglas.teste@gmail.com", page.getEmail());
    }

    @Test
    public void deveInteragirFieldSenha() {
        page.setSenha("123456");
        Assert.assertEquals("123456", page.getSenha());

        page.setSenhaConfirmacao(page.getSenha());
        Assert.assertEquals(page.getSenha(), page.getSenhaConfirmacao());
    }

    @Test
    public void deveInteragirComRadioButton() {
        page.setRadio();
        page.getRadio();
    }

    @Test
    public void deveInteragirComCombo() {
        page.setCombo("Brazil");
        page.getCombo();
    }

    @Test
    public void deveInteragirComComboSelecaoMultipla() {
        page.setComboMultipla("Soccer", "Football");
        page.getComboMultipla();
    }

    @Test
    public void deveInteragirComLink() {
        page.setLink("Terms and Privacy");
        page.getLinkMarcado();
    }
}
