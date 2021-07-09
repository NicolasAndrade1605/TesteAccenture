package Tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.ElementosInsurantData;
import elementos.ElementosPriceOption;
import elementos.ElementosProductData;
import elementos.ElementosSendQuote;
import elementos.ElementosVehicleData;
import pages.Metodos;

public class steps {
	
	
	Metodos Met = new Metodos();
	ElementosInsurantData Insurant = new ElementosInsurantData();
	ElementosPriceOption Price = new ElementosPriceOption();
	ElementosProductData Product = new ElementosProductData();
	ElementosSendQuote Send = new ElementosSendQuote();
	ElementosVehicleData Vehicle = new ElementosVehicleData();
	
	@Given("^que eu esteja no \"([^\"]*)\"$")
	public void que_eu_esteja_no(String site) throws Throwable {
	  Met.abrirSite(site, "CHROME");
	 
	}

	@When("^responder os campos$")
	public void responder_os_campos() throws Throwable {
		  Met.clicar(Vehicle.getBtMake());
		  Met.clicar(Vehicle.getBtModel());
		  Met.prencher(Vehicle.getCpCcm(), "20");
		  Met.prencher(Vehicle.getCpKw(), "1254");
		  Met.clicar(Vehicle.getBtDate());
		  Met.pausa(1000);
		  Met.clicar(Vehicle.getDataselecionada());
		  Met.clicar(Vehicle.getNumSeats1());	  
		  Met.clicar(Vehicle.getMaoVolante());
		  Met.clicar(Vehicle.getNumSeats2());
		  Met.clicar(Vehicle.getBtFuel());
		  Met.prencher(Vehicle.getBtPayload(), "249");
		  Met.prencher(Vehicle.getBtTlWeight(), "264");
		  Met.prencher(Vehicle.getCpListPrice(), "21465");
		  Met.prencher(Vehicle.getCpplateNumber(), "GF4566");
		  Met.prencher(Vehicle.getCpannualMile(), "12000");
		  Met.clicar(Vehicle.getBtNext());
		  Met.prencher(Insurant.getCpFirstName(), "Nicolas");
		  Met.prencher(Insurant.getCpLastName(), "Andrade");
		  Met.clicar(Insurant.getBtDate());
		  Met.pausa(1000);
		  Met.prencher(Insurant.getDataNascimento(), "05/16/2002");
		  Met.pausa(1000);
		  Met.clicar(Insurant.getBtGender());
		  Met.pausa(1000);
		  Met.prencher(Insurant.getCpStreetAddress(), "Rua santo antonio do cantaro n 23");
		  Met.clicar(Insurant.getCpCountry());
		  Met.prencher(Insurant.getCpZpCode(), "04829090");
		  Met.prencher(Insurant.getCpCity(), "Sao paulo");
		  Met.clicar(Insurant.getCpOcupt());
		  Met.clicar(Insurant.getBtHobby());  
		  Met.clicar(Insurant.getBtNext());
		  Met.clicar(Product.getBtCalendar());
		  Met.pausa(1000);
		  Met.prencher(Product.getCpCalendar(),"08/20/2021");
		  Met.clicar(Product.getCpInsurance4());
		  Met.clicar(Product.getCpMetRating());
		  Met.clicar(Product.getCpDamageInsurace3());
		  Met.clicar(Product.getBtOptProducts());
		  Met.clicar(Product.getCpCortCarY());
		  Met.clicar(Product.getBtNext());
		  Met.clicar(Price.getBtPriceOptionGold());
		  Met.pausa(2000);
		  Met.clicar(Price.getBtNext());
		  Met.prencher(Send.getCpEmail(), "nicolas2015fj@gmail.com");
		  Met.prencher(Send.getCpPhone(), "11971273363");
		  Met.prencher(Send.getCpUserName(), "NicolasAndrade1605");
		  Met.prencher(Send.getCpPassword(), "Fc3456");
		  Met.prencher(Send.getCpConfPassword(), "Fc3456");
		 
		  
	}

	@Then("^valido as informacoes tirar print para confirmação de envio de email$")
	public void valido_as_informacoes_tirar_print_para_confirmação_de_envio_de_email() throws Throwable {
		 Met.clicar(Send.getBtSend());
		  Met.pausa(4000);
		  Met.pausa(10000);
		  Met.screnShoot("Ct-Confirmação de cadastro e envio de email");
		  Met.fechar();
	}



}
