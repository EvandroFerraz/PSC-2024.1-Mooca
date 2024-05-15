public class CalculadoraCientifica {
    
    // Método raiz para um inteiro
    public double raiz(int numero) {
        return Math.sqrt(numero);
    }

    // Método raiz para um double
    public double raiz(double numero) {
        return Math.sqrt(numero);
    }

    // Método raiz para uma String (convertida para double)
    public double raiz(String numero) {
        double num = Double.parseDouble(numero);
        return Math.sqrt(num);
    }

    // Método potência para dois bytes
    public double potencia(byte a, byte b) {
        return Math.pow(a, b);
    }

    // Método potência para duas Strings (convertidas para double)
    public double potencia(String s1, String s2) {
        double base = Double.parseDouble(s1);
        double expoente = Double.parseDouble(s2);
        return Math.pow(base, expoente);
    }

    // Método potência para um inteiro e um double
    public double potencia(int a, double b) {
        return Math.pow(a, b);
    }
}