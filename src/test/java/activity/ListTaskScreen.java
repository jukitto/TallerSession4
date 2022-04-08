package activity;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class ListTaskScreen {
    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label notaNombre = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));


    public Label buscarElementoLista(String parametro){
        System.out.println("Se esta buscando en la lista la nota:" + parametro);
        Label buscarTituloNota = new Label(By.xpath("//android.widget.TextView[@text='"+parametro+"']"));
        return buscarTituloNota;
    }
}
