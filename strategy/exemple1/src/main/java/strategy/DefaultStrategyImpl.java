package strategy;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void apply() {
        System.out.println(" default strategy");
    }
}
