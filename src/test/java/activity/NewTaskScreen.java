package activity;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewTaskScreen {
    public TextBox tituloTxt = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox notaTxt = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button guardarBtn = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button borrarBtn = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button eliminarBtn = new Button(By.id("android:id/button1"));
}
