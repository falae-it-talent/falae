package steps_definition;

import base.BaseSteps;
import io.cucumber.java.pt.Quando;
import page_objects.CriarPaginaPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CriarPaginaSteps extends BaseSteps {
    private String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());

    private CriarPaginaPage page = new CriarPaginaPage();

    @Quando("o usuario preencher o  campo nome da pagina")
    public void o_usuario_preencher_o_campo_nome_da_pagina() {
       page.escreverPagina("teste"+aleatorio);
    }

    @Quando("o usuario preencher o campo colunas")
    public void o_usuario_preencher_o_campo_colunas() {
       page.escreverColunaPagina("2");
    }

    @Quando("o usuario preencher o campo linhas")
    public void o_usuario_preencher_o_campo_linhas() {
       page.escreverLinhaPagina("2");
    }
}
