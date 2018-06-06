package ch1;

public class Calculator {
    public int sum(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10,20) == 30);
        System.out.println(calculator.sum(1,2) == 3);
        System.out.println(calculator.sum(-10,20) == 10);
        System.out.println(calculator.sum(0,0) == 0);
    }
}
