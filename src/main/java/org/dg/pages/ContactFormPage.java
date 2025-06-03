package org.dg.pages;

import org.dg.core.DSL;
import org.openqa.selenium.WebDriver;

public class ContactFormPage {
    private DSL dsl;

    public ContactFormPage(WebDriver driver) {
        dsl = new DSL(driver);
    }

    public void setNome(String nome) {
        dsl.escrever("fname", nome);
    }

    public String getNome() {
        return dsl.obterValorCampo("fname");
    }

    public void setSobrenome(String sobrenome) {
        dsl.escrever("lname", sobrenome);
    }

    public String getSobrenome() {
        return dsl.obterValorCampo("lname");
    }

    public void setEmail(String email) {
        dsl.escrever("email", email);
    }

    public String getEmail() {
        return dsl.obterValorCampo("email");
    }

    public void setCountry(String country) {
        dsl.selecionarCombo("country", country);
    }

    public String getCountry() {
        return dsl.obterValorCombo("country");
    }

    public void setMensagem(String mensagem) {
        dsl.escrever("subject", mensagem);
    }

    public String getMensagem() {
        return dsl.obterValorCampo("subject");
    }

    public void setCheck() {
        dsl.clicarCheck("scopy");
    }

    public boolean getCheck() {
        return dsl.isCheckMarcado("scopy");
    }

    /*
    public void setClickButton() {
        dsl.clicarBotao("signin");
    }

    public boolean getClickButton() {
        return dsl.isBotaoClicado("scopy");
    }*/
}
