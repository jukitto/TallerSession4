package runner;

import activity.ListTaskScreen;
import activity.NewTaskScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;
import java.util.Map;


public class MyStepWhenDo {
    ListTaskScreen listTaskScreen = new ListTaskScreen();
    NewTaskScreen newTaskScreen = new NewTaskScreen();

    @Given("mi aplicacion WhenDo esta abierto")
    public void miAplicacionWhenDoEstaAbierto() {
    }

    @When("yo registro una nueva Nota")
    public void yoRegistroUnaNuevaNota(Map<String,String> values) throws MalformedURLException {
        listTaskScreen.addButton.click();
        newTaskScreen.tituloTxt.type(values.get("titulo"));
        newTaskScreen.notaTxt.type(values.get("Dnota"));
        newTaskScreen.guardarBtn.click();
    }

    @Then("la nota {string} deberia ser creado")
    public void laNotaDeberiaSerCreado(String expectedResult) throws MalformedURLException {
        Assertions.assertEquals(expectedResult,listTaskScreen.notaNombre.getValue(),
                "ERROR la tarea no fue creada");
    }

    @When("selecciono Nota con titulo: {string}")
    public void seleccionoNotaConTitulo(String titulo) throws MalformedURLException {
        listTaskScreen.buscarElementoLista(titulo).click();
        newTaskScreen.borrarBtn.click();
        newTaskScreen.eliminarBtn.click();

    }

    @Then("valido que ya no se visualice la nota: {string}")
    public void validoQueYaNoSeVisualiceLaNota(String titulo) {
        Assertions.assertFalse(listTaskScreen.buscarElementoLista(titulo).getExistence());

    }
}
