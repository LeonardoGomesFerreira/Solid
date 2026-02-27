public class Main {
    public static void main(String[] args) {
            ITipoFrete frete = new DroneFrete();
            double peso = 3;
            int distancia = 5;

            Pedido p1 = new Pedido();
            Produto prod1 = new Produto(1, 13.00, 2.00);
            Produto prod2 = new Produto(2, 350.00, 5.00);
            Produto prod3 = new Produto(3, 90.00, 8.00);

            p1.addProduto(prod1);
            p1.addProduto(prod2);
            p1.addProduto(prod3);

            p1.listarItens();

            p1.finalizar(frete);

            System.out.println(CalculadoraFrete.calcularFrete(frete, peso, distancia));
        }
    }
