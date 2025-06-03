package org.dg.tests;

import org.dg.pages.ContactFormPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteInteracaoFormContato {

    private WebDriver driver;
    private ContactFormPage contato;

    @Before
    public void inicializar() {
        String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\webdriver\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);

        driver = new FirefoxDriver();
        driver.get("file:///" + System.getProperty("user.dir") + "\\src\\main\\resources\\html\\contact_form.html");

        contato = new ContactFormPage(driver);
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
    public void deveInteragirComTextFieldNome() {
        contato.setNome("Douglas");
        Assert.assertEquals("Douglas", contato.getNome());
    }

    @Test
    public void deveInteragirComTextFieldSobrenome() {
        contato.setSobrenome("Winter");
        Assert.assertEquals("Winter", contato.getSobrenome());
    }

    @Test
    public void deveInteragirComTextArea() {
        contato.setMensagem("Mensagem de contato\ncontinua na linha 2...");
        Assert.assertEquals("Mensagem de contato\ncontinua na linha 2...", contato.getMensagem());
    }

    @Test
    public void deveInteragirComCheckbox() {
        contato.setCheck();
        Assert.assertTrue(contato.getCheck());
    }

    @Test
    public void deveInteragirComFieldEmail() {
        contato.setEmail("douglas.winter@gmail.com");
        Assert.assertEquals("douglas.winter@gmail.com", contato.getEmail());
    }

    @Test
    public void deveInteragirComSelecaoRegiao() {
        contato.setCountry("USA");
        Assert.assertEquals("USA", contato.getCountry());
    }

    /*
    @Test
    public void deveInteragirComBotao() {
        contato.setClickButton();
        Assert.assertTrue(contato.getClickButton());
    }*/
}
