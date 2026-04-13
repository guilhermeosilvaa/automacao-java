package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class checkBox {

    private WebDriver driver;
    private final String URL_BASE = "https://demoqa.com/";
    private final String CAMINHO_DRIVE = "C:\\Users\\guilherme.doliveira\\Documents\\automacao-java\\src\\test\\java\\automatizado\\resource\\chromedriver.exe";

    private void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);

    }

    @Test
    public void deveSelecionarCheckBox() {
        iniciar();

        WebElement inputClick = driver.findElement(By.cssSelector(".card-body"));
        inputClick.click();

        driver.findElement(By.cssSelector(".element-list")).click();

        driver.findElement(By.cssSelector("#item-1 > a")).click();

        driver.findElement(By.cssSelector(".rc-tree-switcher")).click();

        driver.findElement(By.cssSelector("div:nth-child(2) > span.rc-tree-switcher.rc-tree-switcher_close")).click();

        driver.findElement(By.cssSelector("div:nth-child(5) > span.rc-tree-switcher.rc-tree-switcher_close")).click();

        driver.findElement(By.cssSelector("div:nth-child(6) > span.rc-tree-switcher.rc-tree-switcher_close")).click();

        driver.findElement(By.cssSelector("div:nth-child(4) > span.rc-tree-switcher.rc-tree-switcher_close")).click();

        driver.findElement(By.cssSelector("div:nth-child(10) > span.rc-tree-switcher.rc-tree-switcher_close")).click();

        driver.findElement(By.cssSelector("div:nth-child(15) > span.rc-tree-switcher.rc-tree-switcher_close")).click();



    }
}