public class DroneFrete implements ITipoFrete{
    @Override
    public double calcular(double peso, int distancia) {
        if(distancia > 5.0) {
            System.out.println("Frete indisponível para mais de 5Km");
            return -1.0;
        }

        if(peso > 3){
            System.out.println("Frete indisponível para mais de 3Kg");
            return -1.0;
        }
        return 15.00 + (0.5 * distancia) + (3.0 * peso);
    }
}
