import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int aux = 1;

        Cliente c1 = new Cliente("0","0","0","0");
        c1.dadosCliente();

        while(aux != 0) {
            Pedido pedido1 = new Pedido();
            pedido1.mostrarPedido();

            Catalogo prod1 = new Catalogo(0,"0",0);
            prod1.mostrarProduto();

            int resposta = JOptionPane.showConfirmDialog(null,"Deseja adicionar mais um pedido?", "", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                aux = 1;
            }
            else {
                aux = 0;
            }
        }
    }
}