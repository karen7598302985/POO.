package FigurasGeometricas;

import java.util.Scanner;

public class principal {
    public static void main(String[]args){ 
    float area,altura,base;
    Scanner captura=new Scanner(System.in);
   


   System.out.println("Ingrese el area del triangulo:");
   area=captura.nextFloat();
   
   System.out.println("Ingrese la altura del triangulo:");
   altura=captura.nextFloat();

   triangulo r3=new triangulo (area, altura);
   r3.calcularArea();


   System.out.println("Ingrese el area del rectangulo:");
   area=captura.nextFloat();
   
   System.out.println("Ingrese la altura del rectangulo:");
   altura=captura.nextFloat();

   System.out.println("Ingrese la base del rectangulo:");
   base=captura.nextFloat();

   rectangulo c3=new rectangulo( area, altura, base);
   c3.calcularArea();


   System.out.println("Ingrese el area del circulo:");
   area=captura.nextFloat();


Circulo f1=new Circulo(area);
f1.calcularArea();



   captura.close();

}

    
}
