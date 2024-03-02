import javax.swing.JOptionPane;

public class Exerc13{
  public static void main(String[] args){
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio:"));
        
        // O atributo PI da classe Math guarda o valor de pi
        double area = Math.PI * (raio*raio);

        JOptionPane.showMessageDialog(null, "O valor da area é: " + area);
  }
}
