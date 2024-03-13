// 5 - Ler um número inteiro no intervalo [1, 12]. Considerando que cada número representa um mês da seguinte forma: 1: Janeiro, 2: Fevereiro e assim por diante,
// exiba o número de dias que o mês cujo respectivo número digitado possui.

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exercício 5: Determinar o número de dias em um mês");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 1 e 12: "));
        int numDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                numDias = 28; // Considerando que não é um ano bissexto
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido.");
        }
        if (numDias != 0) {
            JOptionPane.showMessageDialog(null, "O mês " + mes + " tem " + numDias + " dias.");
        }
    }
}
