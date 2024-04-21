
package Facade;
import Modulos.*;
/**
 *
 * @author jorge malaver
 */

import Cliente.*;
// Clase que actúa como fachada para el proceso de préstamos
public class FacadePrestamo {
 
    // Método para verificar si un cliente puede obtener un préstamo
    public boolean sinreporte(cliente x, StringBuilder datosCliente){
        // Comprobar si el cliente cumple con los requisitos financieros, de historial de crédito y de préstamo
        boolean resultado = new EntidadBancaria().Tienefondos(x, datosCliente) 
                            && new Estudiocredito().historialcredito(x, datosCliente) 
                            && new Solicitudprestamo().poseeprestamo(x, datosCliente);
        
        // Agregar información sobre el resultado del préstamo al StringBuilder datosCliente
        if(resultado){
            datosCliente.append("Se le otorgo el prestamo\n");
        } else {
            datosCliente.append("No Se le otorgo el prestamo\n");
        }
        
        // Devolver el resultado de la evaluación de préstamo
        return resultado;
    }
}
