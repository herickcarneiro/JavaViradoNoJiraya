package maranotajava.poo.test;

import maranotajava.poo.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "corolla";
        carro1.modelo = "gl1";
        carro1.ano = 2020;

        carro2.nome = "hilux";
        carro2.modelo = "sport";
        carro2.ano = 2024;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("-------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
