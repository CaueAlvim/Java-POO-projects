import javax.swing.JOptionPane;

public class Tridimensional extends Forma {

    protected float altura;
    protected float volume;

    protected Tridimensional(float volume, float altura){
        this.volume = volume;
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da forma:"));
    }

    protected void calcularVolume(){
        volume = altura * comprimento * largura;
        System.out.println("O volume dessa figura é de: " + volume);
    }
}