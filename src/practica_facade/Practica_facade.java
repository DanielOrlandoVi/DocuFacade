
package practica_facade;

/**
 *
 * @author jorge malaver
 */

import Facade.*;
import Cliente.*;
import javax.swing.JOptionPane;
public class Practica_facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // n es necesario crear todos los objetos de Modulos
        
        StringBuilder datosCliente = new StringBuilder();
        // Opciones de roles disponibles
        String opciones[] = {"Consultar", "Salir"};
        while (true) {

            // Solicita al usuario que seleccione un rol
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Seleccion de opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            // Si el usuario cierra el cuadro de diálogo o selecciona "Salir", se termina el programa
            if (opcion == null || opcion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }
                               
            // Dependiendo del rol seleccionado, se realizan diferentes acciones
            switch (opcion) {
                case "Consultar":
                    String nomCliente = JOptionPane.showInputDialog("Introduzca el nombre del cliente: ");
                    datosCliente.append("Informacion del cliente: " + nomCliente + "\n");
                    new FacadePrestamo().sinreporte(new cliente(nomCliente), datosCliente);
                    JOptionPane.showMessageDialog(null, datosCliente.toString());
                    break;
              
                case "Salir":
                    // Termina el programa
                    System.exit(0);
                    break;

                default:
                    // Si se selecciona una opción no válida, se muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Tipo de opcion no valida.");
                    return;
            }
        }
    }
    
}
