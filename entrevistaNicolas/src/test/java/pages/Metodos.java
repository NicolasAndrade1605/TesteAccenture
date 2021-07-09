package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	

	WebDriver driver;

	/**
	 * escolher o navegador e escolher site
	 * 
	 * @author Nicolas Andrade 
	 * @param abrir navegador
	 * @throws IOException
	 */

	public void abrirSite(String site, String navegador) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {
			switch (navegador) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();

				break;

			}
		} else {
			System.out.println("nao suporta outro navegador");
		}

	}

	/**
	 * preencher
	 * 
	 * @author Nicolas Andrade
	 * @param preecher elemento
	 * @throws IOException
	 * 
	 */
	public void prencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	/**
	 * fechar browser
	 * @author Nicolas Andrade
	 * @param fechar
	 * @throws IOException
	 */

	public void fechar() {
		driver.quit();

	}

	/**
	 * clicar
	 * 
	 * @author Nicolas Andrade
	 * @param clicar no elemento
	 * @throws IOException
	 */

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	/**
	 * Pausa 
	 * @author Nicolas Andrade
	 * @param Pausa,Tempo
	 * @param descricaoPasso
	 */
	public void pausa(int tempo) throws Exception {
		Thread.sleep(tempo);

	}
	/**
	 * tirar foto
	 * @author  Nicolas Andrade
	 * @param screenshot
	 */
public void screnShoot(String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}


	
}

	


