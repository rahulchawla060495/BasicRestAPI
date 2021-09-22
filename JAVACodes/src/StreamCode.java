import java.util.ArrayList;
import java.util.List;

public class StreamCode {

	public static void main(String[] args)
	{
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(2);
		lst.add(3);
		lst.add(10);
		
		int result=lst.stream().filter(i -> i%2 == 0).mapToInt(i -> i).sum();
	    System.out.println(result);	
	    HashMap hmp=new HashMap();
	}
}
