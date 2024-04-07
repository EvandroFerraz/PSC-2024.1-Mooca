import javax.swing.JOptionPane;

public class TesteContaBancaria {
    public static void main(String[] args){
        //2.1. Instancia dois objetos da 
        // classe ContaBancaria.  
        String titular =  
         JOptionPane.showInputDialog("Digite o titular da " +
                 "conta 1:");
        double saldo = Double.parseDouble(
          JOptionPane.showInputDialog("Digite o saldo da " +
                  "conta 1:")
        );       
        ContaBancaria conta1 = new ContaBancaria(titular,saldo);
        
        titular = 
         JOptionPane.showInputDialog("Digite o titular da " +
                 "conta 2:");
        saldo = Double.parseDouble(
          JOptionPane.showInputDialog("Digite o saldo da " +
                  "conta 2:")
        );
        ContaBancaria conta2 = new ContaBancaria(titular,saldo);
        
        //2.3. Chama cada um dos métodos definidos na 
        // classe ContaBancaria.
        conta2.depositar(1000);
        conta2.sacar(500); 
        
        //2.4 Exibe os valores dos atributos das contas 
        // bancárias utilizando os métodos getters.
        System.out.println("Conta1\n Saldo: " + conta1.getSaldo() +
                " Titular: " + conta1.getTitular());
        
        System.out.println("Conta2\n Saldo: " + conta2.getSaldo() +
                " Titular: " + conta2.getTitular());
    }
}
