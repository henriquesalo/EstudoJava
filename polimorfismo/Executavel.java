package polimorfismo;

import polimorfismo.mercado.Alho;
import polimorfismo.mercado.CarrinhoDeCompras;
import polimorfismo.mercado.Melancia;

public class Executavel {

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Alho a1 = new Alho("Alho comum", 1.99, 1.0);
        Melancia m1 = new Melancia("Melancia", 12.99, 1);

        carrinho.adicionarProduto(a1);
        carrinho.adicionarProduto(m1);

        
        System.out.println(carrinho.finalizarCompra());
    }
}