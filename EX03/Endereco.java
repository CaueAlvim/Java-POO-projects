import javax.swing.JOptionPane;

public class Endereco {
    protected String rua;
    protected String cep;
    protected int numerocasa;

    protected Endereco(String rua, String cep, int numerocasa){
        this.rua = rua;
        this.cep = cep;
        this.numerocasa =  numerocasa;
    }

    protected void mostrarEndereco(){
        rua= JOptionPane.showInputDialog("Digite o nome da rua dessa pessoa: ");
        cep= JOptionPane.showInputDialog("Digite o numero do cep dessa pessoa: ");
        numerocasa = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa dessa pessoa: "));

        System.out.println("A rua que essa pessoa mora é: " + rua);
        System.out.println("O CEP de onde a pessoa mora é : " + cep);
        System.out.println("O numero da casa da pessoa é: " + numerocasa);
    }
}