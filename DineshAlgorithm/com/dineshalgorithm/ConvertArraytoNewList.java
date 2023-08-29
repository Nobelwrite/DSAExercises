package com.dineshalgorithm;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Comparator;


public class ConvertArraytoNewList {
    private static String[] names = {"Marim", "Mary", "Mrty", "Mike", "Damilola"};


    public ConvertArraytoNewList(String[] names) {
        this.names = names;

    }

    public void setNames(String[] names) {
        this.names = names;


    }
    public static String[] getNames() {
        return names;
        
    }

    public static void main(String[] args) {

       // ConvertArraytoNewList convertArraytoNewList = new ConvertArraytoNewList();


        List<String> oruka = Arrays.asList(names);
            System.out.println(oruka);


        Predicate<String> charLength = name -> name.length() < 6;
        for (String name : names) {
            System.out.println(name + ": " + charLength.test(name));
        }

        Function<String, String> upperCase = String::toUpperCase;

        //System.out.println(upperCase);

        List<String> upperCaseName = oruka.stream().map(upperCase).collect(Collectors.toList());
        System.out.println(upperCaseName);


        Predicate<String> Shorten = name -> name.contains("Ma");

        List<String> shorten = oruka.stream().filter(Shorten).collect(Collectors.toList());

        System.out.println(shorten);


        //oruka.stream().sorted(oruka, new oruka);

        //oruka.stream().sorted((s1, s2) -> s1.getNames().compareTo(s2.getNames)).forEach(System.out::println);


//        for(String nam: names) {
//
//            System.out.println(nam);
//
//
//        }

        //oruka.stream().sorted(Comparator.comparing(ConvertArraytoNewList:: getNames)).forEach(System.out::println);

            Collections.sort(oruka);

            System.out.println("After all is sort: ");

            for(String nam: names) {
            System.out.println(nam);
        }


    }

}


