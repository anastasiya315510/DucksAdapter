package adapter_costable;

import java.util.List;

public class PriceCalculator {
    public double total(List<Priceable> priceableList){
       return priceableList.stream().mapToDouble(Priceable::getPrice).sum();
    }
}
