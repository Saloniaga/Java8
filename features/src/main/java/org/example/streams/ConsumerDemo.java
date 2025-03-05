package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//ek Consumer functional interface hota hai
//it has accept method that accepts a parameter and returns nothing
//public class MyConsumer implements Consumer<Integer>{
//    @Override
//    public void accept(Integer integer) {
//        System.out.println("accepted: "+integer);
//    }
//}
public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> myConsumer = (x) -> System.out.println("accepted: "+x);
        myConsumer.accept(222);

        List<Integer> numbers= Arrays.asList(10, 20, 30, 44, 58, 83);

        //forEach method uses Consumer functional interface
        //so we can pass the reference of our consumer
        numbers.forEach(myConsumer);

        //or write a lambda exp there itself
        numbers.forEach(x -> System.out.println("printing "+x));

    }
}
