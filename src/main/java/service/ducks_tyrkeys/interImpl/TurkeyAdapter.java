package service.ducks_tyrkeys.interImpl;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import service.ducks_tyrkeys.Duck;
import service.ducks_tyrkeys.Turkey;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurkeyAdapter implements Duck {

    Turkey turkey;


    @Override
    public void quack() {
      turkey.gobble();
    }

    @Override
    public void fly() {
    for(int i=0; i<5; i++)
    {
        turkey.fly();
    }
    }
}
