
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;
public class EntidadBancaria {
    
    public boolean Tienefondos(cliente x, StringBuilder datosCliente){
        datosCliente.append("La cuenta tiene fondos\n");
        return true;
    }
}
