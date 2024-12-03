// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcular(5,2,'-'));

        Palindromo p = new Palindromo();
        System.out.println(p.isPalindromo("ok"));

        Fibonacci f=new Fibonacci();
        f.sequence();

    }
}