public class CalculadoraFrete {
    public static double calcularFrete(ITipoFrete frete, double peso, int distancia){
        return frete.calcular(peso, distancia);
    }
}
