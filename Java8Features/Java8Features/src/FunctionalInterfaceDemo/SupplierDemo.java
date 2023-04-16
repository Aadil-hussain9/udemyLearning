package FunctionalInterfaceDemo;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<LocalTime> supplier = ()->
        {
          return LocalTime.now();
        };

        Supplier<String> stringSupplier = ()->
        {
          return "Hey Adil";
        };

        System.out.println(supplier.get());

        System.out.println(stringSupplier.get());

    }
}
