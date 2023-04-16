import java.util.function.Predicate;

public class PredicateLearning {

 //Predicate is for boolean values to return true or false
    public static void main(String[] args) {
       /* Predicate<Integer> p = (input) ->{
            return input%2 ==0;
        };

       boolean res = p.test(4);
        System.out.println(res);*/

        Predicate<Integer> p1 = (input) ->
        {
          return input <5;
        };

        Predicate <Integer> p2 = (input) ->
                {
                    return input > 4;
                };
         //You can do and or operation here
        System.out.println("And predicate  ");
        System.out.println(p1.and(p2).test(3)); //Predicate chaining

        System.out.println("or predicate  ");
        System.out.println(p1.or(p2).test(3)); //Predicate chaining

        System.out.println("negate will reverse the final result  ");
        System.out.println(p1.or(p2).negate().test(3)); //Predicate chaining
    }
}