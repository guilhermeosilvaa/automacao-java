package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class textBox {
    private WebDriver driver;
    private final String URL_BASE = "https://demoqa.com/";
    private final String CAMINHO_DRIVE = "C:\\Users\\guilh\\Documents\\automacao-java\\automatizado\\src\\test\\java\\automatizado\\resource\\chromedriver.exe";

    private void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));

    }

    @Test
    public void devePreencherCampos() {
        iniciar();

        WebElement inputClick = driver.findElement(By.cssSelector(".card-body"));
        inputClick.click();

        driver.findElement(By.cssSelector(".element-list")).click();

        driver.findElement(By.cssSelector(".router-link")).click();

        driver.findElement(By.id("userName")).sendKeys("Guilherme Oliveira");

        driver.findElement(By.id("userEmail")).sendKeys("Guilhermeoliveira@gmail.com");

        driver.findElement(By.id("currentAddress")).sendKeys("Texto aqui");

        driver.findElement(By.id("permanentAddress")).sendKeys("Rua teste 123");

        driver.findElement(By.id("submit")).click();




    }
}
