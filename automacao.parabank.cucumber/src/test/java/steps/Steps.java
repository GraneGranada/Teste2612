package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataVehiclePage;
import pages.EnterVehicleData;
import pages.ProductData;
import pages.SelectPrice;
import pages.SendQuote;

public class Steps {
	
	DataVehiclePage page1 = new DataVehiclePage();
	EnterVehicleData page2 = new EnterVehicleData();
	ProductData page3 = new ProductData();
	SelectPrice page4 = new SelectPrice();
	SendQuote page5 = new SendQuote();
	
	@Given("que entre no site da empresa tricentis para cotacao")
	public void que_entre_no_site_da_empresa_tricentis_para_cotacao() {
	    
	}

	@Given("clico na opcao desejada")
	public void clico_na_opcao_desejada() {
	   
	}

	@When("preencho os dados do veiculo")
	public void preencho_os_dados_do_veiculo() {
	    page1.dataVehicle("1","1", "09/19/2022", "1", "300", "1500","1","100");
	}

	@When("preencho os dados do seguro")
	public void preencho_os_dados_do_seguro() {
	   page2.enterVehicleData("Marco", "Gran", "05/18/1992","Rua Teste" , "0000", "OzCity", "www.marco.com.br");
	}

	@When("preencho os dados do produto")
	public void preencho_os_dados_do_produto() {
	   page3.productData("12/15/2022");
		
	}

	@When("preencho os dados do preco")
	public void preencho_os_dados_do_preco() {
		page4.selectPrice();
	    
	}

	@When("envio cotacao")
	public void envio_cotacao() {
	   page5.sendQuote("marco@teste.com", "25252525", "marcoG", "Teste1", "Teste1", "Gostei dos valores e coberturas");
	}

	@Then("cotacao enviada com sucesso")
	public void cotacao_enviada_com_sucesso() {
	}

}
