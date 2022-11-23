package Atividade2;

public class Atividade_2 {
	
	public static volatile Object lock = new Object(); 
	public static volatile int produtos = 0;
	
	public static void main(String[] args) {
		Produtor p1 = new Produtor(1);
		p1.start();
		Consumidor c1 = new Consumidor(1);
		c1.start();
	}
}
class Produtor extends Thread {
	int id = 0;
	Produtor(int novoId ) {
		this.id = novoId;
	}
	public void run() {
		for(int i = 0; i < 10; i ++ ) {	
			
		
				synchronized( Atividade_2.lock )
				{	
					if(Atividade_2.produtos < 10)
						Atividade_2.produtos = Atividade_2.produtos + 1;
					else {
						notify();
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("\nProdutor " + id + " em estoque = " + Atividade_2.produtos);
				}	
		}
	}
}
class Consumidor extends Thread {
	int id = 0;
	Consumidor(int novoId) {
		this.id = novoId;
	}
	public void run() {
		for(int i = 0; i < 10; i++) {			
			synchronized( Atividade_2.lock )
			{	
				
				if(Atividade_2.produtos > 0)
					Atividade_2.produtos = Atividade_2.produtos - 1;
				else {
					notify();
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("\nConsumidor " + id + " do estoque = " + Atividade_2.produtos);
			}
		}
	}

}
