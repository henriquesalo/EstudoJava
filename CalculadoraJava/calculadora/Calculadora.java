package calculadora;

public class Calculadora{

    private int a;
    private int b;
    private String operador;

    public int getA(){
        return this.a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return this.b;
    }

    public void setB(int b){
        this.b = b;
    }

    public String getOperador(){
        return this.operador;
    }

    public void setOperador(String op) throws Exception {
        Boolean err = true;
        switch (op) {
            case "+":
                err = false;
                break;
            case "-":
                err = false;
                break;
            case "*":
                err = false;
                break;
            case "/":
                err = false;
                break;
        }

        if(err){
            throw new Exception("Operador Inválido!");
        }

        this.operador = op;
    }

    public int operar(){
        int ret = 0;
        switch (this.operador) {
            case "+":
                ret = this.a + this.b;
                break;
            case "-":
                ret = this.a - this.b;
                break;
            case "*":
                ret = this.a * this.b;
                break;
            case "/":
                ret = this.a / this.b;
                break;
        }
        return ret;
    }
}