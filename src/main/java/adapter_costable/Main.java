package adapter_costable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        List<Costeble> list = Stream.generate(productRepo::getProduct)
                .limit(20).collect(Collectors.toList());
        PriceCalculator calculator = new PriceCalculator();
        double sum = list.stream().map(m -> new ImplToPriceCalculator(m)).mapToDouble(m -> m.getPrice()).sum();
        System.out.println(sum);

    }
}
