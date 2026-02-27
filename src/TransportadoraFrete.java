public class TransportadoraFrete implements ITipoFrete {
    @Override
    public double calcular(double peso, int distancia) {
        double frete = 20.00 + (1.00 * peso) + (0.03 * distancia);
        if (peso > 50.0){
            return frete * 0.9;
        }
        return frete;
    }
}
