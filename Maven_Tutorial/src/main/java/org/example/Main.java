package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        int res1 = calc.add(10, 20);

        System.out.println("Addition Result: " + res1);
        int res2 = calc.sub(30, 20);

        System.out.println("Addition Result: " + res2);
        int res3 = calc.mul(10, 20);

        System.out.println("Addition Result: " + res3);
        int res4 = calc.div(40, 20);

        System.out.println("Addition Result: " + res4);

    }

}