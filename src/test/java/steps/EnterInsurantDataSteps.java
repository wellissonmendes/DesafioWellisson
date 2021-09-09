package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import utils.DefaultTestConfigs;

import java.awt.*;

public class EnterInsurantDataSteps extends DefaultTestConfigs {


    @Dado("preencher o campo First Name {string}")
    public void preencher_o_campo_First_Name(String firstname) throws InterruptedException {
        esperar(500);
        realizarScroll(0, -200);
        escrever(By.id("firstname"), firstname);
    }

    @Dado("preencher o campo Last Name {string}")
    public void preencher_o_campo_Last_Name(String lastName) {
        escrever(By.id("lastname"), lastName);
    }

    @Dado("preencher o campo Date of Birth {string}")
    public void preencher_o_campo_Date_of_Birth(String birthdate) {
        escrever(By.id("birthdate"), birthdate);
    }

    @Dado("preencher o campo Gender {string}")
    public void preencher_o_campo_Gender(String gender) {
        String male = "Male";
        String female = "Female";

        if (gender.contains(male)) {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
        } else if (gender.contains(female)) {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")).click();
        }
    }

    @Dado("preencher o campo Street Address {string}")
    public void preencher_o_campo_Street_Address(String streetaddress) {
        escrever(By.id("streetaddress"), streetaddress);
    }

    @Dado("preencher o campo Country {string}")
    public void preencher_o_campo_Country(String country) {
        selecionarSelect(By.id("country"), country);
    }

    @Dado("preencher o campo Zip Code {string}")
    public void preencher_o_campo_Zip_Code(String zipcode) {
        escrever(By.id("zipcode"), zipcode);
    }

    @Dado("preencher o campo City {string}")
    public void preencher_o_campo_City(String city) {
        escrever(By.id("city"), city);
    }

    @Dado("preencher o campo Occupation {string}")
    public void preencher_o_campo_Occupation(String occupation) {
        selecionarSelect(By.id("occupation"), occupation);
    }

    @Dado("preencher o campo Hobbies {string}")
    public void preencher_o_campo_Hobbies(String hobbies) {
        if (hobbies.equals("Speeding")) {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
        } else if (hobbies.equals("Bungee Jumping")) {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();
        } else if (hobbies.equals("Cliff Diving")) {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")).click();
        } else if (hobbies.equals("Skydiving")) {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")).click();
        } else if (hobbies.equals("Other")) {
            driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")).click();
        }
    }

    @Dado("preencher o campo Website {string}")
    public void preencher_o_campo_Website(String website) {
        escrever(By.id("website"), website);
    }

    @Dado("preencher o campo Picture {string}")
    public void preencher_o_campo_Picture(String caminhoArquivo) throws AWTException {
        clicar(By.id("open"));
        adicionarAnexo(caminhoArquivo);
    }

    @Quando("acionar botão nextProductData")
    public void acionar_botão_nextProductData() {
        clicar(By.id("nextenterproductdata"));
    }

}
