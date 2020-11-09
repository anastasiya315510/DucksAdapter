package service.ducks_tyrkeys;

import service.ducks_tyrkeys.interImpl.MallardDuckImpl;
import service.ducks_tyrkeys.interImpl.TurkeyAdapter;
import service.ducks_tyrkeys.interImpl.WildTurkeyImpl;

public class DuckTestDrive {


    public static void main(String[] args) {
        MallardDuckImpl duck = new MallardDuckImpl();
        WildTurkeyImpl turkey = new WildTurkeyImpl();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapterImpl(duck);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says");
        testDuck(duck);


        System.err.println("\nTurkey Adapter says");
        testDuck(turkeyAdapter);

        System.out.println("\n Duck adapter says: ");
        testTurkey(duckAdapter);


    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
