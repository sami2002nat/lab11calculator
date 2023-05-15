package org.example;

public class Calculator {

    float number;

    public Calculator(float number) {
        this.number = number;
    }

    void inmultire(float number2) {
        this.number *= number2;
    }

    void scadere(float number2) {
        this.number -= number2;
    }

    public float getNumber() {
        return number;
    }
}
