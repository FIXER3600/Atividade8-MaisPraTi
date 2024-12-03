import java.util.Scanner;
public class Fibonacci {
    public void sequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de elementos da sequência de Fibonacci: ");
        int n = scanner.nextInt();
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        int aux = 0;
        int aux2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(aux + " ");
            int temp = aux;
            aux = aux2;
            aux2 = temp + aux;
        }
        scanner.close();
    }
}
