import Decorateurs.Caramel;
import Decorateurs.Chocolat;
import composants.Boisson;
import composants.Expresso;
import composants.Sumatra;

public class Test {

    public static void main(String[] args){

        Boisson b1;
        b1=new Sumatra();
        System.out.println(b1.getDesc());
        System.out.println(b1.cout());
        System.out.println("-----------------");

        b1=new Chocolat(b1);
        System.out.println(b1.getDesc());
        System.out.println(b1.cout());
        System.out.println("----------------");

        b1=new Caramel(b1);
        System.out.println(b1.getDesc());
        System.out.println(b1.cout());

        b1=new Chocolat(b1);
        System.out.println(b1.getDesc());
        System.out.println(b1.cout());
        System.out.println("----------------");


    }

}
