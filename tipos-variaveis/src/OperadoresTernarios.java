public class OperadoresTernarios {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        String resultado;
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE //
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        System.out.println(resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String result = (a == b) ? "verdadeiro" : "false";

        System.out.println(result);
    }

}
