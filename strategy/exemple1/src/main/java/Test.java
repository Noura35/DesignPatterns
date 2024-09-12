import context.Context;
import strategy.Strategy;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {


        Context context=new Context();

        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("choisir le nom de strategy :");
            String nameClass=scanner.nextLine();
            Strategy strategy=(Strategy)Class.forName(nameClass).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.executeApp();
        }



    }

}
