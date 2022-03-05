import javax.swing.JOptionPane;

public class Mensalista extends Professor{
    protected double salariomensal;
    
    protected Mensalista(String nome,String cpf, int anoslecionados, double salariomensal){
        super(nome, cpf, anoslecionados);
        this.salariomensal = salariomensal;
    }

    protected void cadastroSalario(){
        salariomensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do professor " + nome));
    }

    protected void salarioDesconto(){
        salariomensal = salariomensal - (salariomensal * 0.005); 
        JOptionPane.showMessageDialog(null, "Salario do professor com desconto de 0.05% é de: R$" + salariomensal);
    }
}