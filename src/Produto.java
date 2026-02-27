public class Produto {
    private int id;
    private double preco;
    private double peso;

    public Produto(int id, double preco, double peso) {
        this.id = id;
        this.preco = preco;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
