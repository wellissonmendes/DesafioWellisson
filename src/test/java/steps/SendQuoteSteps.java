package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.DefaultTestConfigs;

public class SendQuoteSteps extends DefaultTestConfigs {


    @Dado("preencher o campo e-mail {string}")
    public void preencher_o_campo_e_mail(String email) {
        escrever(By.id("email"), email);
    }

    @Dado("preencher o campo phone {string}")
    public void preencher_o_campo_phone(String telefone) {
        escrever(By.id("phone"), telefone);
    }

    @Dado("preencher o campo username {string}")
    public void preencher_o_campo_username(String username) {
        escrever(By.id("username"), username);
    }

    @Dado("preencher o campo password {string}")
    public void preencher_o_campo_password(String password) {
        escrever(By.id("password"), password);
    }

    @Dado("preencher o campo confirm password {string}")
    public void preencher_o_campo_confirm_password(String confirmpassword) {
        escrever(By.id("confirmpassword"), confirmpassword);
    }

    @Dado("preencher o campo comentários {string}")
    public void preencher_o_campo_comentários(String comentarios) {
        escrever(By.id("Comments"), comentarios);
    }

    @Quando("aciono o botão sendemail")
    public void aciono_o_botão_sendemail() {
        clicar(By.id("sendemail"));
    }

    @Entao("será a apresentado a mensagem {string}")
    public void será_a_apresentado_a_mensagem(String mensagem) {
        String mensagemSucesso = driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
        System.out.println(mensagemSucesso);
        Assert.assertEquals(mensagem, mensagemSucesso);
        print(driver, diretorio+"\\src\\test\\resources\\print.jpg");
        clicar(By.className("confirm"));
    }

}
