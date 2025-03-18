package maranotajava.introducao;

public class Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Jose";
        nomes[1] = "Aldo";
        nomes[2] = "Maria";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        // nomes = new String[3]; isso faz com que a variável faça referência a outro objeto em memória e perca a outra
    }
}
