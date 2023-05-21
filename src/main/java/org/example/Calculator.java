package org.example;

public class Calculator {

    float number;

    public Calculator(float number) {
        this.number = number;
    }

    Calculator impartire(float number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Impartitorul nu poare fii zero");
        } else
            this.number /= number2;
        return this;
    }

    Calculator impartireNormala(float number2) {
            this.number /= number2;
        return this;
    }

    Calculator adunare(float number2) {
        this.number += number2;
        return this;
    }

    Calculator radical() {
        this.number = (float) Math.sqrt(this.number);
        return this;
    }

    Calculator modulo(float number2) {
        this.number %= number2;
        return this;
    }

    Calculator negativ(float number2) {
        this.number = -number2;
        return this;
    }

    public float getNumber() {
        return this.number;
    }
}
