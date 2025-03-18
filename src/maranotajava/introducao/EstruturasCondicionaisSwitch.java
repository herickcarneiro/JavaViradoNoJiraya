package maranotajava.introducao;
public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando o 1 como domingo
        byte dia = 10;
        switch (dia) {
            default:
                System.out.println("Opção Inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

        // Utilizando switch e dados os valore de 1 a 7, imprima se é dia útil ou fim de semana
        // Considere 1 como domingo

        byte newDia = 2;
        switch(newDia){
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
        }
    }
}
