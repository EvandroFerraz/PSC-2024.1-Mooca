// Classe Oviparo
public class Oviparo extends Animal{
    // herda nome e quantidade de patas
    String dieta;
    int quantidadeOvos;
    
    // Construtor padrão
    Oviparo() {
    }

    // Construtor que recebe a dieta e a quantidade de ovos
    Oviparo(String dieta, int quantidadeOvos) {
        this.dieta = dieta;
        this.quantidadeOvos = quantidadeOvos;
    }
}