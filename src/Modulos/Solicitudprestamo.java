
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;
public class Solicitudprestamo {
    
    public boolean poseeprestamo(cliente x, StringBuilder datosCliente){
        datosCliente.append("El cliente ya posee prestamos\n");
        return false;
    }
}
