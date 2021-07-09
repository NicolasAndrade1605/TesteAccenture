package elementos;

import org.openqa.selenium.By;

public class ElementosVehicleData {


	// ELEMENTOS ENCAPSULADOS//
	
	private By btMake = By.xpath("//*[@id=\"make\"]/option[3]");

	private By btModel = By.xpath("//*[@id=\"model\"]/option[5]");

	private By cpCcm = By.name("Cylinder Capacity");

	private By cpKw = By.name("[kW]");

	private By btDate = By.xpath("//*[@id=\"opendateofmanufacturecalender\"]/i");

	private By Dataselecionada = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a");

	private By numSeats1 = By.cssSelector("#numberofseats > option:nth-child(3)");
	
	private By numSeats2 = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[3]");

	private By maoVolante = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span");

	private By btNumSeats = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[3]");

	private By btFuel = By.xpath("//*[@id=\"fuel\"]/option[2]");

	private By btPayload = By.name("Payload");

	private By btTlWeight = By.name("Total Weight");

	private By cpListPrice = By.name("List Price");

	private By cpplateNumber = By.name("License Plate Number");

	private By cpannualMile = By.name("Annual Mileage");

	private By btNext = By.name("Next (Enter Insurant Data)");

	// METODOS DE ACESSO //

	public By getNumSeats1() {
		return numSeats1;
	}

	public By getNumSeats2() {
		return numSeats2;
	}


	public By getBtMake() {
		return btMake;
	}

	public By getBtModel() {
		return btModel;
	}

	public By getCpCcm() {
		return cpCcm;
	}

	public By getCpKw() {
		return cpKw;
	}

	

	public By getBtDate() {
		return btDate;
	}

	public By getDataselecionada() {
		return Dataselecionada;
	}

	public By getNumSeats() {
		return numSeats2;
	}

	public By getMaoVolante() {
		return maoVolante;
	}

	public By getBtNumSeats() {
		return btNumSeats;
	}

	public By getBtFuel() {
		return btFuel;
	}

	public By getBtPayload() {
		return btPayload;
	}

	public By getBtTlWeight() {
		return btTlWeight;
	}

	public By getCpListPrice() {
		return cpListPrice;
	}

	public By getCpplateNumber() {
		return cpplateNumber;
	}

	public By getCpannualMile() {
		return cpannualMile;
	}

	public By getBtNext() {
		return btNext;
	}
	
	

}
