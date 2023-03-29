package Interfaz;

import java.util.Scanner;

public class ppt implements juego {

   private String nombre;
   private int opciones;
   private int m;

    Scanner leer=new Scanner(System.in);
    
    public void iniciar(){
        System.out.println("Ingrese su nombre:");
        nombre = leer.nextLine();
    }

    public void jugar(){
        System.out.println("escoja \n 0 si es roca\n 1 si es papel \n 3 si es tijera");
        opciones=leer.nextInt();
       m = (int) (Math.random() * 3) + 1;
     

  }
  
  public void finalizar() {
    if (m == 1 && opciones == 1) {
        System.out.println("empate");
    } else if (m == 1 && opciones == 3) {

        System.out.println("gano");
    } else if (m == 1 && opciones == 0) {

        System.out.println("perdio");
    } else if (m == 2 && opciones == 0) {

        System.out.println("empate");
    } else if (m == 2 && opciones == 1) {

        System.out.println("gano");
    } else if (m == 2 && opciones == 3) {

        System.out.println("perdio");
    } else if (m == 3 && opciones == 3) {

        System.out.println("empate");
    } else if (m == 3 && opciones == 1) {

        System.out.println("gano");
    } else if (m == 3 && opciones == 0) {

        System.out.println("perdio");
    }
}

  
}
  
    
    


