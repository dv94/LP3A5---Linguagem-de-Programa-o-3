package Atividade3;

import java.util.concurrent.RecursiveAction;


public class Atividade_3 extends RecursiveAction {
	
	private int[] lista; //lista que será ordenado
	  private int comeco; //índice de início
	  private int fim; //íncide do fim

	  //ordena o array da lista por completo
	  public Atividade_3(int[] array) {
	    this.lista = array;
	    comeco = 0;
	    fim = array.length - 1;
	  }

	  //ordena o sub lista do índice 'inicio' até 'fim'
	  public Atividade_3(int[] array, int comeco, int fim) {
	    this.lista = array;
	    this.comeco = comeco;
	    this.fim = fim;
	  }

	  
	  //executa o Quicksort em paralelo com Fork/Join
	  @Override
	  protected void compute() {
	    if(comeco < fim){
	      int pontoZero = partition(lista, comeco, fim); // pontoZero serve como flag do Join
	      invokeAll(new Atividade_3(lista, comeco, pontoZero), //realiza as chamadas recursivas em paralelo do fork
	                new Atividade_3(lista, pontoZero + 1, fim)); //realiza as chamadas recursivas em paralelo do fork
	    }
	  }

	  //Método de partição
	  private int partition(int[] array, int menor, int maior) {
	    int pontoZero = array[menor]; //a flag é um elemento inicial
	    int i = menor - 1; //índice i irá percorrer o array da direita para a esquerda
	    int j  = maior + 1; //índice j irá percorrer o array da esquerda para a direita
	    while (true){ //O loop irá parar quando os índices alcançarem seus limites
	      do { 
	        i++;
	      }
	      
	      /*
	       * Este laço irá parar quando encontrar algum elemento
           * à esquerda que é maior que o pontoZero, pois ele deveria estar na
           * partição direita
	       * -------------------------------------------------------
           * Esse laço irá parar quando encontrar algum elemento
           * à direira que é menor ou igual ao pontoZero, pois ele deveria estar na
           * partição esquerda
           */
	      
	      while (array[i] < pontoZero);

	      do {
	        j--;
	      }
	      while (array[j] > pontoZero);
	      if (i >= j)
	        return j;

	      //serve para indicar se os índices não passem o limite das troca-os de posição
	      trocar(array, i, j);
	    }
	  }

	  //método trocar auxiliar para realizar as trocas de elementos
	  private void trocar(int[] array, int i, int j) {
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	  }

}
