package heranca;

import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Funcionario;
import heranca.empresa.Gerente;

public class Executavel{

    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("Henrique", 123, 61998, 111, "projeto1");
        Engenheiro eng2 = new Engenheiro("Salomao", 456, 22235, 222, "projeto2");
        Gerente g1 = new Gerente("Joao", 789, 61999, 2);
        Diretor d1 = new Diretor("Joaquim", 111, 61988, 1);

        System.out.println(eng1);
        System.out.println(eng2);
        System.out.println(g1);
        System.out.println(d1);

        imprimirFuncionario(g1);
    }

    public static void imprimirFuncionario(Funcionario f){
        System.out.println(f);
    }
}