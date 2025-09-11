import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class diaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 correspondente aos dias da semana");
        int numero = entrada.nextInt();

        String diaDaSemana;

        switch (numero) {
            case 1: diaDaSemana =
                "Domingo";
            break;
            case 2: diaDaSemana =
                    "Segunda";
                break;
            case 3: diaDaSemana =
                    "Terça";
                break;
            case 4: diaDaSemana =
                    "Quarta";
                break;
            case 5: diaDaSemana =
                    "Quinta";
                break;
            case 6: diaDaSemana =
                    "Sexta";
                break;
            case 7: diaDaSemana =
                    "Sábado";
                break;
            default:
                diaDaSemana = "Número inválido. Por favor, digite um numero de 1 a 7.";
                break;
        }
        System.out.println(diaDaSemana);

        entrada.close();
    }
}