package maranotajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadoComprarBebidaAcoolica = idade >17;
        double salario = 6000;
        String mensagemDoar = "Tenho condições de doar";
        String mensagemNaoDoar = "Nao tenho condições de doar";
        String resultado;

        /*
        if(isAutorizadoComprarBebidaAcoolica){
            System.out.println("Autorizado a comprar bebida");
        }
        if(!isAutorizadoComprarBebidaAcoolica){
            System.out.println("Não autorizado a comprar bebida");
        }
        */
        // (condição) ? verdadeiro : falso
        resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
