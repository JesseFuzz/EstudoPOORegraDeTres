package org.example;

public class CalcExample {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    private double resultado;

    public CalcExample(double x1, double x2, double y1) {
        this.setX1(x1);
        this.setX2(x2);
        this.setY1(y1);
        this.resultado = calculate();
    }

    public double calculate(){
        this.resultado = (this.getX2()*this.getY1())/this.getX1();
        return this.resultado;
    }

    public String imprimeResultado(){
        return "Resultado: " + this.x1 + " está para " + this.x2 + " assim como "+ this.y1 +"\n" +
                "está para: " + this.calculate() + "\n";
    }


    @Override
    public String toString() {
        return "CalcExample{" +
                "resultado=" + resultado +
                '}';
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }
}
