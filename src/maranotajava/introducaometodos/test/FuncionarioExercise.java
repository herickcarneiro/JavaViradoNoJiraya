package maranotajava.introducaometodos.test;

import maranotajava.introducaometodos.dominio.Funcionario;

public class FuncionarioExercise {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Bruno";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{2000, 3000, 4000};

        funcionario.imprime();
    }
}
