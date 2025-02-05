package value_conversion;

public class Casting {
    public static void main(String[] args) {
        double resultado  = 0.0;
        int resultadoInt = (int) resultado;
        //posso declarar no tipo da variável ou depois da variável;

        String minhaString = "10";
        int convertendoPraInt = Integer.parseInt(minhaString);
        String convertendoParaString = String.valueOf(convertendoPraInt);
        System.out.println(convertendoParaString);
    }
}
