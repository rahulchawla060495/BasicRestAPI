import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringRepetingCharacter {
 public static void main(String[] args)
 {
	 String input="deepak";
	 HashMap<String,String> hmp=new LinkedHashMap<String,String>();
	 for(int i=0;i<input.length();i++)
	 {
		 if(hmp.containsKey(String.valueOf(input.charAt(i))))
		 {
			 hmp.put(String.valueOf(input.charAt(i)),"false");
		 }
		 else
		 {
			 hmp.put(String.valueOf(input.charAt(i)),"true");
		 }
	 }
	 for(String key :hmp.keySet())
	 {
		 if(hmp.get(key).equals("true"))
		 {
			System.out.println(key);
			return;
		 }
	 }
 }
}
