// 1- Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor do que o número real, o programa deve imprimir uma mensagem dizendo 
//isso ao usuário. Caso contrário, o programa somente termina.

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        int numInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        double numReal = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        
        if (numInteiro < numReal) {
            JOptionPane.showMessageDialog(null, "O número inteiro é menor que o número real.");
        }
    }
}
