import javax.swing.JOptionPane;

public class Horista extends Professor{
    protected float salariohora;
    
    protected Horista(String nome,String cpf, Integer anoslecionados, float salariohora){
        super(nome, cpf, anoslecionados);
        this.salariohora = salariohora;
    }

    protected void salarioHora(){
        salariohora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora do professor " + nome));
    }
}