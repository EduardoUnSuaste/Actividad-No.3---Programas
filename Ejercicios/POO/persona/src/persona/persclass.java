
package persona;

/**
 *
 * @author Edward Emanuel
 */
public class persclass {
    //atributos
    String nombre,apellido;
    int edad;
    double estatura;
    
    //constructor de la clase persona que recibe por parametro el nombre apellido y edad
    public persclass(String nombre, String apellido, int edad, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
  //metodo que devuelve los datos de la persona
    public String datos(){
        return this.nombre+"\n"+this.apellido;
    }
    public int edad(){
        return this.edad;
    }  
    
    public double estatura(){
        return this.estatura;
    }       
     
}
