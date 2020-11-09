package adapter_costable;

import java.util.List;
import java.util.Random;

public class ProductRepo {
    private  List<Costeble> cache = List.of(new Chear(), new Table());

    public Costeble getProduct(){
        return cache.get(RandomUtil.getRandomInRange(0, cache.size()));
    }
}
