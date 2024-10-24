
    package Desafio;

    import javax.swing.*;
    import java.math.BigDecimal;
    import java.math.RoundingMode;
    import java.util.Scanner;

    public class Main {




        /*3 Strings para receber 3 salarios, e calcular a média
        facilidade de separar as casas com "." ou ","
        somar os 3 salarios e dividir por 3
        converter string em valor numerico*/

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Informe primeiro salário");
        String valor2 = JOptionPane.showInputDialog(
                "Informe segundo salário");
        String valor3 = JOptionPane.showInputDialog(
                "Informe terceiro salário");

        System.out.println(valor1 + valor2 + valor3);

        BigDecimal salario1 = new BigDecimal(valor1);
        BigDecimal salario2 = new BigDecimal(valor2);
        BigDecimal salario3 = new BigDecimal(valor3);

        BigDecimal soma = salario1.add(salario2).add(salario3);

        BigDecimal media = soma.divide(new BigDecimal(3), 2, RoundingMode.HALF_UP);

        System.out.println("Soma é " + soma);
        System.out.println("Média é " + media);


    }
}