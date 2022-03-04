import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Py {
	
public static void main(String[] args) {
	
	int j=1; 
	int r=0;
	int current= 0;
	for(int t= 1;j<501;t++) {
		if(isTriangularNumber(t)) {
			current=t;
		for(int i=1; i<current/2;i++) {
			System.out.println(current+": div"+j);
			if(current%i==0)
				j++;
			if(j>500) {
				System.out.println("found");
				r=current;
				break;
			}
		}
		}
		if(j>500)
			break;
		else
		j=1;
	}
		
		
		System.out.println(r);
	
}
public static boolean isTriangularNumber( int x)
{
    if (x < 0)
        return false;

    int n = (int) Math.sqrt(2 * x);
    return n * (n + 1) / 2 == x;
}

}
