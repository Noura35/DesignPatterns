package composants;

import lombok.Getter;

@Getter

public abstract class Boisson {

    protected String desc;

    public abstract double cout();

}
