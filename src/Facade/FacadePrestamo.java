
package Facade;
import Modulos.*;
/**
 *
 * @author jorge malaver
 */

import Cliente.*;
public class FacadePrestamo {
 
    public boolean sinreporte(cliente x, StringBuilder datosCliente){
        boolean resultado = new EntidadBancaria().Tienefondos(x, datosCliente) && new Estudiocredito().historialcredito(x, datosCliente) && new Solicitudprestamo().poseeprestamo(x, datosCliente);
        if(resultado){
            datosCliente.append("Se le otorgo el prestamo\n");
        } else {
            datosCliente.append("No Se le otorgo el prestamo\n");
        }
        return resultado;
    }
}
