import javax.swing.JOptionPane;

public class Disciplina {
    protected String nomedisciplina;

    protected Disciplina(String nomedisciplina){
        this.nomedisciplina = nomedisciplina;
    }

    protected void cadastroDisciplina(){
        nomedisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina do Professor:");
    }

    protected void mostrarDisciplina(){
        JOptionPane.showMessageDialog(null, "O professor leciona a seguinte disciplina: " + nomedisciplina);
    }
}