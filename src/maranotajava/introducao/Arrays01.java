package maranotajava.introducao;

public class Arrays01 {
    public static void main(String[] args) {
        // array não é um tipo primitivo, mas sim de referência
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades); //Retorna um endereço de memória
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
