package FunctionalInterfaceDemo;

import java.util.Random;
import java.util.function.*;

public class OtherUserfulInterfaces {

    public static void main(String[] args) {
        BiConsumer<String,Integer>
                biConsumer = (name,rank)->
        {
            System.out.println(name + " You have rank "+rank);
        };

        biConsumer.accept("Aadil",1);


        BiPredicate<Integer,Integer> biPredicate =
                (num1,num2)->
                {
                    return num1>num2;
                };

        System.out.println(biPredicate.test(100,20));

        BiFunction<Integer,Integer,Boolean> biFunction =
                (num1,num2)->
                {
                    return num1>num2?true:false;
                };

        System.out.println(biFunction.apply(10,20));


        UnaryOperator<Integer> unaryOperator
                = (num1)->
        {
            return num1+10;
        };

        System.out.println(unaryOperator.apply(10));

        BinaryOperator <Integer> binaryOperator =(num1,num2)->
                {
                        return num1+num2;
                };

        System.out.println(binaryOperator.apply(20,10));


        IntConsumer intConsumer = e-> System.out.println("Hello "+e);
        intConsumer.accept(10);

        DoubleConsumer doubleConsumer = e-> System.out.println("hello "+e);
        doubleConsumer.accept(32.8);

        LongSupplier longSupplier = ()->new Random().nextLong(10);

        System.out.println(longSupplier.getAsLong());
    }
}
