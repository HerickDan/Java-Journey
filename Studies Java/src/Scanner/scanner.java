package Scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite um número: ");
       int num1 = sc.nextInt();
        sc.nextLine();


        System.out.print("Digite um outro número: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        int resultado = num1 + num2;

        System.out.printf("A soma dos núemros %d + %d é igual a %d", num1, num2, resultado);
    }
}
