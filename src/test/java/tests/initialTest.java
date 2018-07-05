package tests;

//import org.junit.Assert; ou o cimport abaixo, para evitar ter que usar Assert.assertEquals por exemplo

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class initialTest {

    @Test
    public void testPesquisar () {

        // Abrir navegador
        // Lembrar de alterar o local do driver
        System.setProperty("webdriver.chrome.driver", "/home/angelo/Testes/drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();

        // Navegar até...
        navegador.get("http://google.com.br");

        // Escrever na pesquisa
        navegador.findElement(By.id("lst-ib")).sendKeys("Angelo");

        // Clicar em pesquisar
        WebElement botaoPesquisar = navegador.findElement(By.name("btnK"));
        botaoPesquisar.click();

        assertEquals(1,1);
    }

}
