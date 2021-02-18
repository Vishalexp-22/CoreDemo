import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=0,i,sum=0;
	
	System.out.println("Enter the no. of elements");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the values in array");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
	System.out.println("Sum is "+sum);

	}

}
