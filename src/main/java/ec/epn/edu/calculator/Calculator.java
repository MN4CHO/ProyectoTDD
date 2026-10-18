package ec.epn.edu.calculator;

public class Calculator {
    private int ans;
    public  int addition(int a, int b) {
        return a + b;
    }

    public  int subtraction (int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int multiplication(int a, int b) {
        try {
            // Simula una operación que tarda mucho tiempo en completarse
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a * b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}