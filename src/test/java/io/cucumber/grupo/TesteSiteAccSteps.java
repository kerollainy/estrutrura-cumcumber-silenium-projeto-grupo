package io.cucumber.grupo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.grupo.configuracao.*;
import io.cucumber.grupo.CompartilhadoSteps;



public class TesteSiteAccSteps {
	public WebDriver browser;  
	
	@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {
	  CompartilhadoSteps.abrirSiteAccenture();
	}

	@Dado("aceito os termos LGPD")
	public void aceito_os_termos_LGPD() {
		WebElement button = browser.findElement( By.cssSelector("#onetrust-pc-btn-handler"));
		button.click();
	}

	@Entao("deve fechar a caixa de informacao")
	public void deve_fechar_a_caixa_de_informacao() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Dado("clico em configuracaes de cookie")
	public void clico_em_configuracaes_de_cookie() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entao("devo ver os itens")
	public void devo_ver_os_itens(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}
}
