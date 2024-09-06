package resolucoes2;

import java.util.Scanner;

public class Caso5 {
    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma string: ");
        String original = in.nextLine();
        in.close();
        String invertida = "";
        for(int i = original.length() - 1 ;i >= 0; i--)
        {
               invertida += original.charAt(i);
        }
        System.out.println("Palavra Original : "+original+ " a Invertida "+invertida);

    }
}
