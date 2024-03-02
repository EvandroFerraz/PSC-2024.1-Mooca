import javax.swing.JOptionPane;

public class Exerc12{
  public static void main(String[] args){
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite x1:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite y1:"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite x2:"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite y2:"));
        
        // A função sqrt() da classe Math serve para calcular a raiz quadrada
        // A função pow() da classe Math serve para calcular potencia
        double distancia = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        JOptionPane.showMessageDialog(null, "O valor da distância é: " + distancia);
  }
}
