package FunctionalInterfaceDemo;

import java.util.function.Function;

import static java.util.function.Function.identity;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> percentFunction = (num1)->
        {
            return num1*10;
        };

        Function<Integer,Boolean> checkFunction = (number)->
        {
            return number%2==0?true:false;
        };

        System.out.println(percentFunction.apply(400));

        System.out.println(checkFunction.apply(10));

        System.out.println(checkFunction.compose(percentFunction).apply(3));

        System.out.println(percentFunction.andThen(checkFunction).apply(3));

        Function<String,String> identityFunction = Function.identity();

        Function<Integer,Integer> function1 = e -> e;



        System.out.println(identityFunction.apply("anything"));

        System.out.println(function1.apply(10));


    }
}
