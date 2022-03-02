import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int aux = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de pessoa quer alterar dados? \n 1 - Professor \n 2 - Aluno \n"));
        switch(aux){

            case 1:
                Endereco end1 = new Endereco("0", "0", 0);
                end1.mostrarEndereco();

                Professor prof1 = new Professor("0","0",0,"0",0);
                prof1.atribuirSalario();
                prof1.alterarSalario();  
            break;

            case 2:
                Endereco end2 = new Endereco("0", "0", 0);
                end2.mostrarEndereco();
                
                Aluno aluno1 = new Aluno("0","0",0,"0","0",0);
                aluno1.atribuirMediafinal();
            break;

            default:
                System.out.println("Opção inválida!\n");
        }
    }
}