package com.company;


public class Calc {
    private float result = 0.0F;

    public Calc() {
    }

    public float getResult() {
        return this.result;
    }

    public float divide(int a) {
        this.result /= (float)a;
        return this.result;
    }

    public float add(int a) {
        this.result += (float)a;
        return this.result;
    }

    public float deduct(int a) {
        this.result -= (float)a;
        return this.result;
    }

    public float multiple(int a) {
        this.result *= (float)a;
        return this.result;
    }
}
