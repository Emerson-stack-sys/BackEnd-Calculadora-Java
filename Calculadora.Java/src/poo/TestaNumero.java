package poo;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {

public static void main(String[] args) {

// Executar operação com base na escolha

Numero n = new Numero();

boolean continuar = true;

Scanner scan = new Scanner(System.in);
while (continuar) {

double x = 0;
double y = 0;
int operacao = 0;

// Exibir instruções para o usuário

System.out.println("Digite a operação que deseja realizar:"

 + " \n 1 para soma"
+ " \n 2 para subtração"
+ " \n 3 para multiplicação"
+ " \n 4 para divisão"
+ " \n  ou 0 para finalizar o programa"

);

// Obter operação do usuário

operacao = scan.nextInt();

if (operacao == 0) {
continuar = false;
return;

}

// Obter os números para a operação

System.out.println("Informe o valor do primeiro número");
x = scan.nextDouble();

System.out.println("Informe o valor do segundo Número");
y = scan.nextDouble();

switch (operacao) {

case 1:
imprimeCalculadora(operacao, n.soma(x, y), x, y);

break;

case 2:
imprimeCalculadora(operacao, n.subtração(x, y), x, y);

break;

case 3:
imprimeCalculadora(operacao, n.multiplicação(x, y), x, y);

break;

case 4:
imprimeCalculadora(operacao, n.divisão(x, y), x, y);

break;

}

}

// Fechar o scanner após o uso
scan.close();
}

static void imprimeCalculadora(int operacao, double resultado, double x, double y) {

HashMap<Integer, String> mapOperacao = new HashMap<>();

mapOperacao.put(1, "Soma");
mapOperacao.put(1, "Subtração");
mapOperacao.put(1, "Multiplicação");
mapOperacao.put(1, "Divisão");

System.out.println(
"\n o resultado de " + x + mapOperacao.get(operacao) + "por" + y + " é igual a" + resultado + "\n");
}
}
