package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTeste {
    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com/";
    private final String CAMINHO_DRIVE = "C:\\Users\\guilh\\Documents\\automacao-java\\automatizado\\src\\test\\java\\automatizado\\resource\\chromedriver.exe";

    private void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @Test
    public void devePesquisarNoGoogle() {
        iniciar();

       WebElement inputPesquisa = driver.findElement(By.name("q"));

    }
}
