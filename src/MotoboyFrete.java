public class MotoboyFrete implements ITipoFrete{
    @Override
    public double calcular(double peso, int distancia) {
        if(peso > 10.0){
            System.out.println("Frete indisponível para mais de 10kg");
            return -1.0;
        }
        if(distancia > 15){
            System.out.println("Frete indisponível para mais de 15Km");
            return -1.0;
        }

        return 8.00 + (2.00 * distancia);
    }
}
