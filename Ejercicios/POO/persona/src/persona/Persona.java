
package persona ;
import java.util.*;

/**@author Edward Emanuel*/

public class Persona {

    public static void main(String[] args){
         Scanner tec = new Scanner(System.in);
        
        String nom,Ape;
        int edad;
        double estatura;
        try{
        //se declaran las variables que vamos a utilizar
        System.out.println("Escribe tu nombre: ");
        nom= tec.next();
        System.out.println();
        System.out.println("Escribe tu Apellido: ");
        Ape = tec.next();
        System.out.println();
        System.out.println("Cual es tu Edad: ");
        edad = tec.nextInt();
        System.out.println();
        System.out.println("Cual es tu Estatuta: ");
        estatura = tec.nextDouble();
        //se debe de crear una instancia de la clase persona
        
        persclass p=new persclass(nom,Ape,edad,estatura);
        //se muestran los datos de la persona en un mensaje.-
        System.out.println("Nombre Completo: "+ p.datos()+"\n" + "Edad: "+p.edad()+"\n"+" años"+p.estatura()+" Estatura");
        }catch(Exception e){
             System.out.println("Something went wrong.");
        }
        }
}
