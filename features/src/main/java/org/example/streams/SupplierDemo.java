package org.example.streams;

import java.util.Arrays;
import java.util.List;

//public class MySuplier implements Supplier{
//    @Override
//    public String get() {
//        return "test string";
//    }
//}

public class SupplierDemo {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

//        findAny() returns an Optional<Integer>.
//        orElseGet(() -> "nothing found!") should return an Integer, but you are returning a String.
//        System.out.println(numbers.stream().findAny().orElseGet(() -> "nothing found!"));

        System.out.println(numbers.stream().findAny().orElseGet(() -> -1));

        List<String> emptyList = Arrays.asList();
        System.out.println(emptyList.stream().findAny().orElseGet(()->"nothing found!"));
    }
}
