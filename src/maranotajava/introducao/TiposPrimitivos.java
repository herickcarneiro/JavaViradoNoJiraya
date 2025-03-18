package maranotajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, char, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;

        // String = tipo de referência

        String nome = "Herick";

        System.out.println("A idade é "+ idade);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println(verdadeiro);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(caractere);
        System.out.println(nome);
    }
}

