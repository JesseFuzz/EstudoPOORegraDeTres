package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CalcExample calcExample1 = new CalcExample(1, 2, 3);
        //System.out.println(calcExample1.imprimeResultado());
        System.out.println(calcExample1);

        CalcExample calcExample2 = new CalcExample(3, 4, 5);
        //System.out.println(calcExample2.imprimeResultado());
        System.out.println(calcExample2);

        CalcExample calcExample3 = new CalcExample(23, 3, 4);
        System.out.println(calcExample3);


        Historic histGeral = new Historic(1, LocalDateTime.now());
        histGeral.addCalcExample(calcExample2);
        histGeral.addCalcExample(calcExample1);
        histGeral.addCalcExample(calcExample3);
        System.out.println(histGeral);

    }

}