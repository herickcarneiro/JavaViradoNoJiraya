package maranotajava.introducaometodos.test;

import maranotajava.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Herick");
        pessoa.setIdade(21);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
