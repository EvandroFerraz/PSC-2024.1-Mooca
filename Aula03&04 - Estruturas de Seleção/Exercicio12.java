/*
12. Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser considerado como uma 
senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5;
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1;
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1.
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do meio é 3.
*/

import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de quatro dígitos: "));

        int primeiroDigito = numero / 1000;
        int segundoDigito = (numero / 100) % 10;
        int terceiroDigito = (numero / 10) % 10;
        int quartoDigito = numero % 10;

        // Verificando se o número tem quatro dígitos
        if (numero < 1000 || numero > 9999) {
            JOptionPane.showMessageDialog(null, "Número inválido. Deve ter quatro dígitos.");
        } else if ((primeiroDigito != 8 && primeiroDigito != 5) || (quartoDigito != 5 && quartoDigito != 1)) {
            JOptionPane.showMessageDialog(null, "Senha inválida. O número não atende aos critérios.");
        } else {
            int soma = segundoDigito + terceiroDigito;
            if ((quartoDigito == 5 && soma != 3) || (quartoDigito == 1 && soma != 0)) {
                JOptionPane.showMessageDialog(null, "Senha inválida. O número não atende aos critérios.");
            } else {
                JOptionPane.showMessageDialog(null, "Senha válida.");
            }
        }
    }
}
