package Exercises;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args){
        //Sum of numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite um número ");
//        int num1 = sc.nextInt();
//        System.out.print("Digite um outro número ");
//        int num2 = sc.nextInt();
//        int sum = num1+num2;
//        System.out.printf("A soma dos núemros %d + %d é igual a %d", num1, num2, sum);
//        sc.close();

// #2 calculating the radius
//        double pi = 3.14159;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite o valor do raio");
//        double radio = sc.nextDouble();
//
//        double area = pi*(Math.pow(radio, 2));
//
//        System.out.printf("A área do circulo é igaul a: %f", area);
//
//        sc.close();

// #3 Difference of products
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite um número: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("Digite um segundo número: ");
//        int num2 = sc.nextInt();
//
//        System.out.print("Digite um terceiro número: ");
//        int num3 = sc.nextInt();
//
//        System.out.print("Digite um quarto número: ");
//        int num4 = sc.nextInt();
//
//        int differece = (num1*num2)-(num3*num4);
//        System.out.printf(
//                "A diferença do produto dos núemros %d x %d e  %d x %d é: %d",
//                num1,
//                num2,
//                num3,
//                num4,
//                differece);
//        sc.close();

// #4 true or false
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite um número:");
//        int num = sc.nextInt();
//
//        String verifying = num>=0 ? "positivo" : "negativo";
//
//        System.out.println(verifying);
//
//        sc.close();

// #5 week's day;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite um número de 1 a 7 e descubra o dia da semana:");
//        int num = sc.nextInt();
//        String result;
//        if(num > 0 && num<=7){
//            switch (num){
//                case 1:
//                    result = "Sunday";
//                    break;
//                case 2:
//                    result = "Monday";
//                    break;
//                case 3:
//                    result = "Tuesday";
//                    break;
//                case 4:
//                    result = " Wednesday";
//                    break;
//                case 5:
//                    result = "Thursday";
//                    break;
//                case 6:
//                    result = "Friday";
//                    break;
//                case 7:
//                    result= "Saturday";
//                    break;
//                default:
//                    result = "valor inválido";
//                    break;
//            }
//        }else{
//            result = "Valor inválido";
//        }
//        System.out.println(result);
//  #6 USING WHILE
//        Scanner sc = new Scanner(System.in);
//        int password = sc.nextInt();
//
//        while(password!=2002){
//            password = sc.nextInt();
//            System.out.println("Senha inválida:"+password);
//        }
//        System.out.println("Senha válida:"+password);

// #7 Cartesian plane
        Scanner sc = new Scanner(System.in);
        cartesianPlan(sc);
    }
    public static int cartesianPlan(Scanner sc){
        int x = 0;
        int y=0;
        x= sc.nextInt();
        y=sc.nextInt();
        while(x !=0 && y!=0 ){
            x= sc.nextInt();
            y=sc.nextInt();
        }
        return x;
    }
}
