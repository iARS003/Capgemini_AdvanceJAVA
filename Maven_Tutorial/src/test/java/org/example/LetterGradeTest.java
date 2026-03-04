package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LetterGradeTest {

    @ParameterizedTest
    @CsvSource({
            "95, A",
            "85, B",
            "75, C",
            "65, D",
            "40, F",
            "90, A",
            "80, B",
            "70, C",
            "60, D",
            "0, F"
    })
    void validGradeTest(double marks, String expectedGrade) {

        LetterGrade grade = new LetterGrade();
        assertEquals(expectedGrade, grade.getGrade(marks));
    }

    @ParameterizedTest
    @CsvSource({
            "-10",
            "120"
    })
    void invalidRangeTest(double marks) {

        LetterGrade grade = new LetterGrade();

        assertThrows(InvalidMarksException.class,
                () -> grade.getGrade(marks));
    }

    @ParameterizedTest
    @CsvSource({
            "abc",
            "90a",
            "' '"
    })
    void invalidInputTest(String marks) {

        LetterGrade grade = new LetterGrade();

        assertThrows(InvalidMarksException.class,
                () -> grade.getGrade(marks));
    }
}