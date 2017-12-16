package behavioural.chainofresponsiblity.chain;

public class AddNumbers implements Chain {

    private Chain nextChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers numbers) {

        if (numbers.getOperation().equalsIgnoreCase("ADD")) {
            System.out.println("Add " + (numbers.getNumber1() + numbers.getNumber2()));
        } else {
            nextChain.calculate(numbers);
        }

    }
}
