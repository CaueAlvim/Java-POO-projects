import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    protected String ra;
    protected String disciplina;
    protected float mediafinal;
    protected float nota1;
    protected float nota2;

    protected Aluno(String nome, String cpf, int idade, String ra, String disciplina, float mediafinal){
        super(nome, cpf, idade);
        this.ra = ra;
        this.disciplina = disciplina;
        this.mediafinal = mediafinal;
    }

    protected void atribuirMediafinal(){
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1 do aluno:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2 do aluno:"));
        if ((nota1 > 10) || (nota2 > 10)){
            System.out.println("Notas inválidas");
        }else{
            mediafinal = ((nota1 + nota2)/2);
        System.out.println("\nA media final do aluno é de: " + mediafinal );
        }
    }

}