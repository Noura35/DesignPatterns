package Decorateurs;

import composants.Boisson;

public class Caramel extends Decorteur{

    public Caramel(Boisson b1) {
        super(b1);
    }

    @Override
    public String getDesc() {
        return  b1.getDesc()+" au Caramel " ;
    }

    @Override
    public double cout(){
        return  3.2 + b1.cout();
    }

}
