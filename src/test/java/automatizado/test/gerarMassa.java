package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class gerarMassa {
    private WebDriver driver;
    private final String URL_BASE = "http://brtlvlty0591fu/geradores/B2C/VivoNext/Controle";
    private final String CAMINHO_DRIVE = "C:\\Users\\guilherme.doliveira\\Documents\\automacao-java\\src\\test\\java\\automatizado\\resource\\chromedriver.exe";

    private void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));

    }
    @Test
    public void devePreencherCamposLoginEsenha() {
        iniciar();

      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div[2]/form/div/div[1]/div/input")).sendKeys("80703351");
      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div[2]/form/div/div[2]/div/span/input")).sendKeys("F2uN7vBrL=Ql7Rjcaoi");
      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div[2]/form/div/button")).click();








    }
}