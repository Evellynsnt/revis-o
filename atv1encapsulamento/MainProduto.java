public class MainProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Short", 30.00, 400);
        
        System.out.println("Valor total que possui no estoque: R$ " + p.calcularValorTotal());

        p.setQuantidade(400);
        p.setPreco(40.00);

        System.out.println("Valor novo: R$ " + p.calcularValorTotal());
    }
}
