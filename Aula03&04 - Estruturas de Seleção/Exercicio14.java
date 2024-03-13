/*
14. Escreva um programa que lê as notas de 10 alunos e calcula a média aritmética delas.
Caso a média seja pelo menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8.
Caso contrário, o programa deve exibir a quantidade de alunos que tiraram nota 0.
*/

import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {
        double soma = 0;
        int notaMaiorQueOito = 0;
        int notaZero = 0;

        for (int i = 1; i <= 10; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + i + ": "));
            soma += nota;

            if (nota > 8) {
                notaMaiorQueOito++;
            }

            if (nota == 0) {
                notaZero++;
            }
        }

        double media = soma / 10;
        JOptionPane.showMessageDialog(null, "Média aritmética das notas: " + media);

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Quantidade de alunos com nota maior que 8: " + notaMaiorQueOito);
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade de alunos com nota zero: " + notaZero);
        }
    }
}
