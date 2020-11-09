package adapter_costable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImplToPriceCalculator implements Priceable{
    Costeble product;

    @Override
    public double getPrice() {

        return product.getCost();
    }
}
