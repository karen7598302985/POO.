package Salud;

public class Empleado extends Persona {
      
            private String cargo;
            private double vahora;
            private double horastrabajadas;
            private String departamento;
            

           public Empleado(String tipoDoc, int documento, String nombres, String apellidos,
           String cargo, double vahora, double horastrabajadas, String departamento) {
            super(tipoDoc, documento, nombres, apellidos);

            this.cargo = cargo;
            this.vahora = vahora;
            this.horastrabajadas = horastrabajadas;
            this.departamento = departamento;
           }
           
 
                public String getCargo() {
            return cargo;
        }


        public void setCargo(String cargo) {
            this.cargo = cargo;
        }


        public double getVahora() {
            return vahora;
        }


        public void setVahora(double vahora) {
            this.vahora = vahora;
        }


        public double getHorastrabajadas() {
            return horastrabajadas;
        }


        public void setHorastrabajadas(double horastrabajadas) {
            this.horastrabajadas = horastrabajadas;
        }


        public String getDepartamento() {
            return departamento;
        }


        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }



                public void mostrarEmpleado() {
                    System.out.println("su tipo de documento es: " + getTipoDoc());
                    System.out.println("su numero de documento es: " + getDocumento());
                    System.out.println("su nombre es: " + getNombre());
                    System.out.println("su apellido es: " + getApellido());
                    System.out.println("su cargo es: " + getCargo());
                    System.out.println("sus horas trabajadas son: " + getHorastrabajadas());
                    System.out.println("sus ganacias por horas son: " + getHorastrabajadas());
                    System.out.println("su departamento es:"+ getDepartamento());
                    System.out.println("total a pagar: " + calcularHonorarios());
                }
            
                public double calcularHonorarios() {
                    double honorarios = vahora * horastrabajadas;
                    double reteica = honorarios * 0.00966;
                    return honorarios - reteica;
                }
            }
            



 
