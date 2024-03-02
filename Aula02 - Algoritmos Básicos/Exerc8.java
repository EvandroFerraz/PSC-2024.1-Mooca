//8 - Ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

import javax.swing.JOptionPane;

public class Exerc8 {
    public static void main(String[] args) {
        int totalEleitores = Integer.parseInt(JOptionPane.showInputDialog("Digite o número total de eleitores:"));
        int votosBrancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos brancos:"));
        int votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos nulos:"));
        int votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos válidos:"));

        double percentualBrancos = votosBrancos / totalEleitores * 100;
        double percentualNulos = votosNulos / totalEleitores * 100;
        double percentualValidos = votosValidos / totalEleitores * 100;

        JOptionPane.showMessageDialog(null, "Percentual de votos brancos: " + percentualBrancos + "%\n" +
                                            "Percentual de votos nulos: " + percentualNulos + "%\n" +
                                            "Percentual de votos válidos: " + percentualValidos + "%");
    }
}
