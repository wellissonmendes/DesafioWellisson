package utils;

import io.cucumber.java.AfterStep;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class DefaultTestConfigs {

    public static WebDriver driver;
    public static String diretorio = System.getProperty("user.dir");

    @Before
    public void inicializaDriver() {
        System.setProperty("webdriver.chrome.driver", diretorio+"\\src\\test\\java\\utils\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        this.driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    @After
    public static void tearDown() {
        System.out.println("Teste AFTER");
    }




    public void realizarScroll(int xhorizontal, int xvertical) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(" + xhorizontal + "," + xvertical + ")");
    }

    public void escrever(By by, String texto){
        driver.findElement(by).sendKeys(texto);
    }

    public void clicar(By by){
        driver.findElement(by).click();
    }

    public void esperar(int tempo) throws InterruptedException {
        Thread.sleep(tempo);
    }

    public void selecionarSelect(By by, String valorSelecionar){
        WebElement selectElement = driver.findElement(by);
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue(valorSelecionar);
    }

    public void adicionarAnexo(String caminhoArquivo) throws AWTException {

        StringSelection ss = new StringSelection(caminhoArquivo);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


        public static void print(WebDriver driver, String arquivo){
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File(arquivo));
            }catch (Exception e){
                System.out.println("Houve um problema ao copiar os arquivos" + e.getMessage());


        }

    }


}
