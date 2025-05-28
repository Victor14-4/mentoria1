import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];

        // Receber as notas dos estudantes
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = sc.nextDouble();
        }

        // Calcular médias bimestrais (só tem as notas, então cada nota é a média bimestral)
        // Mas pelo exemplo, as médias bimestrais são as próprias notas informadas

        // Calcular médias semestrais:
        double primeiroSemestre = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        double segundoSemestre = (notas[4] + notas[5] + notas[6] + notas[7]) / 4;

        //  média final
        double mediaFinal = (primeiroSemestre + segundoSemestre) / 2;

        // Exibir o resultado
        System.out.println("\nPráticas");
        System.out.printf("1º Bimestre: %.1f\n", notas[0]);
        System.out.printf("2º Bimestre: %.1f\n", notas[1]);
        System.out.printf("3º Bimestre: %.1f\n", notas[2]);
        System.out.printf("4º Bimestre: %.1f\n", notas[3]);
        System.out.printf("1º Semestre: %.1f\n", primeiroSemestre);
        System.out.println("----------------------");
        System.out.printf("5º Bimestre: %.1f\n", notas[4]);
        System.out.printf("6º Bimestre: %.1f\n", notas[5]);
        System.out.printf("7º Bimestre: %.1f\n", notas[6]);
        System.out.printf("8º Bimestre: %.1f\n", notas[7]);
        System.out.printf("2º Semestre: %.1f\n", segundoSemestre);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        sc.close();
    }
}
