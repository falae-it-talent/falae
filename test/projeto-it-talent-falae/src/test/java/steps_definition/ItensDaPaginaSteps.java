package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page_objects.ItensDaPaginaPage;

public class ItensDaPaginaSteps extends BaseSteps {

   private ItensDaPaginaPage page = new ItensDaPaginaPage();

    @Quando("o usuario clicar  na imagem com um {string}")
    public void o_usuario_clicar_na_imagem_com_um(String string) {
        page.clicarAdicionar();
    }
    @Quando("o usuario preencher o campo nome do adicionar item")
    public void o_usuario_preencher_o_campo_nome_do_adicionar_item() {
     page.escreverNomeItem("teste");
     screenshot();
    }
    @Quando("o usuario clicar no botao do {string} em adicionar item")
    public void o_usuario_clicar_no_botao_do_em_adicionar_item(String string) {
       page.clicarProcurarItem();
    }
    @Quando("o usuario clicar no botao {string} do adicionar item")
    public void o_usuario_clicar_no_botao_do_adicionar_item(String string) {
        screenshot();
        page.clicarAdicionarAPagina();
    }

    @Entao("o sistema adiciona o item na pagina")
    public void o_sistema_adiciona_o_item_na_pagina() {
        screenshot();
    }
    @Quando("o usuario preencher o campo nome com a inicial do adicionar item")
    public void o_usuario_preencher_o_campo_nome_com_a_inicial_do_adicionar_item() {
        page.escreverNomeItem("opa");
    }

    @Quando("o usuario não preencher o campo nome do adicionar item")
    public void o_usuario_não_preencher_o_campo_nome_do_adicionar_item() {
        page.escreverNomeItem(" ");
    }
    @Entao("o sistema exibe a mensagem: {string}")
    public void o_sistema_exibe_a_mensagem(String msg) {
        System.out.println(page.retornarMsgDeItem());
        Assert.assertEquals(msg, page.retornarMsgDeItem());
        screenshot();
    }
}
