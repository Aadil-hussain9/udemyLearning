package FunctionalInterfaceDemo;

import java.util.function.Predicate;

public class PredicateDemo
{
    public static void main(String[] args) {
        Predicate<Integer> predicate = (num1)->
        {
            return num1%2==0;
        };

        Predicate<Integer> predicate1 = (num1)->
        {
          return num1+2==12;
        };

        Predicate<String> stringPredicate = (name)->
        {
            return name.equals("Aadil");
        };


        if(predicate.test(11))
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

        System.out.println("Negate reversed result "+predicate.negate().test(10));
        System.out.println(predicate.or(predicate1).test(10));
        System.out.println(stringPredicate.test("Aadil"));


    }
}
