

package Cliente;

/**
 *
 * @author jorge malaver
 */
// Clase que representa a un cliente en el sistema
public class cliente {
    private String nom; // Nombre del cliente
    
    // Constructor de la clase Cliente
    public cliente(String nombre){
        this.nom = nombre; // Inicializar el nombre del cliente con el valor proporcionado
    }
    
    // Método para obtener el nombre del cliente
    public String getNom(){
        return nom; // Devuelve el nombre del cliente
    }
    
    // Método para establecer el nombre del cliente
    public void setNom(String nombre){
        this.nom = nombre; // Establece el nombre del cliente con el valor proporcionado
    }
}
