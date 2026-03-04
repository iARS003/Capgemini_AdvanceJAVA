package org.example;

public class LetterGrade {

    public String getGrade(Object marks) {

        double score = parseToDouble(marks);

        if (score < 0 || score > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    private double parseToDouble(Object value) {

        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        } else if (value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                throw new InvalidMarksException("Enter valid numeric marks");
            }
        }

        throw new InvalidMarksException("Enter valid numeric marks");
    }
}
