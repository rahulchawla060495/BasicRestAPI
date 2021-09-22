
public class SecondMax {
public static void main(String[] args)
{
int[] arr= {1,5,7,8,12};
int max=-1;
int secondMax=-1;
for(int i=0;i<arr.length;i++)
{
 if(arr[i]>max)
 {
	 if(max!=-1)
	   secondMax=max;
	 max=arr[i];
 }
 	 
}
System.out.print(secondMax);
}

}
