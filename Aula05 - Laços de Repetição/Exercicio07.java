import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que leia a nota de 10 alunos e, ao final, escreva a maior nota, a menor nota e a média aritmética da turma.
        
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno 1:"));
        double maiorNota = nota;
        double menorNota = nota;
        double somaNotas = nota;

        for (int i = 2; i <= 10; i++) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + i + ":"));
            somaNotas += nota;
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double mediaNotas = somaNotas / 10;

        JOptionPane.showMessageDialog(null, "Maior nota: " + maiorNota + "\n" +
        "Menor nota: " + menorNota + "\n" +
        "Média aritmética da turma: " + mediaNotas);
    }
}