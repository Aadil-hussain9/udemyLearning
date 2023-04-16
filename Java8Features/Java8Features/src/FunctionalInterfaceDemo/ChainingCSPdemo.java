package FunctionalInterfaceDemo;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ChainingCSPdemo {
    public static void main(String[] args) {
        Consumer<Boolean> consumer = (input)->
        {
            System.out.println("you are "+input);
        };

        Supplier<Integer> supplier = ()->
        {
            return new Random().nextInt(100);
        };

        Predicate<Integer> predicate = (num)->
        {
            return (supplier.get()+num)>10;
        };



        consumer.accept(predicate.test(supplier.get()));

        boolean answer = predicate.test(supplier.get());

        consumer.accept(answer);
    }
}
