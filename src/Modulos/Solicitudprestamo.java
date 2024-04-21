
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;
// Clase que maneja la solicitud de préstamos de un cliente
public class Solicitudprestamo {
    
    // Método para verificar si el cliente ya posee préstamos
    public boolean poseeprestamo(cliente x, StringBuilder datosCliente){
        // Simplemente indicar que el cliente ya posee préstamos (para fines de ejemplo)
        datosCliente.append("El cliente ya posee préstamos\n");
        
        // Devolver false para indicar que el cliente ya posee préstamos
        return false;
    }
}
