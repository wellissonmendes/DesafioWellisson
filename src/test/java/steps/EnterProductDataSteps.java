package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import utils.DefaultTestConfigs;

public class EnterProductDataSteps extends DefaultTestConfigs {


    @Dado("preencher o campo Start Date {string}")
    public void preencher_o_campo_Start_Date(String data) throws InterruptedException {
        esperar(500);
        escrever(By.id("startdate"), data);
    }

    @Dado("preencher o campo Insurance Sum {string}")
    public void preencher_o_campo_Insurance_Sum(String insuranceSum) {
        selecionarSelect(By.id("insurancesum"), insuranceSum);
    }

    @Dado("preencher o campo Merit Rating {string}")
    public void preencher_o_campo_Merit_Rating(String meritRating) {
        selecionarSelect(By.id("meritrating"), meritRating);
    }

    @Dado("preencher o campo Damage Insurance {string}")
    public void preencher_o_campo_Damage_Insurance(String damageInsurance) {
        selecionarSelect(By.id("damageinsurance"), damageInsurance);
    }

    @Dado("preencher o campo Optional Products {string}")
    public void preencher_o_campo_Optional_Products(String products) {
        String euro = "Euro Protection";
        String legal = "Legal Defense Insurance";

        if (products.contains(euro)) {
            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"));
        } else if (products.contains(legal)) {
            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span"));
        }
    }

    @Dado("preencher o campo Courtesy Car {string}")
    public void preencher_o_campo_Courtesy_Car(String courtesyCar) {
        selecionarSelect(By.id("courtesycar"), courtesyCar);
    }

    @Quando("acionar botão nextselectpriceoption")
    public void acionar_botão_nextselectpriceoption() {
        clicar(By.id("nextselectpriceoption"));
    }
}
