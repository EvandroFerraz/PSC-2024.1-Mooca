//7. Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import javax.swing.JOptionPane;

public class Exerc7 {
    public static void main(String[] args) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade em anos:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade em meses:"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade em dias:"));

        int idadeTotalDias = anos * 365 + meses * 30 + dias;

        JOptionPane.showMessageDialog(null, "A idade total em dias é: " + idadeTotalDias);
    }
}
