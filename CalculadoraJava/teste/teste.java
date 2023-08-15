package teste;

import calculadora.Calculadora;

public class teste {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        calc.setA(3);
        calc.setB(5);
        try {
            calc.setOperador("+");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(calc.operar());
    }
}
