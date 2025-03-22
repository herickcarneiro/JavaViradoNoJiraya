package maranotajava.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
        for(double salario : salarios){
            System.out.println(salario + " ");
        }
        mediaSalario();
    }

    public void mediaSalario(){
        if (salarios == null){
            return;
        }
        double mediaSalario = 0;
        for(double num : salarios){
            mediaSalario += num;
        }
        mediaSalario /= salarios.length;
        System.out.println(mediaSalario);
    }
}
