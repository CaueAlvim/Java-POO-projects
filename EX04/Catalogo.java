public class Catalogo extends Produto{
    
    protected Catalogo(float preco, String nomeproduto, int idproduto){
        super(preco, nomeproduto, idproduto);
    }

    protected void mostrarProduto(){
        System.out.println("Id do produto: " + idproduto);
        System.out.println("\nNome do produto: " + nomeproduto);
        System.out.println("\nPreço do produto: R$" + preco +"\n");
    }
}