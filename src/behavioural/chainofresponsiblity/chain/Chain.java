package behavioural.chainofresponsiblity.chain;

public interface Chain {
    void setNextChain(Chain nextChain);

    void calculate(Numbers numbers);
}
