package behavioural.chainofresponsiblity.chain;

public class ChainDemo {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(10, 2, "pow");

        Chain addition = new AddNumbers();
        Chain sub = new SubstractNumbers();
        Chain mult = new MultiplyNumbers();
        Chain divide = new DivideNumbers();

        addition.setNextChain(mult);
        mult.setNextChain(divide);
        divide.setNextChain(sub);

        addition.calculate(numbers);
    }
}
