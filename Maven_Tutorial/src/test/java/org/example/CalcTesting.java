package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTesting {
//    @ParameterizedTest
//    @CsvFileSource(resources = "/add-data.csv", numLinesToSkip = 1)
//    void addTest(int a, int b, int expected) {
//        Calc calc = new Calc();
//        assertEquals(expected, calc.add(a, b));
//    }
//    @ParameterizedTest
//    @CsvFileSource(resources = "/add-double-data.csv", numLinesToSkip = 1)
//    void add(double a,double b, double c){
//        Calc ca = new Calc();
//        assertEquals(c,ca.addDouble(a,b));
//    }

    @ParameterizedTest
    @CsvSource({
            "abc, 5",
            "10a, 3",
            "@@, 2",
            "5, xyz",
            "hello, world"
    })
    void addInvalidStringTest(String a,String b){
        Calc cal  = new Calc();
        assertThrows(IllegalArgumentException.class,
                ()->cal.add(a,b));
    }
    public double add(Object a,Object b) {
        double num1 = parseToDouble(a);
        double num2 = parseToDouble(b);
        return num1+num2;
    }
    private double parseToDouble(Object value){
        if(value instanceof Number){
                return ((Number)value).doubleValue();
        }if(value instanceof String){
                try{
                    return Double.parseDouble((String)value);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Enter numbers only");
                }
        }
        throw new IllegalArgumentException("Enter numbers only");
    }
}
//void addInvalidStringTest(String a,String b){
//    Calc cal  = new Calc();
//    assertThrows(IllegalArgumentException.class,
//            ()->cal.add(a,b));
//}