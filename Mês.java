import java.util.Scanner;

public class Mês {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 12 correspondente aos meses");
        int numero = entrada.nextInt();

        String Mês;

        switch (numero) {
            case 1: Mês =
                    "Janeiro";
                break;
            case 2: Mês =
                    "Fevereiro";
                break;
            case 3: Mês =
                    "Março";
                break;
            case 4: Mês =
                    "Abril";
                break;
            case 5: Mês =
                    "Maio";
                break;
            case 6: Mês =
                    "Junho";
                break;
            case 7: Mês =
                    "Julho";
                break;
            case 8: Mês =
                    "Agosto";
                break;
            case 9: Mês =
                    "Setembro";
                break;
            case 10: Mês =
                    "Outubro";
                break;
            case 11: Mês =
                    "Novembro";
                break;
            case 12: Mês =
                    "Dezembro";
                break;
            default:
                Mês = "Número inválido. Por favor, digite um numero de 1 a 12.";
                break;
        }
        System.out.println(Mês);

        entrada.close();

    }
}
