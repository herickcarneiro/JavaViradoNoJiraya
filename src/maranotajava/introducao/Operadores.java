package maranotajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // soma, subtração, divisão e multiplicação
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSoma = numero1 + numero2;
        int resultadoMult = numero1 * numero2;
        int resultadoDiv1 = numero1 / numero2;
        float resultadoDiv2 = (float) numero1 / numero2;
        System.out.println(numero2 - numero1);
        System.out.println(numero2 + numero1);
        System.out.println("Valor "+numero2+numero1); // Valor 2010
        System.out.println(resultadoSoma);
        System.out.println(resultadoMult);
        System.out.println(resultadoDiv1);
        System.out.println(resultadoDiv2);

        // % -> resto
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;
        System.out.println(bonus);


    }
}
