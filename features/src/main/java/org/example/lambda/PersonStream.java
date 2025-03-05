package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class PersonStream {

    public List<Person> getPersons(){

        List<Person> persons=new ArrayList<>();
        persons.add(new Person("shalu", 24, 50000.0));
        persons.add(new Person("chirag", 25, 150000.0));
        persons.add(new Person("nishi", 22, 80000.0));
        return persons;
    }
}
