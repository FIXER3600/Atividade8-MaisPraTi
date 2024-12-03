package Exercicio2;

public class Palindromo {
    public boolean isPalindromo(String palavra){
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        return palavra.toLowerCase().contentEquals(palavraInvertida.toLowerCase());
    }
}
