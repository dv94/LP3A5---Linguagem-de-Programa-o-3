package Atividade5;

import java.util.Optional;

public class Atividade_5 {
	
	 private static void optionOf(Integer valor) {
	        try {
	            Optional<Object> op = Optional.of(10);
	            System.out.println(op);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void optionOfNullable(Integer valor) {
	        try {
	            Optional<Object> op = Optional.ofNullable(11);
	            System.out.println(op);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void optionFilter(Integer valor) {
	        try {
	            Optional<Object> op = Optional.of("test");
	            System.out.println(op.filter(o -> o == "test"));
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void optionOrElse(Object valor) {
	        try {
	            Optional<Object> op = Optional.ofNullable(12);
	            System.out.println(op.orElse("O valor é null"));
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void optionOrElseGet(Object valor) {
	        try {
	            Optional<Object> op = Optional.ofNullable(valor);
	            System.out.println(op.orElseGet(() -> {
	                String check = "entrou o opcional";
	                return check;
	            }));
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void optionOrElseThrow(Object valor) {
	        try {
	            Optional<Object> op = Optional.ofNullable(null);
	            System.out.println(op.orElseThrow(IllegalArgumentException::new));
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	    
		 public static void main(String args[]) {
		        final Integer variavel = null;
		        optionOf(variavel);
		        optionOfNullable(variavel);
		        optionFilter(variavel);
		        optionOrElse(variavel);
		        optionOrElseGet(variavel);
		        optionOrElseThrow(variavel);
		    }

}
