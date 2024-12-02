public class Palindromo {
    public boolean isPalindromo(String palavra){
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.toLowerCase().contentEquals(palavraInvertida.toLowerCase())){
            return true;
        }else {
            return false;
        }
    }
}
