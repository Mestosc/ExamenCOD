import javax.swing.*;

/**
 * Interface grafica del proyecto
 */
public class Interface {
    /**
     *  Cuadro de dialogo utilizando JOptionPane
     */
    public void dialog() {
        JOptionPane.showMessageDialog(null, "Hola Examen!");
        JOptionPane.showMessageDialog(null, "Boton con forma de media luna 4");
 }
    /**
     * Dialogo con mensaje de error
     */
    public void error() {
        JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
    }
}