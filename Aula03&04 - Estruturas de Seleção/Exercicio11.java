/*
11. Faça um programa que lê os seguintes dados:
- código de estado (um inteiro de 1 a 5)
- valor inicial de carga
Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras.
Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15%.
*/

import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args) {
        int codigoEstado = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de estado (1 a 5): "));
        double valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor inicial da carga: "));

        double valorFinal;
        if (codigoEstado == 2 || codigoEstado == 5) {
            valorFinal = valorInicial - (valorInicial * 0.12);
        } else if (codigoEstado == 1 || codigoEstado == 3 || codigoEstado == 4) {
            valorFinal = valorInicial - (valorInicial * 0.15);
        } else {
            JOptionPane.showMessageDialog(null, "Código de estado inválido. Programa encerrado.");
            return; // Encerra o programa se o código de estado for inválido
        }

        JOptionPane.showMessageDialog(null, "O valor final da carga é: " + valorFinal);
    }
}
