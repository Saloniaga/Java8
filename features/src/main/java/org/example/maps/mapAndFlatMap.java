package org.example.maps;

import java.util.List;
import java.util.stream.Collectors;

public class mapAndFlatMap {

    public static List<String> CustToEmail(){

        List<Customer> customers = Generator.getAll();
        List<String> emails = customers.stream().map(x->x.getEmail()).sorted().collect(Collectors.toList());
        return emails;
    }
    public static List<String> CustToContact(){
        List<Customer> customers = Generator.getAll();
        List<List<String>> contacts = customers.stream().map(x->x.getContacts()).collect(Collectors.toList());

        List<String> flatContacts = customers.stream().flatMap(x->x.getContacts().stream()).sorted().collect(Collectors.toList());
        return flatContacts;
    }

    public static void main(String[] args) {
        List<String> emails = CustToEmail();
        System.out.println(emails);

        List<String> contacts = CustToContact();
        System.out.println(contacts);
    }
}
