import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.joining;


public class RandomPractice {

    public static void main(String[] args) {
//        List <Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
//        Consumer<List<Integer>> c1 =  accept -> System.out.println(accept);
//        c1.accept(integerList);
//        integerList.forEach(c1);
//        Function<String,String> function = (input)->input.toUpperCase();
//        Function<String,String> function1 = (input)->input.concat("dar");
//
//        System.out.println(function.compose(function1).apply("adil"));

//        Function<String,String> function = (input) -> input.toUpperCase();
//        System.out.println(function.apply("Hello"));
//
//        Function<String,String> function1 = String::toUpperCase;
//        System.out.println(function1.apply("hello"));

        List<Integer> integerList1 = Arrays.asList(1,2,3,4,5,6);
//        integerList1.stream().peek(
//            System.out::println
//         ).filter((i) ->{return i<=3;}).forEach(System.out::println);

//       int sum =  integerList1.stream().reduce(1,(a,b)->a+b);
//        System.out.println(sum);

//        Optional<Integer> sum =  integerList1.stream().reduce((a, b)->a+b);
//        System.out.println(sum.get());
//        System.out.println(sum.isPresent());
//        int  maxi =  integerList1.stream().reduce(0,(x, y) -> x>y?x:y);
//        System.out.println(maxi);

//        integerList1.stream().limit(3).forEach(System.out::println);

//        integerList1.stream().skip(3).forEach(System.out::println);

//        boolean anyMatch  = integerList1.stream().anyMatch((p)->p>2);
//        System.out.println(anyMatch);

//        boolean anyMatch  = integerList1.stream().allMatch((p)->p>2);
//        System.out.println(anyMatch);

//        boolean anyMatch  = integerList1.stream().noneMatch((p)->p>2);
//        System.out.println(anyMatch);

//        Optional<Integer> anyMatch  = integerList1.parallelStream().findAny();
//        System.out.println(anyMatch.get());

//        Stream<String> stringStream = Stream.of("Adil","dar");
//        stringStream.forEach(System.out::println);

//        Stream<Integer> stringStream = Stream.iterate(1,x->x*2);
//        stringStream.limit(10).forEach(System.out::println);

//        Supplier<Integer> stringStream = new Random()::nextInt;
//
//        Stream.generate(stringStream).limit(10).forEach(System.out::println);

//       Long count =  integerList1.stream().collect(counting());
//
//        System.out.println(count);

          List<String> stringList = Arrays.asList("hello","dar");

        System.out.println(stringList.stream().collect(joining("-")).toUpperCase());

    }
}
