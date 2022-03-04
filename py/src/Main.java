import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	String a ="richardduenas";
	char[] b= a.toCharArray();
	Map<Character, Integer> counter= new HashMap<>();
		for(char c:b) {
		if(counter.containsKey(c))
			counter.put(c, counter.get(c)+1);
		else
			counter.put(c, 1);
	}
	
	System.out.println(counter);
	
}
}
