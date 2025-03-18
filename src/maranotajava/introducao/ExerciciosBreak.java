package maranotajava.introducao;

public class ExerciciosBreak {
    public static void main(String[] args) {
        // Dado um valor de um carro descruba em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 50000;
        double valorParcela;
        for (int i=1; i <= valorTotal; i++){
            valorParcela = valorTotal/i;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ i + " R$ " + valorParcela);
        }
    }
}

