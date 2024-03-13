/*
Exercício 6: Escreva um programa que lê dois valores reais.
O primeiro valor é o saldo de uma conta bancária e o segundo é um valor que o usuário deseja sacar desta conta.
Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o programa deve mostrar o saldo remanescente.
Caso contrário, deve informar o usuário que não foi possível realizar o saque.
*/

import javax.swing.JOptionPane;

public class Exercicio06 {

    public static void main(String[] args) {
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta bancária: "));
        double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
        
        // Verificando se é possível efetuar o saque
        if (saque <= saldo) {
            saldo -= saque; // saldo = saldo - saque, Deduzindo o valor do saque do saldo
            JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso. Saldo remanescente: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque.");
        }
    }
}
