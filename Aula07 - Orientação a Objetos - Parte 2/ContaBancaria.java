public class ContaBancaria {
    private String titular;
    private double saldo;
    
    // Método Construtor
    // Serve para criar um objeto já com valores iniciais em
    // seus atributos
    public ContaBancaria(String novoTitular, double novoSaldo){
        titular = novoTitular;
        saldo = novoSaldo;
    }
    
    // retorna o valor de um atributo
    public String getTitular(){
        return titular;
    }
    
    // atualiza o valor de um atributo
    public void setTitular(String novoTitular){
        titular = novoTitular;
    }
    
    // Alt + Insert
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // de nossa autoria
    public void depositar(double acrescimo){
        saldo = saldo + acrescimo;
        System.out.println("Depósito realizado");
        System.out.println("Saldo: " + saldo);
    }
    public void sacar(double saque){
        if(saldo >= saque){
            saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo: " + saldo);
        }else{ // saldo < saque
            System.out.println("Não existe saldo suficiente.");
        }
    }
}
