import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Q10 {

	/*
	 Is it mandatory for a lambda expression to have parameters?
	 A)no
	  
	  
	 */
	Runnable runnable = () -> {
	    System.out.println("This is a lambda expression with no parameters");
	};
	
	Consumer<String> consumer = (message) -> {
	    System.out.println("Received message: " + message);
	};
	
	BiFunction<Integer, Integer, Integer> sum = (a, b) -> {
	    return a + b;
	};
}
