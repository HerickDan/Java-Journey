package for_structure;

import java.util.Scanner;

public class for_strucutre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grauscelcius = sc.nextInt();
        System.out.println(converToF(grauscelcius));
        System.out.println(converToK(grauscelcius));
    }
    public static int converToF (double n){
        double calc =  (n*1.8)+32;
        int convertToInt = (int) calc;
        return convertToInt;
    }
    public static double converToK (double n){
        double calc =  n+ 273.15;
        int convertToInt = (int) calc;
        return calc;
    }
}
