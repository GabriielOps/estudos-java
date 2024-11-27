
import java.util.Scanner;

public class contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro");
        } else {
            System.out.println("Ambos numeros validos, seguindo operação");
        }

        int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagemErro) {
        super(mensagemErro);
    }
}
