package ec.epn.edu.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("------Calculator Execute------");

        Calculator c = new Calculator();

        int addition = c.addition(5, 3);
        System.out.println("c.addition(5, 3): " + addition);

        int subtraction = c.subtraction(5, 3);
        System.out.println("c.subtraction(5, 3): " + subtraction);


    }
}
