package resolucoes2;

import java.util.Scanner;

public class Caso2 {
    
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;

        do {
            if (a == num) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        } while (a <= num);

        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
