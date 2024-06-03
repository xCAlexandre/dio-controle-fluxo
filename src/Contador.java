import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }

        terminal.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoParametro - primeiroParametro;
        for(int i  = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }

    }

}
