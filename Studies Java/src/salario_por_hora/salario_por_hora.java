package salario_por_hora;

public class salario_por_hora {
    public static void main(String[] args) {
        double salarioHora = 65;
        int horaPorSemana = 44;
        int horasMes = horaPorSemana * 4;
        double salarioFinal = salarioHora * horasMes;

        System.out.printf("Você trabalha %d por mês, e ganha R$%.2f, com base nisso você ganha R$%.2f ",
                horasMes, salarioHora, salarioFinal
        );
    }
}
