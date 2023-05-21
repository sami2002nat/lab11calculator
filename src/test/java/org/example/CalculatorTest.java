package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    float number;

    private final Calculator calculator = new Calculator(10);

    @Test
    void impartire() {

        Exception exception = assertThrows(ArithmeticException.class,
                () -> calculator.impartire(0));
        assertEquals("Impartitorul nu poare fii zero",exception.getMessage());
    }
    void impartiereNormala() {
        new Calculator(4);
        assertEquals( calculator.impartire(2),2);
    }
    @Test
    void adunare() {

        new Calculator(4);
        calculator.adunare(2);
        assertEquals(calculator.adunare(2),6);
    }

    @Test
    void radical() {

        Calculator c =new Calculator(-4);
        Exception exception = assertThrows(ArithmeticException.class, () -> c.radical());
        assertEquals("Radicalul dintr-un numar negativ nu este definit",exception.getMessage());
    }

    @Test
    void modulo() {

        Calculator c =new Calculator(2);
        Exception exception = assertThrows(ArithmeticException.class, () -> c.modulo(0));
        assertEquals("Impartirea la zero nu se poate",exception.getMessage());
    }

    @Test
    void negativ() {
    }

    @Test
    void getNumber() {
    }
}