package maranotajava.introducaoclasses.test;

import maranotajava.introducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "José";
        estudante.sexo = 'M';
        estudante.idade = 18;
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
