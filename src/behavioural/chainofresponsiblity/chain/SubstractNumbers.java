package behavioural.chainofresponsiblity.chain;

public class SubstractNumbers implements Chain {

    private Chain nextChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers numbers) {
        if (numbers.getOperation().equalsIgnoreCase("SUBSTRACT")) {
            System.out.println("Substract " + (numbers.getNumber1() - numbers.getNumber2()));
        } else {
            System.out.println("Only supports Add, Substract, Multiply,Divide");
        }
    }
}
