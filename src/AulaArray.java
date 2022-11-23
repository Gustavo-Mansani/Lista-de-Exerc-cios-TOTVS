public class AulaArray {
    public static void main(String[] args) {
        double [] notas = new double [4];

        notas[0] = 7;
        notas[1] = 6;
        notas[9] = 9;
        notas[3] = 10;
        double[] notas = {7, 6, 9, 10};

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.printf("As notas do aluno são: %.2f, %.2f, %.2f e %.2f.\n", notas[0], notas[1], notas[2], notas[3])
        System.out.printf("A média final é %.2f.\n", media);


    }
}
