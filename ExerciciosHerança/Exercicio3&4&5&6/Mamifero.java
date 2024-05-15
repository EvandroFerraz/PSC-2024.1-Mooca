// Classe Mamifero que herda de Animal
public class Mamifero extends Animal {
    // Construtor que repassa o nome e a quantidade de patas para a superclasse
    Mamifero(String nome, int quantidadePatas) {
        super(quantidadePatas, nome);
    }
}
