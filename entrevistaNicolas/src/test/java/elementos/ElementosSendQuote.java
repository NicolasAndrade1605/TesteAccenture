package elementos;

import org.openqa.selenium.By;

public class ElementosSendQuote {
	
	// ELEMENTOS ENCAPSULADOS//
	
	private By cpEmail = By.id("email");
			
	private By cpPhone = By.name("Phone");
			
	private By cpUserName = By.name("Username");
			
	private By cpPassword = By.name("Password");
			
	private By cpConfPassword = By.name("Confirm Password");
			
	private By btSend = By.name("Send E-Mail");
	
	// METODOS DE ACESSO //
	public By getCpEmail() {
		return cpEmail;
	}

	public By getCpPhone() {
		return cpPhone;
	}

	public By getCpUserName() {
		return cpUserName;
	}

	public By getCpPassword() {
		return cpPassword;
	}

	public By getCpConfPassword() {
		return cpConfPassword;
	}

	public By getBtSend() {
		return btSend;
	}
	
	
			
}
