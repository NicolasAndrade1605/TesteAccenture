package elementos;

import org.openqa.selenium.By;

public class ElementosInsurantData {

	
	// ELEMENTOS ENCAPSULADOS//
	
	private By cpFirstName = By.name("First Name");

	private By cpLastName = By.name("Last Name");

	private By btDate = By.name("Open Date of Birth Calender");
	
	private By DataNascimento = By.id("birthdate");

	private By btGender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");

	private By cpStreetAddress = By.name("Street Address");

	private By cpCountry = By.xpath("//*[@id=\"country\"]/option[32]");

	private By cpZpCode = By.name("Zip Code");

	private By cpCity = By.name("City");

	private By cpOcupt = By.xpath("//*[@id=\"occupation\"]/option[2]");

	private By btHobby = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span");

	private By cpWebSite = By.name("Website");

	private By btOpenPicture = By.xpath("//*[@id=\"open\"]");

	private By BtNext = By.name("Next (Enter Product Data)");

	
	// METODOS DE ACESSO //
	
	public By getCpFirstName() {
		return cpFirstName;
	}

	public By getCpLastName() {
		return cpLastName;
	}

	
	public By getDataNascimento() {
		return DataNascimento;
	}

	public By getBtDate() {
		return btDate;
	}

	public By getBtGender() {
		return btGender;
	}

	public By getCpStreetAddress() {
		return cpStreetAddress;
	}

	public By getCpCountry() {
		return cpCountry;
	}

	public By getCpZpCode() {
		return cpZpCode;
	}

	public By getCpCity() {
		return cpCity;
	}

	public By getCpOcupt() {
		return cpOcupt;
	}

	public By getBtHobby() {
		return btHobby;
	}

	public By getCpWebSite() {
		return cpWebSite;
	}

	public By getBtOpenPicture() {
		return btOpenPicture;
	}

	public By getBtNext() {
		return BtNext;
	}
	
	

	

}
