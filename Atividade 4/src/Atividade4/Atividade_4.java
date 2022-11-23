package Atividade4;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Atividade_4 {
	
	
	public static void main(String[] args) {
        List<String> collection = asList("Davi", "Amanda", "Lorena", "André", "Emerson", "Adenilson", "Maria", "Alexandre");
        System.out.println(transform(collection));
        System.out.println(collection);
        System.out.println(alterar(collection));

        
    }//Collection contador
    public static Long transform(List<String> collection) {
        return collection.stream().collect(Collectors.counting());
        
    }//Collection contador com Join
    public static String alterar(List<String> collection) {
        return collection.stream().collect(Collectors.joining(" - "));
    }
    
}


