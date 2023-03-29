package FigurasGeometricas;

public class triangulo {
   
    private float area ;
    private float altura;
    public triangulo(float area, float altura){
        this.area=area;
        this.altura=altura;
    }
    
  
    public float getArea() {
        return area;
    }


    public void setArea(float area) {
        this.area = area;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public void calcularArea(){
        float area=0;
        area=altura*altura;
        System.out.println("la altura del triangulo es"+altura+"y su area es "+area);
    }

}
