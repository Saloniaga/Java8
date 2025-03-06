package org.example.maps;

import org.example.lambda.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer{
    int id;
    String name;
    String email;
    List<String> contacts;

    public Customer(int id, String name, String email, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}

public class Generator {
    public static List<Customer> getAll(){

        return Stream.of(
                new Customer(1, "saloni", "saloni@aexp.com", Arrays.asList("95871", "26260")),
                new Customer(2, "anshika", "anshika@aexp.com", Arrays.asList("12345", "67890")),
                new Customer(3, "priya", "priya@aexp.com", Arrays.asList("334455", "33779"))
        ).collect(Collectors.toList());

    }
}
