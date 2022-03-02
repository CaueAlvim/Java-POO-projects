import javax.swing.JOptionPane;

public class Produto {
    protected float preco;
    protected String nomeproduto;
    protected int idproduto;

    protected Produto(float preco, String nomeproduto, int idproduto){
        this.nomeproduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
        this.preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto: "));
        this.idproduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de identificação do produto: "));
    }
}