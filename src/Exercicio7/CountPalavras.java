package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPalavras {
    public void contarPalavras(){
         ArrayList<String> listaPalavras = new ArrayList();
           Scanner scan = new Scanner(System.in);
           System.out.print("Digite uma frase: ");
          String[] frase=scan.nextLine().split(" ");
           for(String palavra : frase){
                   listaPalavras.add(palavra);
            }
    System.out.print("Nesta frase há "+listaPalavras.size()+" palavras");
    scan.close();
    }
}
