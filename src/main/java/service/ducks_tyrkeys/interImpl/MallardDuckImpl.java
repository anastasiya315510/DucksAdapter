package service.ducks_tyrkeys.interImpl;


import lombok.Data;
import service.ducks_tyrkeys.Duck;
@Data
public class MallardDuckImpl implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Flying>>>>>>>>>>>>>>");
    }
}
