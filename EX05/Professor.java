import javax.swing.JOptionPane;

public abstract class Professor implements IProfessor{
    protected String nome;
    protected String cpf;
    protected int anoslecionados;

    protected Professor(String nome,String cpf, int anoslecionados){
        this.nome = nome;
        this.cpf = cpf;
        this.anoslecionados = anoslecionados;
    }

    @Override
    public void cadastroProfessor(){
        nome = JOptionPane.showInputDialog("Digite o nome do Professor:");
        cpf = JOptionPane.showInputDialog("Digite o cpf do Professor:");
        anoslecionados = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos o professor leciona:"));
    }

    @Override
    public void dadosProfessor(){
        JOptionPane.showMessageDialog(null, "O nome do professor é: " + nome + "\nO cpf do professor é: " + cpf + "\nO professor tem: " + anoslecionados + " anos lecionados");
    }
}