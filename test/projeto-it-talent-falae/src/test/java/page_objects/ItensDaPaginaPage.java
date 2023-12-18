package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class ItensDaPaginaPage extends BasePage {
    private final By adicionarItem = By.xpath("//button[@class='items-list-item add-button']");
    private final By nomeItem = By.id("item_name");
    private final By procurarItem = By.cssSelector("#search-items > div.actions > button");
    private final By adicionarAPagina = By.xpath("//input[@value='Adicionar a página']");
    private final By msgErroItem = By.xpath("//p[@class='no-items-found']");



    public void clicarAdicionar(){
        waitElementVisible(adicionarItem, 2);
        clicar(adicionarItem);
    }

    public void escreverNomeItem(String nome){
        waitElementVisible(nomeItem,2);
        escreve(nomeItem, nome);
    }

    public void clicarProcurarItem(){
        waitElementVisible(procurarItem,2);
        clicar(procurarItem);
    }

    public void clicarAdicionarAPagina(){
        waitElementVisible(adicionarAPagina,4);
        clicar(adicionarAPagina);
    }


    public String retornarMsgDeItem(){
        waitElementVisible(msgErroItem,2);
        return obterValorPorTexto(msgErroItem);
    }

}
