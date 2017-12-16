package behavioural.chainofresponsiblity.chain;

public class DivideNumbers implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;

    }

    @Override
    public void calculate(Numbers numbers) {
        if (numbers.getOperation().equalsIgnoreCase("DIVIDE")) {
            System.out.println("Divide " + (numbers.getNumber1() / numbers.getNumber2()));
        } else {
            nextChain.calculate(numbers);
        }

    }
}
