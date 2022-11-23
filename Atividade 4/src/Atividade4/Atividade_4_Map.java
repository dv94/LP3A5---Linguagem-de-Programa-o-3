package Atividade4;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Atividade_4_Map {
	
	 public static void main(String[] args) {
	        Pessoa lorena = new Pessoa("Lorena", 22);
	        Pessoa amanda = new Pessoa("Amanda", 30);
	        Pessoa matilde = new Pessoa("Matilde", 3);
	        Pessoa eleonor = new Pessoa("Eleonor", 44);
	        Pessoa davi = new Pessoa("Davi", 63);
	        Pessoa lucrecia = new Pessoa("Lucrecia", 12);
	        List<Pessoa> collection = asList(lorena, amanda, matilde, eleonor, davi, lucrecia);
	        System.out.println(transform(collection));
	    }
	    public static Map<String, Integer> transform(List<Pessoa> collection) {
	        return collection.stream().filter(pessoa -> pessoa.getIdade() < 35).collect(Collectors.toMap(Pessoa::getNome, Pessoa::getIdade));
	    }

}
