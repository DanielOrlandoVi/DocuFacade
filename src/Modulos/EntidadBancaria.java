
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;
// Clase que representa una entidad bancaria
public class EntidadBancaria {
    
    // Método para verificar si la cuenta del cliente tiene fondos
    public boolean Tienefondos(cliente x, StringBuilder datosCliente){
        // Simplemente indicar que la cuenta tiene fondos (para fines de ejemplo)
        datosCliente.append("La cuenta tiene fondos\n");
        
        // Devolver true para indicar que la cuenta tiene fondos
        return true;
    }
}
