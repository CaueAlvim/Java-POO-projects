public class Bidimensional extends Forma{

    protected float area;

    protected Bidimensional(float area){
        this.area = area;
    }

    protected void calcularArea(){
        area = comprimento * largura;
        System.out.println("A área dessa figura é: " + area + "\n");
    }
}