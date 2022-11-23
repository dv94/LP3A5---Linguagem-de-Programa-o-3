package Atividade4;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Atividade_4_List {
	
	public static void main(String[] args) {
        List<List<String>> collection = asList(asList("Davi", "Amanda", "Lorena", "André", "Emerson", "Adenilson", "Maria", "Alexandre"));
        System.out.println(transform(collection));
    }
    public static List<String> transform(List<List<String>> collection) {
        return collection.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
    }

}
