package service.ducks_tyrkeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DuckAdapterImpl implements Turkey {
    Duck duck;
    @Override
    public void gobble() {
    duck.quack();
    }

    @Override
    public void fly() {
    duck.fly();
    }
}
