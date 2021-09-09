package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.DefaultTestConfigs;

public class EnterVehicleDataSteps extends DefaultTestConfigs {


    @Dado("Acessei site sampleApp")
    public void acessei_site_sampleApp() {
        inicializaDriver();
    }


    @Dado("preencher o campo Make informando {string}")
    public void preencher_o_campo_Make_informando(String make) {
        selecionarSelect(By.id("make"), make);
    }

    @Dado("preencher o campo Model informando {string}")
    public void preencher_o_campo_Model_informando(String model) {
        selecionarSelect(By.id("model"), model);
    }

    @Dado("preencher o campo Cylinder Capacity informando {string}")
    public void preencher_o_campo_Cylinder_Capacity_informando(String capacity) {
        escrever(By.id("cylindercapacity"), capacity);
    }

    @Dado("preencher o campo Engine Performance informando {string}")
    public void preencher_o_campo_Engine_Performance_informando(String enginePerformance) {
        escrever(By.id("engineperformance"), enginePerformance);
    }

    @Dado("preencher o campo Date of Manufacture informando {string}")
    public void preencher_o_campo_Date_of_Manufacture_informando(String date) {
        escrever(By.id("dateofmanufacture"), date);
    }

    @Dado("preencher o campo Number of Seats informando {string}")
    public void preencher_o_campo_Number_of_Seats_informando(String seats) {
        selecionarSelect(By.id("numberofseats"), seats);
    }

    @Dado("preencher o campo Right Hand Drive informando {string}")
    public void preencher_o_campo_Right_Hand_Drive_informando(String handDrive) {
        String yes = "Yes";
        String no = "No";

        if (handDrive.contains(yes)) {
            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));

        } else if (handDrive.contains(no)) {

            clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span"));
        }

    }

    @Dado("preencher o campo Number of Seats Motor Cycle informando {string}")
    public void preencher_o_campo_Number_of_Seats_Motor_Cycle_informando(String number) {
        selecionarSelect(By.id("numberofseatsmotorcycle"), number);
    }

    @Dado("preencher o campo Fuel Type informando {string}")
    public void preencher_o_campo_Fuel_Type_informando(String fuel) {
        selecionarSelect(By.id("fuel"), fuel);
    }

    @Dado("preencher o campo Payload informando {string}")
    public void preencher_o_campo_Payload_informando(String payload) {
        escrever(By.id("payload"), payload);
    }

    @Dado("preencher o campo Total Weight informando {string}")
    public void preencher_o_campo_Total_Weight_informando(String total) {
        escrever(By.id("totalweight"), total);
    }

    @Dado("preencher o campo List Price informando {string}")
    public void preencher_o_campo_List_Price_informando(String price) {
        escrever(By.id("listprice"), price);
    }

    @Dado("preencher o campo License Plate Number informando {string}")
    public void preencher_o_campo_License_Plate_Number_informando(String number) {
        escrever(By.id("licenseplatenumber"), number);
    }

    @Dado("preencher o campo Annual Mileage informando {string}")
    public void preencher_o_campo_Annual_Mileage_informando(String mileage) {
        escrever(By.id("annualmileage"), mileage);
    }


    @Quando("acionar botão next")
    public void acionar_botão_next() {
        clicar(By.id("nextenterinsurantdata"));
    }

    @Entao("serei redirecionado para aba {string}")
    public void serei_redirecionado_para_aba(String aba) {
        String nomeAba = driver.getTitle();
        System.out.println(nomeAba);
        Assert.assertEquals(aba, nomeAba);
    }
}
