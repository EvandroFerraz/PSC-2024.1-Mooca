public class Teste {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        
        // Testando os métodos da calculadora científica
        System.out.println("Raiz de 16: " + calculadora.raiz(16));
        System.out.println("Raiz de 25.0: " + calculadora.raiz(25.0));
        System.out.println("Raiz de 36 (String): " + calculadora.raiz("36"));

        System.out.println("Potência de 2^3: " + calculadora.potencia((byte)2, (byte)3));
        System.out.println("Potência de 3.5^2.0: " + calculadora.potencia("3.5", "2.0"));
        System.out.println("Potência de 2^4.0: " + calculadora.potencia(2, 4.0));
    }
}