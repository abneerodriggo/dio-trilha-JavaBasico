# Anotações gerais:

- Requisitos para iniciação do estudo Java:

Ter o pacote JDK instalado em sua máquina, ter a sua IDE preferida para o desenvolvimento, e ter o diretório do projeto estabelecido.

- Anatomia da Classe:

O porque das regras ou estruturas existirem na linguagem.

## Tipos primitivos em Java:

int, byte, short, long, float, double, boolean e char

**Obs:** Encerrar com "**F**" aos valores atribuídos à tipos de variáveis  **float**, e "**L**" nos tipos de variáveis **long** ,para que não haja a possibilidade do programa identificar como um erro de sintaxe quanto a utilização da variável correta. *ex: float pi = 3.14F / long cpf = 98765432109L*

**Obs:** Em casos de **variáveis com valores constantes** em sua atribuição, se faz necessário **escrevê-la em caixa alta** e utilizando a palavra reservada ***final*** antes de declarar o tipo da mesma. *ex: final double VALOR_DE_PI = 3.14*

## Operadores:

- ***Operadores de atribuição*** - Representado pelo símbolo de igualdade `"=".`

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever um valor já existente de uma variável. Em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Ex: String nome **=** "Abner" ; int idade **=** 29;



- ***Operadores aritméticos** -* O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos.

