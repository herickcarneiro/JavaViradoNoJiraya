package maranotajava.poo.test;

import maranotajava.poo.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Willian";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
