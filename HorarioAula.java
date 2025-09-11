import java.util.Scanner;

public class HorarioAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o período em que você estuda(M-Matulino,V-Vespertino ou N-Noturno):");

        String periodo = entrada.next();
        periodo = periodo.toUpperCase();
        String saudacao;

        switch (periodo) {
            case "M":
                saudacao = "Bom dia!";
                break;
            case "V":
                saudacao = "Boa tarde!";
                break;
            case "N":
                saudacao = "Boa noite!";
                break;
            default:
                saudacao = "Valor inválido! Por favor, digite M, V ou N.";
                break;


        }
        System.out.println(saudacao);
        entrada.close();
     }
    }




