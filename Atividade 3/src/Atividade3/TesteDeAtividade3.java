package Atividade3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;


public class TesteDeAtividade3 {
	
	public static void main(String[] args) {
		int[] lista = new int[10];
		
	    Random rand = new Random();
	    
	    for (int i = 0; i < lista.length; i++) lista[i] = rand.nextInt(51);

	    System.out.println("Lista desordenada = " + Arrays.toString(lista));
	    
	    Atividade_3 quickSort = new Atividade_3(lista);
	    ForkJoinPool pool = new ForkJoinPool();
	    pool.invoke(quickSort);
	    pool.shutdown();
	    
	    System.out.println("Lista ordenada = " + Arrays.toString(lista));
	  }

}
