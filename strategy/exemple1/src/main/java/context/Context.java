package context;

import lombok.NoArgsConstructor;
import lombok.Setter;
import strategy.DefaultStrategyImpl;
import strategy.Strategy;

@Setter
@NoArgsConstructor


public class Context {

    private Strategy strategy=new DefaultStrategyImpl();

    public void executeApp(){
        strategy.apply();
    }

}
