public class Main {
    public static void main(String[]args){
        Mensalista mens1 = new Mensalista("","",0,0);

        mens1.cadastroProfessor();

        Disciplina disc1 = new Disciplina("");

        disc1.cadastroDisciplina();
        
        mens1.cadastroSalario();

        mens1.dadosProfessor();

        disc1.mostrarDisciplina();

        mens1.salarioDesconto();
    }
}