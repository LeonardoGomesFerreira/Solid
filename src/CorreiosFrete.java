public class CorreiosFrete implements ITipoFrete {
    @Override
    public double calcular(double peso, int distancia) {

        if (peso > 30.0) {
            System.out.println("Frete indisponível para mais de 30Kg");
            return -1.0;
        }
        return 12.00 + (1.50 * peso) + (0.05 * distancia);
    }
}
