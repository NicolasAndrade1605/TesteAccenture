package elementos;

import org.openqa.selenium.By;

public class ElementosProductData {
	
	// ELEMENTOS ENCAPSULADOS//
	
	private By btCalendar = By.name("Open Start Date Calender");
	
	private By cpCalendar = By.id("startdate");
			
	private By cpInsurance1 = By.xpath("//*[@id=\"insurancesum\"]/option[2]");

	private By cpInsurance2 = By.xpath("//*[@id=\"insurancesum\"]/option[3]");
	
	private By cpInsurance3 = By.xpath("//*[@id=\"insurancesum\"]/option[4]");
	
    private By cpInsurance4 = By.xpath("//*[@id=\"insurancesum\"]/option[5]");
	
    private By cpInsurance5 = By.xpath("//*[@id=\"insurancesum\"]/option[6]");
	
    private By cpInsurance6 = By.xpath("//*[@id=\"insurancesum\"]/option[7]");
    
    private By cpInsurance7 = By.xpath("//*[@id=\"insurancesum\"]/option[8]");
    
    private By cpInsurance8 = By.xpath("//*[@id=\"insurancesum\"]/option[9]");
    
    private By cpInsurance9 = By.xpath("//*[@id=\"insurancesum\"]/option[10]");
    
    private By cpMetRating = By.xpath("//*[@id=\"meritrating\"]/option[4]");
    		
    private By cpDamageInsurace1 = By.xpath("//*[@id=\"damageinsurance\"]/option[2]");
    
    private By cpDamageInsurace2 = By.xpath("//*[@id=\"damageinsurance\"]/option[3]");
    
    private By cpDamageInsurace3 = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");
    		
    private By btOptProducts = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span");
    		
    private By cpCortCarY = By.xpath("//*[@id=\"courtesycar\"]/option[3]");
    
    private By cpCortCarN = By.xpath("//*[@id=\"courtesycar\"]/option[2]");
    		
    private By btNext = By.name("Next (Select Price Option)");
    
     // METODOS DE ACESSO // 
    
	public By getCpCalendar() {
		return cpCalendar;
	}

	public By getBtCalendar() {
		return btCalendar;
	}

	public By getCpInsurance1() {
		return cpInsurance1;
	}

	public By getCpInsurance2() {
		return cpInsurance2;
	}

	public By getCpInsurance3() {
		return cpInsurance3;
	}

	public By getCpInsurance4() {
		return cpInsurance4;
	}

	public By getCpInsurance5() {
		return cpInsurance5;
	}

	public By getCpInsurance6() {
		return cpInsurance6;
	}

	public By getCpInsurance7() {
		return cpInsurance7;
	}

	public By getCpInsurance8() {
		return cpInsurance8;
	}

	public By getCpInsurance9() {
		return cpInsurance9;
	}

	public By getCpMetRating() {
		return cpMetRating;
	}

	public By getCpDamageInsurace1() {
		return cpDamageInsurace1;
	}

	public By getCpDamageInsurace2() {
		return cpDamageInsurace2;
	}

	public By getCpDamageInsurace3() {
		return cpDamageInsurace3;
	}

	public By getBtOptProducts() {
		return btOptProducts;
	}

	public By getCpCortCarY() {
		return cpCortCarY;
	}

	public By getCpCortCarN() {
		return cpCortCarN;
	}

	public By getBtNext() {
		return btNext;
	}
    
    
    		
}
