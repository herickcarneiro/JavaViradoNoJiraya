package maranotajava.introducao;

public class EstruturasDeRpetiçãoContinue {
    public static void main(String[] args) {
        double valorTotal = 50000;
        double valorParcela;
        for (int i= (int) valorTotal; i > 0; i--){
            valorParcela = valorTotal/i;
            if(valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+ i + " R$ " + valorParcela);
        }
    }
}
