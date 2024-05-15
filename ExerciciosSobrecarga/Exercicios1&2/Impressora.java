public class Impressora {
    
    // Método exibir para um único float
    public void exibir(float valor) {
        System.out.println(valor);
    }

    // Método exibir para dois floats
    public void exibir(float valor1, float valor2) {
        System.out.println(valor1 + ", " + valor2);
    }

    // Método exibir para um float e uma String, nessa ordem
    public void exibir(float valor, String texto) {
        System.out.println(valor + ", " + texto);
    }

    // Método exibir para uma String e um float, nessa ordem
    public void exibir(String texto, float valor) {
        System.out.println(texto + ", " + valor);
    }

    // Método exibir para três Strings
    public void exibir(String texto1, String texto2, String texto3) {
        System.out.println(texto1 + ", " + texto2 + ", " + texto3);
    }

    // Método exibir para dois ints e uma String, nessa ordem
    public void exibir(int valor1, int valor2, String texto) {
        System.out.println(valor1 + ", " + valor2 + ", " + texto);
    }
}