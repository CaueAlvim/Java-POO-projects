import javax.swing.JOptionPane;

public class Main {

public static void main(String[] args){
    int resposta = JOptionPane.showConfirmDialog(null,"Figura é bidimensional?", "", JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {
        Bidimensional b1 = new Bidimensional(0);
        b1.calcularArea();
      }
      else {
        Tridimensional t1 = new Tridimensional(0,0);
        t1.calcularVolume();
    }
    }
}