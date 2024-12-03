package Exercicio5;

import java.util.Scanner;
import java.util.Arrays;
public class Anagrama {
    public void isAnagrama(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira palavra : ");
        String p1=scanner.next();
        System.out.println("Digite a segunda palavra: ");
        String p2=scanner.next();
        // Verificando se as palavras são anagramas
        if (saoAnagramas(p1, p2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }

        // Fechando o scanner
        scanner.close();

    }
    public static boolean saoAnagramas(String palavra1, String palavra2) {
        // Se as palavras tiverem tamanhos diferentes, não podem ser anagramas
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        // Converte as palavras para arrays de caracteres e ordena
        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();

        Arrays.sort(arr1);  // Ordenando o array da primeira palavra
        Arrays.sort(arr2);  // Ordenando o array da segunda palavra

        // Compara os arrays ordenados
        return Arrays.equals(arr1, arr2);
    }
}
