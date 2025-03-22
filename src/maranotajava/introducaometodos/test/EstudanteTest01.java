package maranotajava.introducaometodos.test;

import maranotajava.introducaometodos.dominio.Estudante;
import maranotajava.introducaometodos.dominio.Impressora;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Impressora impressora = new Impressora();

        estudante01.nome = "João";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);
    }
}
