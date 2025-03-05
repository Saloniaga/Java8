package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class MyPredicate implements Predicate<Integer>{
//    @Override
//    public boolean test(Integer integer) {
//        return integer%2==0;
//    }
//}
public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> myPredicate = x -> x%2==0;
        System.out.println(myPredicate.test(55));

        List<Integer> numbers1 = Arrays.asList(1,2,5,7,0,34,66,87);
        //filter method uses Predicate functional interface
        numbers1.stream().filter(myPredicate);

        List<Integer> numbers2 = Arrays.asList(1,2,5,7,0,34,66,87);
        numbers2.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));


    }
}
