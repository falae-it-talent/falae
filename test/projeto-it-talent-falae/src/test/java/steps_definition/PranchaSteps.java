package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import page_objects.PranchaPage;

public class PranchaSteps extends BaseSteps {

    private PranchaPage page = new PranchaPage();

    @Quando("o usuario clicar na prancha")
    public void o_usuario_clicar_na_prancha() {
       page.selecionarPrancha();
    }
    @Quando("o ususario confirmar a exclusao")
    public void o_ususario_confirmar_a_exclusao() {
     page.confirmarApagar();
     screenshot();
    }

    @Quando("o usuario clicar no botao {string} da prancha")
    public void o_usuario_clicar_no_botao_da_prancha(String botao) {
        page.selecionarApagarPrancha(botao);
    }


    @Quando("o ususario clicar no botao  {string}")
    public void oUsusarioClicarNoBotao(String string) {
      page.clicarbotaoExporta();
    }
    @Entao("o sistema envia um arquivo para pagina de download do computador do usuario")
    public void oSistemaEnviaUmArquivoParaPaginaDeDownloadDoComputadorDoUsuario() {
        System.out.println(page.retornarPranchaBaixada());
    }
}


