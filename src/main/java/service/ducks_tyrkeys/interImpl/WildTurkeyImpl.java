package service.ducks_tyrkeys.interImpl;


import lombok.Data;
import service.ducks_tyrkeys.Turkey;
@Data
public class WildTurkeyImpl implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Goble goble");
    }

    @Override
    public void fly() {
        System.out.println(" I'm flying short distance");
    }
}
