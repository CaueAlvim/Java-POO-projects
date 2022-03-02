import javax.swing.JOptionPane;

public class Pessoa{
    protected String nome;
    protected String cpf;
    protected int idade;
    
    protected Pessoa(String nome, String cpf, int idade){
        this.nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
        this.cpf = JOptionPane.showInputDialog("Digite o cpf da pessoa: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
    }
}   