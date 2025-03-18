package maranotajava.introducao;

public class ExercicioEstruturasCondicionais {
    public static void main(String[] args) {
        double salarioAnual = 80000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double imposto;

        if(salarioAnual <= 34712){
            imposto = salarioAnual * primeiraFaixa;
        } else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            imposto = salarioAnual * segundaFaixa;
        } else {
            imposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("O imposto pago será "+ imposto);
    }
}
