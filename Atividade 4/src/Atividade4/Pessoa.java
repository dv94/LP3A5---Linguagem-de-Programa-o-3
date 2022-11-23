package Atividade4;

public class Pessoa {
	
	 private String nome;
	 private int idade;
	 private String cpf;
	    


	    public Pessoa(String nome, int idade, String cpf) {
	        this.nome = nome;
	        this.idade = idade;
	        this.cpf = cpf;
	    }

	    public Pessoa(String nome, int idade) {
	        this(nome, idade, "");
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

}
