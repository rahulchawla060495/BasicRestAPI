import java.util.HashMap;

public class minMax {
  public static void main(String args[])
  {
	  String str="my as a aaaaaaa mom madam";
	  HashMap<Character,Integer> hmp=new HashMap<Character,Integer>();
	  for(int i=0;i<str.length();i++)
	  {
		if(hmp.containsKey(str.charAt(i))) 
		{
			hmp.put(str.charAt(i), hmp.get(str.charAt(i))+1);
		}
		else
		{
			hmp.put(str.charAt(i), 1);
		}
	  }
	  int min=Integer.MAX_VALUE;
	  int max=0;
	 for(char s:hmp.keySet())
	 {
		 if(hmp.get(s)<min)
		 {
			 min=hmp.get(s);
		 }
		 
		 if(hmp.get(s)>max)
		 {
			 max=hmp.get(s);
		 }
	 }
	 
	 //print minimum
	 System.out.println("minimum : ");
	 for(char s:hmp.keySet())
	 {
		if(hmp.get(s)==min)
		{
			System.out.print(s);
		}
	 }
	 System.out.println("maximum : "); 
	 for(char s:hmp.keySet())
	 {
		if(hmp.get(s)==max)
		{
			System.out.print(s);
		}
	 }
  }
}
