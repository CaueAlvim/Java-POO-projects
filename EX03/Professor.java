import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    protected String materialeciona;
    protected float salario;

    protected Professor(String nome, String cpf, int idade, String materialeciona, float salario){
        super(nome, cpf, idade);
        this.materialeciona = materialeciona;
        this.salario = salario;
    }

    protected void atribuirSalario(){
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário para atribuir ao professor " + nome + ":"));
        System.out.println("O salario do professor é de: R$" + salario );
    }

    protected void alterarSalario(){
        salario = salario + Float.parseFloat(JOptionPane.showInputDialog("Digite a alteração ao salario do professor " + nome + ":"));
        System.out.println("O salario do professor mudou para: R$" + salario);
    }
}