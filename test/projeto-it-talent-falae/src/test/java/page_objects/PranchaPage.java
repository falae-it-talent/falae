package page_objects;

import base.BasePage;
import org.openqa.selenium.By;

public class PranchaPage extends BasePage {

    private final By segundaPrancha = By.cssSelector("div.list > ul > li:nth-child(2) > a");



    public void selecionarPrancha(){
        clicar(segundaPrancha);
    }

    public void confirmarApagar(){
        clicarAlerta();
    }

    public void selecionarApagarPrancha(String texto){
        waitElementVisible(By.linkText(texto),2);
        clicar(By.linkText(texto));
    }
}
