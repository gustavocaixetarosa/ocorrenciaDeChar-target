import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a String desejada:");
        String frase = scanner.nextLine().toLowerCase();

        System.out.println("Digite a letra que deseja contar:");
        char[] letra = scanner.next().toLowerCase().trim().toCharArray();


        int ocorrencias = contarOcorrencias(frase, letra[0]);
        System.out.println("A letra " + letra[0] + " aparece " + ocorrencias + " vezes!");
    }

    public static int contarOcorrencias(String frase, char letra) {

        int ocorrencias = 0;

        for (int i = 0 ; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                ocorrencias++;
            }
        }

        return ocorrencias;
    }
}