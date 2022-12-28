package com.bulbul.boilerplate.common.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

    public static void main(String[] args) {

        //count empty strings
        List<String> strList = Arrays.asList("abc","","bcd","","defg","jk");
        long totalElm = strList.stream()
                .filter(x->x.isEmpty())
                .count();

        System.out.printf("List %s has %d empty element %n",strList,totalElm);

        // Count String with length more than 3
        long num = strList.stream()
                .filter(x->x.length()>3)
                .count();
        System.out.printf("List %s has %d strings of length more than 3 %n",strList,num);

        //Count number of String which startWith "a"
        long count = strList.stream()
                .filter(x ->x.startsWith("a"))
                .count();
        System.out.println("start with a total is : "+count);

        // Convert String to Uppercase and join them using comma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(G7Countries);

    }
}
