// Classe Animal
public class Animal {
    String nome;
    int quantidadePatas;

    // Construtor padrão
    Animal() {
    }

    // Construtor que recebe apenas o nome
    Animal(String nome) {
        this.nome = nome;
    }

    // Construtor que recebe o número de patas e o nome
    Animal(int quantidadePatas, String nome) {
        this.nome = nome;
        this.quantidadePatas = quantidadePatas;
    }
}