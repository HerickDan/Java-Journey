package while_structure;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = 0;
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        while(tipo!=4){
            tipo = sc.nextInt();
            if(tipo == 1){
                alcool++;

            }
            else if(tipo == 2){
                gasolina++;

            }
            else if(tipo == 3) {
                disel++;
            }
        }
        System.out.println("Muito obrigado");
        System.out.printf("Alccol %d %n", alcool);
        System.out.printf("Gasolina %d %n", gasolina);
        System.out.printf("Disel %d %n", disel);
    }
}
