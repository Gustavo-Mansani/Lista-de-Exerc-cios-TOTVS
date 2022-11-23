public class CalculoPiscina {
    public static void main(String[] args) {

        int dimensao1 = 10;
        int dimensao2 = 20;
        double dimensao3 = 1.8;

        double calculoDimensoes = dimensao1 * dimensao2 * dimensao3;

       double capacidadeLitros = calculoDimensoes * 1000;

        System.out.println("a capacidade da piscina em litros é de " + capacidadeLitros);



    }
}
