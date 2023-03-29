package Salud;

import java.util.Scanner;

public class Persona {
    Scanner leer=new Scanner(System.in);

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private float peso;
    private double estatura;
    private String sexo;
    private int edad;

   public Persona() {
    }

    
    public Persona(String tipoDoc, int documento, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

   

    public String getTipoDoc() {
        return tipoDoc;
    }


    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    public int getDocumento() {
        return documento;
    }


    public void setDocumento(int documento) {
        this.documento = documento;
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


    public float getPeso() {
        return peso;
    }


    public void setPeso(float peso) {
        this.peso = peso;
    }


    public double getEstatura() {
        return estatura;
    }


    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


   


   

  /*// public void mostrarPersona(){
    System.out.println("Su tipo de documento es:"+  tipoDoc);
    System.out.println("Su numero de documento es:"+ documento);
    System.out.println("su nombre es:"+ nombre);
    System.out.println("su apellido es:"+ apellido);
    System.out.println("su peso es:"+ peso);
    System.out.println("su estatura es:"+estatura);
    System.out.println("su edad es:"+edad);
    System.out.println("su sexo es:"+sexo);
}*/
/*//public String calcularImc(){
   Double imc;
   imc=((peso)/(estatura*estatura));
    if (imc < 20) {
        return "peso bajo";
    } else if (imc <= 25) {
        return "peso ideal";
    } else {
        return "sobrepeso";
    }
}*/
/*//public String calcularImc(){
   Double imc;
   imc=((peso)/(estatura*estatura));
    if (imc < 20) {
        return "peso bajo";
    } else if (imc>20 && imc<25) {
        return "peso ideal";
    } else {
        return "sobrepeso";
    }
}*/


/*//public boolean mayorEdad(){
    return edad >=18;

} 
}*/
}










    

