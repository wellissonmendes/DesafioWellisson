package steps;

import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import utils.DefaultTestConfigs;

public class SelectPriceOptionSteps extends DefaultTestConfigs {

    @Quando("seleciono a modalidade do preço {string}")
    public void seleciono_a_modalidade_do_preço(String modalidade) {
        String silver = "Silver";
        String gold = "Gold";
        String platinum = "Platinum";
        String ultimate = "Ultimate";

        if (modalidade.contains(silver)) {
            clicar(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span"));

        } else if (modalidade.contains(gold)) {
            clicar(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span"));

        } else if (modalidade.contains(platinum)) {
            clicar(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span"));

        } else if (modalidade.contains(ultimate)) {
            clicar(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span"));
        }
    }

    @Quando("seleciono o botão nextsendquote")
    public void seleciono_o_botão_nextsendquote() {
        clicar(By.id("nextsendquote"));
    }
}
