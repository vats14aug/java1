//sum of array elements
import java.util.Scanner;
public class Array2
{
	public static void main(String []args)
	{	Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		int sum=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		System.out.println(" the array elements are");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		for(int i=0;i<a.length;i++)
		sum=sum+a[i];
		System.out.println(" the sum of array elements are"+sum);
		
	}
	

}
