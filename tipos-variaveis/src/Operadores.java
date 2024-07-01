public class Operadores {
    public static void main(String[] args) {

        String concatenacao;

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        // Será mostrado na tela o valor 31, pois a partir do momento em que o programa identifica uma String
        // ele deixa de realizar a operação matemática e irá nos retornar na tela a representação de uma String.

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        // Será mostrado na tela o valor 1111, pois a partir do momento em que o programa identifica uma String,
        // ele engloba todos os valores contidos na linha a partir da String também como sendo uma String.

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        // Será mostrado na tela o valor 1111, pois a partir do momento em que o programa identifica uma String
        // e nesse caso a String é o primeiro valor evidenciado, ele engloba todos os valores contidos
        // na linha de código também como a representação de uma String.

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
        // Será mostrado na tela o valor "13",
        // pois estará evidenciando o valor contido entre aspas, tido como String,
        // e depois somando os valores contidos na expressão entre parenteses 1+1+1,
        // esse caso enquadra-se em uma situação de expressão em EVIDENCIA.

    }
}
