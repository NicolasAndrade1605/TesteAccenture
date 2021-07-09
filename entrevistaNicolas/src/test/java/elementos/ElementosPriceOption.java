package elementos;

import org.openqa.selenium.By;

public class ElementosPriceOption {

	
	// ELEMENTOS ENCAPSULADOS//
	
	private By btPriceoptionSilver = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span");
			
	private By btPriceOptionGold = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");		
	
	private By btPriceOptionPlatinum = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
			
	private By btPriceoptionUltimate = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	
	private By btNext = By.name("Next (Send Quote)");
	
	// METODOS DE ACESSO //
	
	public By getBtPriceoptionSilver() {
		return btPriceoptionSilver;
	}

	public By getBtPriceOptionGold() {
		return btPriceOptionGold;
	}

	public By getBtPriceOptionPlatinum() {
		return btPriceOptionPlatinum;
	}

	public By getBtPriceoptionUltimate() {
		return btPriceoptionUltimate;
	}

	public By getBtNext() {
		return btNext;
	}
			

}
