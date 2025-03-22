package maranotajava.introducaometodos.test;

import maranotajava.introducaometodos.dominio.Estudante;
import maranotajava.introducaometodos.dominio.Impressora;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
