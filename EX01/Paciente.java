import javax.swing.JOptionPane;

public class Paciente extends Pessoa {
    public String plano_saude;
    public double valor_internação;

    Paciente(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    // metodo para pegar os dados do paciente
    public void atributosPessoa(){
        nome= JOptionPane.showInputDialog("Digite o nome do Paciente:");
        cpf= JOptionPane.showInputDialog("Digite o cpf do Paciente:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Paciente:"));
        plano_saude = JOptionPane.showInputDialog("Digite qual o plano de saude do Paciente:");
        valor_internação = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de internação do Paciente:"));
    }

    // metodo para gerar desconto caso a idade seja menor que 25
    public double desconto(){
        if (idade<=25){
            valor_internação -= (valor_internação * 0.08);
        }
        return valor_internação;
    }

    // metodo para gerar desconto caso a idade seja maior que 25 e menor que 40 e maior que 40
    public double desconto(double desconto){
        if ((idade>25)&&(idade<40)){
            valor_internação -= (valor_internação * 0.20);
        }
        if(idade>40){
            valor_internação -= (valor_internação * 0.30);
        }
        return valor_internação;
    }
    // metodo para mostrar os dados
    public void mostrarDados(){
        System.out.println("O nome do Paciente:" + nome);
        System.out.println("O cpf do Paciente:" + cpf);
        System.out.println("A idade do Paciente:" + idade);
        System.out.println("O plano de saude do Paciente:" + plano_saude);
        System.out.println("O valor da internação:" + valor_internação);
    }
}