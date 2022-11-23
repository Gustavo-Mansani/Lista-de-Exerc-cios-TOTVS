public class ConverterReais {

    public static void main(String[] args) {

        int reais = 10;
        double dolares = 5.32;
        double euro = 5.47;
        double libras = 6.31;
        double pesoArgentino = 0.033;
        double coroas = 0.22;

        double conversaoDolar = reais / dolares;
        System.out.printf("a conversão em dólares é %.2f \n" , conversaoDolar);

        double conversaoEuro = reais / euro;
        System.out.printf("a conversão em euro é %.2f \n" , conversaoEuro);

        double conversaoLibras = reais / libras;
        System.out.printf("a conversão em libras é %.2f \n" , conversaoLibras);

        double conversaoPesoArgentino = reais / pesoArgentino;
        System.out.printf("a conversão em peso Argentino é %.2f \n" , conversaoPesoArgentino);

        double conversaoCoroas = reais / coroas;
        System.out.printf("a conversão em coroas Tchecas é %.2f \n" , conversaoCoroas);

    }
}
