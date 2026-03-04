package org.example;

public class Calc {
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return  a-b;
    }
    int mul(int a,int b){
        return  a*b;
    }
    int div(int a,int b){
        return  a/b;
    }
    public <T extends Number> double addDouble(T a,T b){
        return a.doubleValue() + b.doubleValue();
    }

    public void add(String number, String number1) {
        System.out.println(number+number1);
    }
}
