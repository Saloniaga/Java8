package org.example.lambda;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Traditionally
you create a functional interface,
you implement it
then write main function where you use the implementation

with lambda exp,
you dont have to implement your functional interfaces separately
write the impl where you're using it
 */

public class Sort {
    public static void main(String[] args) {

        //accept list of Persons, sort them according to salary
        List<Person> persons=new PersonStream().getPersons();

        //method 1: creating object of custom comparator class
        Collections.sort(persons, new NameComparator());
        System.out.println(persons);

        //method 2: on the basis of salary
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
        System.out.println(persons);

        //method 3: on the basis of age using lambda expression
        //Java 1.2
        Collections.sort(persons, (a,b)->a.getAge().compareTo(b.getAge()));
        System.out.println(persons);

        //JAVA 8
        persons.sort(Comparator.comparing(Person::getName));
        System.out.println(persons);

    }
}

class NameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}