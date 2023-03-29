package Salud;

import java.util.Scanner;

public class ejecucion2 {
    public static void main(String[]args){ 

        String cargo;
        String departamento;
        double vahora;
        double horastrabajadas;
        String nombre;
        String apellido;
        String tipoDoc;
        int documento;

     Scanner leer=new Scanner(System.in);

     System.out.print("ingrese su nombre: ");
     nombre = leer.nextLine();

     System.out.print("ingrese su apellido: ");
     apellido = leer.nextLine();

     System.out.print("ingrese su tipo de documento: ");
     tipoDoc = leer.nextLine();

     System.out.print("ingrese su numero de documento: ");
     documento = leer.nextInt();

     System.out.print("Ingrese su cargo:");
     cargo=leer.next();

     System.out.print("ingrese su departamento:");
     departamento=leer.next();
     
     
     System.out.print("ingrese lo que gana por hora:");
     vahora=leer.nextDouble();
    

     System.out.print("ingrese sus horas de trabajo:");
     horastrabajadas=leer.nextDouble();
     
     
Empleado m=new Empleado(tipoDoc, documento, nombre, apellido, cargo, vahora, horastrabajadas, departamento);
        
        m.calcularHonorarios();
        m.mostrarEmpleado();

     leer.close();
     
    
}
}