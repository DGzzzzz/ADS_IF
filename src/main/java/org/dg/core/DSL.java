package org.dg.core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DSL {
    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarBotao(String id) {
        driver.findElement(By.id(id)).click();
    }

    public boolean isBotaoClicado(String id) {
        return driver.findElement(By.id(id)).isSelected();
    }

    public void escrever(String idCampo, String texto) {
        driver.findElement(By.id(idCampo)).sendKeys(texto);
    }

    public String obterValorCampo(String idCampo) {
        return driver.findElement(By.id(idCampo)).getAttribute("value");
    }

    public void clicarRadio(String id) {
        driver.findElement(By.id(id)).click();
    }

    public boolean isRadioMarcado(String id){
        return driver.findElement(By.id(id)).isSelected();
    }

    public void clicarCheck(String id) {
        driver.findElement(By.id(id)).click();
    }

    public boolean isCheckMarcado(String id){
        return driver.findElement(By.id(id)).isSelected();
    }

    public void selecionarCombo(String id, String valor) {
        WebElement combo = driver.findElement(By.id(id));
        Select select = new Select(combo);
        select.selectByVisibleText(valor);
    }

    public String obterValorCombo(String id) {
        WebElement combo = driver.findElement(By.id(id));
        Select select = new Select(combo);
        return select.getFirstSelectedOption().getText();
    }

    public List<String> obterValoresCombo(String id) {
        WebElement combo = driver.findElement(By.id(id));
        Select select = new Select(combo);
        List<WebElement> soptions = select.getAllSelectedOptions();
        Assert.assertEquals(2, soptions.size());
        return List.of();
    }

    public void clicarLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }

    public void isLinkClicked(String id, String conteudo) {
        Assert.assertTrue(driver.findElement(By.className(id)).getText().contains(conteudo));
    }
}
