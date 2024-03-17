import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        // Enunciado: Faça um programa que receba a idade de 10 pessoas e que calcule e mostre a quantidade de pessoas com idade maior ou igual a 18 anos.
        int pessoasMaior18 = 0;
        for (int i = 1; i <= 10; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":"));
            if (idade >= 18) {
                pessoasMaior18++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas com idade maior ou igual a 18 anos: " + pessoasMaior18);
    }
}