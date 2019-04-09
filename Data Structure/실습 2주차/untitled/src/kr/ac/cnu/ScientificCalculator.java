package kr.ac.cnu;

public class ScientificCalculator extends Calculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public double log(int a, int b) {
        return a * Math.log(b);
    }

    @Override
    public double square(int a, int b) {
        return Math.pow(a, b);
    }

}
