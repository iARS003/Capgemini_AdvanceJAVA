package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "success, 10, 20, 30",
            "successOperation, 5, 7, 12"
    })
    void successTest(String s,double a,double b,double c){
        OperationService service = new OperationService();
        assertEquals(c,service.process(s,a,b),0.0001);
    }

    @ParameterizedTest
    @CsvSource({
            "error, 10, 20",
            "errorOperation, 5, 7"
    })
    void failureTest(String s,double a,double b){
        OperationService service = new OperationService();

        assertThrows(OperationException.class,
                ()->service.process(s,a,b));
    }
}
