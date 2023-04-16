package FunctionalInterfaceDemo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) ->
        {
            System.out.println("Hello "  +name);
        };

        Consumer<String> integerConsumer = (name)->
        {
            System.out.println("you are great " +name);
        };

        consumer.andThen(integerConsumer).accept("adil");


        BiConsumer<String ,Integer> biConsumer = (name,marks)->
        {
            System.out.println("hello " +name+ " you have marks = "+marks);
        };

        biConsumer.accept("adil",780);

    }
}
