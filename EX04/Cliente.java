import javax.swing.JOptionPane;

public class Cliente implements ICliente {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;

    protected Cliente (String nome, String cpf, String endereco, String telefone){
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        this.cpf = JOptionPane.showInputDialog("Digite o cpf do cliente: ");
        this.endereco = JOptionPane.showInputDialog("Digite o endereco do cliente: ");
        this.telefone = JOptionPane.showInputDialog("Digite o telefone do cliente: ");
    }

    public void dadosCliente(){
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("\nCpf do cliente: " + this.cpf);
        System.out.println("\nEndereço do cliente: " + this.endereco);
        System.out.println("\nTelefone de contato do cliente: " + this.telefone);
    }
}
