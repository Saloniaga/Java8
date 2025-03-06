package org.example.maps;

import java.util.HashMap;
import java.util.Map;

public class SortMap {
    public static Map<Integer,String> createMap(){

        Map<Integer,String> map=new HashMap<>();
        map.put(1, "saloni");
        map.put(2, "nishi");
        map.put(3, "shalu");
        map.put(4,"chirag");
        map.put(5,"laksh");
        return map;
    }

    public static void main(String[] args) {
        Map<Integer,String> map=createMap();

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x-> System.out.println(x.getKey()+": "+x.getValue()));
    }
}
