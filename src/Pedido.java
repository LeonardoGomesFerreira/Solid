import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private List<Produto> produtos;

    public Pedido() {
        this.produtos = new ArrayList<Produto>();
    }

    public void addProduto(Produto p){
        produtos.add(p);
    }

    public void listarItens(){
        for (Produto p: this.produtos){
            System.out.println(p.getPreco());
        }
    }

    public void finalizar(ITipoFrete tipoFrete){
        int distancia = 10;
        double peso = 0.0;
        for (Produto p: this.produtos){
            peso += p.getPeso();
        }
        CalculadoraFrete.calcularFrete(tipoFrete, peso, distancia);
    }
}
