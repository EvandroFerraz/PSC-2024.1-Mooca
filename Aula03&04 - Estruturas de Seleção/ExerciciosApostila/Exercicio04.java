//4 - Ler um inteiro no intervalo [1, 7] e exibir o dia da semana associado a ele, como a seguir: 1: Domingo, 2: Segunda, 3: Terça. E assim por diante.

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Exercício 4: Exibir o dia da semana associado a um número inteiro");
        int diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 1 e 7: "));
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido.");
        }
    }
}
