package FunctionalInterfaceDemo;

import java.util.Arrays;
import java.util.OptionalDouble;

@FunctionalInterface
 interface Calculate{
     int sum(int a , int b);
     default OptionalDouble average(int[] a)
     {
        return Arrays.stream(a).average();
     }

 }
public class FInterfaceExample implements Calculate {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        FInterfaceExample fInterfaceExample = new FInterfaceExample();

        Calculate calculate = (a,b)->
        {
            return a+b;
        };


        System.out.println(fInterfaceExample.sum(5,10));
        System.out.println(fInterfaceExample.average(new int[]{1, 2, 3}));

        System.out.println(calculate.sum(4,5));

        System.out.println(calculate.average(new int[]{1,2,3}).getAsDouble());

    }


}
