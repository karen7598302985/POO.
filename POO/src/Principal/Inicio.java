package Principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args){
       /*// Persona p = new Persona();
        p.pedirDatos();
        p.mostrarPersona();
        String imc = p.calcularImc();
        if (imc.compareTo("peso bajo")==0) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (imc.compareTo("peso ideal")==0) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }*/
        Persona p = new Persona();
        p.pedirDatos();
        p.calcularImc();
        String imc = p.calcularImc();
        if (imc.compareTo("peso bajo")==0) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (imc.compareTo("peso ideal")==0) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
      
        
}
}