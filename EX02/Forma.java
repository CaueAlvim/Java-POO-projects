import javax.swing.JOptionPane;

public class Forma {
    protected float comprimento;
    protected float largura;

    protected Forma(){
        this.comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento da forma:"));
        this.largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura da forma:"));
    }
}