Representação dos operadores aritméticos: **+** (adição), **-**(subtração), *****   (multiplicação) , **/**  (divisão) e **%** (módulo ou resto de uma divisão.)

Ex: double soma = 10.5 + 15.5; int subtracao = 110 - 35; int multiplicacao = 20 * 5; int divisao = 30 / 5; int modulo = 30 % 5; 

**Obs:** O operador de adição (+), quando utilizado em variáveis tipo texto, realizará a concatenação de textos (Pegar uma palavra e juntar com outra, como se estivess). Ex: String nomeCompleto = "LINGUAGEM" + "JAVA" (exemplificado na IDE intellij).



- ***Operadores Unários** -* Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

  

  (+) **Operador unário de valor positivo** – números são positivos sem esse operador explicitamente;

  (-) **Operador unário de valor negativo** – nega um número ou expressão aritmética;

  (++) **Operador unário de incremento de valor** – incrementa o valor em 1 unidade;

  (--) **Operador unário de decremento de valor** – decrementa o valor em 1 unidade;

  (!) **Operador unário lógico de negação** – nega o valor de uma expressão booleana.

  

- ***Operadores Ternários** -* O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF , porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

O operador ternário é representado pelos símbolos `"?" e ":"` utilizados na seguinte estrutura de sintaxe:

```
<Expressão Condicional> ? <Caso condição seja true>  :  <Caso condição seja false>
```

*exemplificado na IDE intellij*



- ***Operadores Relacionais -*** Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.

(==) Quando desejamos verificar se uma variável é IGUAL A outra.

(!=) Quando desejamos verificar se uma variável é DIFERENTE da outra.

(>)  Quando desejamos verificar se uma variável é MAIOR QUE a outra.

(>=) Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

(<) Quando desejamos verificar se uma variável é MENOR QUE outra.

(<=) Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.



- ***Operadores Lógicos -*** Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.

(&&) Operador Lógico "E"

(||) Operador Lógico "OU"



## Métodos:

Todas as ações das aplicações são consideradas métodos.

Uma classe é definida por atributos e métodos. Já vimos que atributos são em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a **funções** ou **sub-rotinas** disponíveis dentro de nossas classes.

***Critério de nomeação de Métodos:*** 

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

- **Deve ser** nomeado como **verbo**;
- Seguir o padrão *camelCase* **(Todas as letras minúsculas com a exceção da primeira letra da segunda palavra)**.

 **Obs:** Não existe em Java o conceito de **métodos** **globais**. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.



***Critério de definição de métodos:***

Para chegar à essa conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

- **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
- **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não.

**Obs:** Caso o método ***não retorne nenhum valor***, ele será representado pela palavra-chave ***void***.



- **Quais os parâmetros serão necessários para execução do método?** Os métodos às vezes precisarão de argumentos como critérios para a execução.
- **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
- **Qual a visibilidade do método?** Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.

Abaixo, temos um exemplo de uma classe com dois métodos e suas respectivas considerações:

```
public class MyClass {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}
```



## Palavras Reservadas:

Palavras reservadas, são identificadores de uma linguagem que já possuem uma finalidade específica, sendo assim, não podendo serem utilizadas para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE's.



| *Controle de pacotes*                                        |
| :----------------------------------------------------------- |
| **import:** importa pacotes ou classes para dentro do código;                 **package:** especifica a que pacote, todas as classes de um arquivo pertencem. |

| *Modificadores de acesso*                                    |
| :----------------------------------------------------------- |
| **public:** acesso de qualquer classe;                                                     **private:** acesso apenas dentro da classe;                                    **protected:** acesso por classes no mesmo pacote e subclasses. |

| *Primitivos*                                                 |
| :----------------------------------------------------------- |
| **boolean:** um valor indicando verdadeiro ou falso;                              **byte:** um inteiro de 8 bits (signed);                                                         **char:** um character unicode (16-bit unsigned);                                **double:** um número de ponto flutuante de 64 bits (signed);              **float:** um número de ponto flutuante de 32 bits (signed);                     **int:** um inteiro de 32 bits (signed);                                                          **long:** um inteiro de 64 bits (signed);                                                        **short:** um inteiro de 32 bits (signed);                                                                    **void:** indica que o método não tem retorno de valor. |



| *Modificadores de classes, variáveis ou métodos*             |
| :----------------------------------------------------------- |
| **abstract:** classe que não pode ser instanciada ou método que precisa ser implementado, por uma subclasse não abstrata;                             **class:** especifica uma classe;                                                             **extends:** indica a superclasse que a subclasse está estendendo;                           **final:** impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada;                         **implements:** indica as interfaces que uma classe irá implementar;                                       **interface:** especifica uma interface;                                                   **native**: indica que um método está escrito em uma linguagem dependente de plataforma, como o C;                                                    **new:** instancia um novo objeto, chamando seu construtor;                  **static:** faz um método ou variável pertencer à classe ao invés de às instâncias;                                                                                                 **strictfp**: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante, em todas as expressões;                                                                       **synchronized:** indica que um método só pode ser acessado por uma thread de cada vez;                                                                                  **transient:** impede a serialização de campos;                                  **volatile**: indica que uma variável pode ser alterada durante o uso de threads.; |



| *Controle de fluxo dentro de um bloco de código*             |
| :----------------------------------------------------------- |
| **break:** sai do bloco de código em que ele está;                                      **case:** executa um bloco de código dependendo do teste do switch;                                     **continue:** pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop;                                                     **default:** executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;                                                                        **do:** executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente;                                                                                          **else:** executa um bloco de código alternativo caso o teste "**if**" seja falso;                                                                                                                  **for:** usado para realizar um loop condicional de um bloco de código;           **if:** usado para realizar um teste lógico de verdadeiro ou falso;                                                 **instanceof:** determina se um objeto é uma instância de determinada classe, superclasse ou interface;                                                                                     **return:** retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável);                                           **switch:** indica a variável a ser comparada nas expressões case;                                          **while:** executa um bloco de código repetidamente enquanto a condição for verdadeira. |



| *Tratamento de erros*                                        |
| :----------------------------------------------------------- |
| **assert:** testa uma expressão condicional, para verificar uma suposição do programador;                                                                                        **catch:** declara o bloco de código usado para tratar uma exceção;                                                 **finally:** bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção;                                                                                                             **throw:** usado para passar uma exceção para o método que o chamou;                                         **throws:** indica que um método pode passar uma exceção para o método que o chamou;                                                                                     **try:** bloco de código que tentará ser executado, mas que pode causar uma exceção. |



| *Variáveis de referência*                                    |
| :----------------------------------------------------------- |
| **super:** refere-se a superclasse imediata;                                                   **this:** refere-se a instância atual do objeto. |



| *Palavras reservadas não utilizadas*                         |
| :----------------------------------------------------------- |
| **const:** Não utilize para declarar constantes; use public static final;                                            **goto:** não implementada na linguagem Java, por ser considerada prejudicial. |



| *Literais reservados*                                        |
| :----------------------------------------------------------- |
| De acordo com a Java Language Specification, **null**, **true** e **false** são tecnicamente chamados de valores literais, e não **keywords**. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação. |



#### *Escopo de uso*:

| Uso            | Palavras                                                     | Observação                                                   |
| :------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| ***Arquivo***  | *package, import, static.*                                   |                                                              |
| ***Classe***   | *public ou protected ou private + final ou abstract + extends ou implements.* | ***private** (em caso de classe interna), **final** ou **abstract*** |
| ***Método***   | *public ou protected ou private + static ou final ou abstract + void e return.* | ***void** em caso de não ter retorno ou **return** se houver* |
| ***Atributo*** | *public ou protected ou private + static ou final + tipo primitivo.* | ******                                                       |



#### *Palavras "opostas" :*

Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras que são completamente opostas (antônimas) na linguagem Java conforme tabela abaixo:

| Palavra       | Palavra          | Explicação                                                   |
| :------------ | :--------------- | :----------------------------------------------------------- |
| ***package*** | ***import***     | *Enquanto **package** determina o diretório real da classe, o **import** informa de onde será importada a classe. Isso porque, podemos ter classes de mesmo nome.* |
| ***extends*** | ***implements*** | *enquanto **extends** determina que uma classe estende outra classe, **implements** determina que uma classe implementa uma interface, porém nunca o contrário.* |
| ***final***   | ***abstract***   | *enquanto **final** determina fim de alteração de valor ou lógica comportamental, **abstract** em métodos, exige que sub-classes precisarão definir comportamento e um método abstrato. NOTA: Se uma classe contém um único método abstrato, toda classe precisa ser.* |
| ***throws***  | ***throw***      | *Esta é uma das situações mais complicadas, de compreensão destas duas palavras. Enquanto a **throws** determina que um método pode lançar uma exceção, **throw** é a implementação que dispara a exceção.* |



## Controle de fluxo:

Controle de fluxo, é a habilidade de ajustar a maneira como um programa realiza suas tarefas. Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

***Classificação**:*

- **Estruturas condicionais:** if-else, switch-case.
- **Estruturas de repetição:** for, while, do-while.
- **Estruturas de exceções:** try-catch-finally, throw.



### Estruturas condicionais:

A Estrutura Condicional, possibilita a escolha de um grupo de ações e comportamentos a serem executadas, quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser **simples** ou **composta**.



***Condicionais Simples:***

Quando ocorre uma validação de execução de fluxo, somente quando a condição for positiva, consideramos como uma estrutura **simples**.

// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;
    
       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;
    
        System.out.println(saldo);
    	}
    }


***Condicionais Compostas:***

Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução condicionada a uma regra de negócio, este cenário é denominado **estrutura condicional composta**. 



// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7){
        System.out.println("Aprovado");
    
       } else
        System.out.println("Reprovado");
    	}
    }
**Obs:** Vale ressaltar aqui, que em Java, em uma condição**`if/else`** às vezes necessitamos adicionar um bloco de  **{ }**, se a lógica conter mais de uma linha.



***Condicionais encadeadas:***

Em um controle de fluxo condicional, nem sempre nos limitamos ao **se** (`if`) e **senão** (`else`), poderemos ter uma terceira, quarta e ou inúmeras condições.

// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
		}
	}


***Condição ternária:***

Como vimos em operadores, podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário. 

```
// Cenário 1
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
```



```
// Cenário 2(if elseif else)
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
```



### Switch Case

A estrutura **switch,** compara o valor de cada caso, com o da variável sequencialmente e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas, após um caso correspondente ter sido encontrado, acrescentamos o comando ***break*** no final de cada bloco de códigos. O comando **break**, quando executado, encerra a execução da estrutura onde ele se encontra.

Vamos imaginar que precisaremos imprimir uma medida, com base em mapa de valores, exemplo:



| Sigla | Tamanho |
| :---- | :------ |
| P     | PEQUENO |
| M     | MÉDIO   |
| G     | GRANDE  |



```
// SistemaMedida.java

// Modo condicional if/else
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		
	}
}
```



```
// SistemaMedida.java

// Modo condicional switch / case
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
}
```



Observe que a nível de sintaxe, não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação: informar a palavra `break` em cada alternativa.

Porém, um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algoritmo seria conforme ilustração abaixo:

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

- O sistema terá 03 planos: BASIC, MIDIA , TURBO;
- BASIC: 100 minutos de ligação;
- MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
- TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.



```
// Modo condicional convencional
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}
```



```
// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}
```



*Estudar um pouco mais, sobre os conceitos de **continue**, **break** e **default**.



## Estruturas de repetição

Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

Laços ou repetições são representados pelas seguintes estruturas:

- **For** (para);

- **While** (enquanto);

- **Do While** (faça enquanto).

  

***FOR:***

O comando **for** (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando **for** recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.

Exemplo:

```
//estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
```

Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:

```
// ExemploFor.java
public class ExemploFor {
	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
	}
```

Vamos explicar a estrutura do código acima:

**For position**

1. int carneirinhos = 1`;` -> O programa entende que a variável carneirinhos, começa com o valor igual a 1 e isso acontece somente uma vez;
2. carneirinhos `< = 20;` -> O programa verifica se a variável carneirinhos, ainda é menor que 20;
3. O programa começa a executar o algoritmo, no nosso caso, imprimir a quantidade de carneirinhos em contagem;
4. carneirinhos `++` -> O programa aumenta em mais 1, o valor da variável carneirinhos;
5. O fluxo é finalizado, quando a variável carneirinhos for igual a 20.

```
// Outras estruturas

//estrutura 1
for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
     System.out.println(carneirinhos + " - Carneirinho(s)");
}

//estrutura 2
//o que importa é somente o bloco condicional
int carneirinhos = 1;
for( ; carneirinhos <=20; ) {
     System.out.println(carneirinhos + " - Carneirinho(s)");
     carneirinhos ++;
}

//for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }
```

Exemplos do controle de fluxo **for** , na utilização sobre arrays e coleções:

```
// ExemploFor.java
public class ExemploFor {
public static void main(String[] args) {
	String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}

}
// length -> tamanho
```

Observe que, como os arrays começam com índice igual a **0 (zero)**, iniciamos a nossa variável **x** também com valor zero e validamos a quantidade de repetições, a partir da quantidade de elementos do array.

### For Each

O uso do `**for / each**` está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim , a interação é baseada nos elementos da coleção.

Copy

```
// ExemploFor.java
public class ExemploFor {
public static void main(String[] args) {
	String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        //Forma abreviada
	for(String aluno : alunos) {
	  System.out.println("O nome do aluno é: " + aluno);
	}

}
```

1. `String aluno : alunos` -> De forma abreviada, é criada uma variável `nome` obtendo um elemento do vetor a cada ocorrência ou execução do algoritmo;
2. A impressão de cada aluno é realizada.



***Break e Continue***:

**Break** significa quebrar, parar, frear, interromper. E é isso que se faz, quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando **break** interrompe o laço, já o **continue** interrompe somente a iteração atual.

```
// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?

    }
}
```

```
// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?

    }
}
```



Observem que sempre o **break** e **continue**, estarão condicionados a um critério de negócio.

## While

O laço **while** (na tradução literal para a língua portuguesa “enquanto”) determina que, enquanto uma condição for válida, o bloco de código será executado. O laço **while**, testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe, do controle de repetição **while** é exibida abaixo:

```
//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
```

Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.

```
// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}
```

## Do While

O laço **do / while** (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que, enquanto uma determinada condição for válida, o bloco de código será executado. Entretanto, **do / while**testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do controle de repetição **do / while** é exibida abaixo:

```
//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);
```

Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos:

```
// ExemploDoWhile.java

import java.util.Random;
public class ExemploDoWhile {
public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
```
