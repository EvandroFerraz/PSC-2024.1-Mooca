public class TesteAnimal {
    public static void main(String[] args) {
        // Instanciando um Cachorro
        Cachorro cachorro = new Cachorro("Rex");
        
        // Instanciando um Gato
        Gato gato = new Gato("Whiskers");
        
        // Exibindo informações sobre o cachorro
        System.out.println("Cachorro:");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Quantidade de patas: " + cachorro.quantidadePatas);
        System.out.println();
        
        // Exibindo informações sobre o gato
        System.out.println("Gato:");
        System.out.println("Nome: " + gato.nome);
        System.out.println("Quantidade de patas: " + gato.quantidadePatas);
    }
}
