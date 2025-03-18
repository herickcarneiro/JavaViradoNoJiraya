package maranotajava.introducao;

/*
Prática

Crie variáveis para os campos decritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Goku";
        String endereço = "Rua do Rio, número 200";
        float salário = 2000F;
        String dataRecebimentoSalario = "05/03/2025";
        String relatorio = "Eu " +nome+", morando no endereço " +endereço+", confirmo que recebi o salário de "+salário+", na data "+ dataRecebimentoSalario+ ".";
        System.out.println(relatorio);
    }
}
