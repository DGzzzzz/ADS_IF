package org.dg.pages;

import org.dg.core.DSL;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SignupFormPage {
    private DSL dsl;

    public SignupFormPage(WebDriver driver) {
        dsl = new DSL(driver);
    }

    public void setBotaoSignup() {
        dsl.clicarBotao("bsignup");
    }

    public boolean getBotaoSignup() {
        return dsl.isBotaoClicado("bsignup");
    }

    public void setEmail(String email) {
        dsl.escrever("email", email);
    }

    public String getEmail() {
        return dsl.obterValorCampo("email");
    }

    public void setSenha(String senha) {
        dsl.escrever("psw", senha);
    }

    public String getSenha() {
        return dsl.obterValorCampo("psw");
    }

    public void setSenhaConfirmacao(String senhaConfirmacao) {
        dsl.escrever("psw-repeat", senhaConfirmacao);
    }

    public String getSenhaConfirmacao() {
        return dsl.obterValorCampo("psw-repeat");
    }

    public void setRadio() {
        dsl.clicarRadio("age2");
    }

    public boolean getRadio() {
        return dsl.isRadioMarcado("age2");
    }

    public void setCombo(String valor) {
        dsl.selecionarCombo("country", valor);
    }

    public String getCombo() {
        return dsl.obterValorCombo("country");
    }

    public void setComboMultipla(String valor1, String valor2) {
        dsl.selecionarCombo("spreferences", valor1);
        dsl.selecionarCombo("spreferences", valor2);
    }

    public List<String> getComboMultipla() {
        return dsl.obterValoresCombo("spreferences");
    }

    public void setLink(String id) {
        dsl.clicarLink("Terms and Privacy");
    }

    public String getLinkMarcado() {
        dsl.isLinkClicked("sterms", "Link Terms and Privacy clicado!");
        return "";
    }
}
