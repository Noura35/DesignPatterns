package Decorateurs;

import composants.Boisson;

public class Chocolat extends Decorteur{

    public Chocolat(Boisson b1) {
        super(b1);
    }

    @Override
    public String getDesc() {
        return  b1.getDesc()+" au chocolat " ;
    }

    @Override
    public double cout(){
        return  1.2 + b1.cout();
    }

}
