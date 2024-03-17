import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        // Enunciado: Escreva um programa que receba a idade de 10 pessoas e que calcule e mostre a quantidade de pessoas em cada faixa etária.
        int ate15Anos = 0;
        int de16a30Anos = 0;
        int de31a45Anos = 0;
        int maiorQue45Anos = 0;

        for (int i = 1; i <= 10; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":"));
            if (idade <= 15) {
                ate15Anos++;
            } else if (idade <= 30) {
                de16a30Anos++;
            } else if (idade <= 45) {
                de31a45Anos++;
            } else {
                maiorQue45Anos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Até 15 anos: " + ate15Anos + "\n" +
                                              "De 16 a 30 anos: " + de16a30Anos + "\n" +
                                              "De 31 a 45 anos: " + de31a45Anos + "\n" +
                                              "Maior que 45 anos: " + maiorQue45Anos);
    }
}